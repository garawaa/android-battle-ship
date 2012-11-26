package com.android.battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

/**
 * This screen will manage the bluetooth pairing and may turn into a game management screen with different
 * paired devices.
 * 
 * @author DPrinslow
 *
 */
public class BluetoothManagerScreen extends Activity {
	
	private BluetoothAdapter mBluetoothAdapter;
	private ArrayAdapter<String> mArrayAdapter;
	private int REQUEST_ENABLE_BT = 1;
	private ScrollView scrollView;
	private ListView listView;
	private ListAdapter listAdapter;
	private List<Button> buttonList = new ArrayList<Button>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bluetooth_management_layout);
		
		Button scanBluetooth = (Button)findViewById(R.id.scan_bluetooth);
		scrollView = (ScrollView)findViewById(R.id.device_list);
		listView = (ListView)findViewById(R.id.listView);
		scanBluetooth.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				setUpBluetoothConnection();
				//TODO: check to see if a pairing is already available
				enableDiscoverability();
				checkPairedDevices();
				registerBroadcastReceiver();				
			}			
		});
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			  public void onItemClick(AdapterView<?> parent, View view,
			    int position, long id) {
			    Toast.makeText(getApplicationContext(),
			      "Click ListItem Number " + position, Toast.LENGTH_LONG)
			      .show();
			  }
			});
		
	}
	/**
	 * This method checks for a bluetooth adapter on the phone, checks to see if
	 * its enabled, and allows the user to enable it from the app.
	 */
	private void setUpBluetoothConnection() {
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		if (mBluetoothAdapter == null) {
			// device does not support bluetooth
			new AlertDialog.Builder(this)
					.setTitle("ERROR")
					.setMessage("Your device is not bluetooth capable.")
					.setPositiveButton("Ok",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									finish();
								}
							}).show();
		} else {
			if (!mBluetoothAdapter.isEnabled()) {
				Intent enableBtIntent = new Intent(
						BluetoothAdapter.ACTION_REQUEST_ENABLE);
				startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
			} else {
				mBluetoothAdapter.startDiscovery();
			}
		}
	}

	/**
	 * Checks to see if a device pairing is already known so we dont have to
	 * pair again
	 */
	private void checkPairedDevices() {
		Set<BluetoothDevice> pairedDevices = mBluetoothAdapter
				.getBondedDevices();
		// If there are paired devices
		if (pairedDevices.size() > 0) {
			// Loop through paired devices
			for (BluetoothDevice device : pairedDevices) {
				// Add the name and address to an array adapter to show in a ListView
				mArrayAdapter.add(device.getName() + "\n" + device.getAddress());
			}
		}
	}
	
	/*Caution: Performing device discovery is a heavy procedure for the Bluetooth adapter and
	 *  will consume a lot of its resources. Once you have found a device to connect, be certain 
	 *  that you always stop discovery with cancelDiscovery() before attempting a connection.
	 *   Also, if you already hold a connection with a device, then performing discovery can
	 *    significantly reduce the bandwidth available for the connection, so you should not 
	 *    perform discovery while connected.
	 */
	private void registerBroadcastReceiver(){
		// Create a BroadcastReceiver for ACTION_FOUND
		Context context = this.getApplication().getApplicationContext().getApplicationContext();
		final BroadcastReceiver mReceiver = new BroadcastReceiver() {
		    public void onReceive(Context context, Intent intent) {
		        String action = intent.getAction();
		        
		        // When discovery finds a device
		        if (BluetoothDevice.ACTION_FOUND.equals(action)) {
		            // Get the BluetoothDevice object from the Intent
		            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
		            // Add the name and address to an array adapter to show in a ListView
		            mArrayAdapter.add(device.getName() + "\n" + device.getAddress());
		            Button button = new Button(context);
		            button.setText(device.getName() + "\n" + device.getAddress());
		            buttonList.add(button);
		            listView.addView((View) buttonList);
		        }
		    }
		};
		// Register the BroadcastReceiver
		IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
		registerReceiver(mReceiver, filter); // Don't forget to unregister during onDestroy		
	}
	
	/**
	 * Enable bluetooth discoveability
	 */
	private void enableDiscoverability(){
		Intent discoverableIntent = new
				Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
		discoverableIntent.putExtra(
				BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
		startActivity(discoverableIntent);
	}
}
