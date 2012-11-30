package com.android.battleship;

import java.util.Set;

import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This screen will manage the bluetooth pairing and may turn into a game
 * management screen with different paired devices.
 * 
 * @author DPrinslow
 * 
 */
public class BluetoothManagerScreen extends ListActivity {
	private static final int REQUEST_ENABLE_BT = 2;

	private ArrayAdapter mArrayAdapter;
	private ListView listView;
	@SuppressWarnings("unchecked")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mArrayAdapter = new ArrayAdapter(this,
				android.R.layout.simple_list_item_1);
		this.setListAdapter(mArrayAdapter);
		
		listView = getListView();
		listView.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> viewAdapter, View view, int position,
					long arg3) {
					TextView textView = (TextView)view;
					String deviceMac = (String)textView.getText();
					String[] deviceMacArray = deviceMac.split("\n");
					String macAddress = deviceMacArray[1];
					String deviceName = deviceMacArray[0];
					
					//BluetoothClient btClient = new BluetoothClient(macAddress, getApplicationContext(), handler);
					//btClient.start();
			}
			
		});
		
		BluetoothAdapter mBluetoothAdapter = BluetoothAdapter
				.getDefaultAdapter();
		if (mBluetoothAdapter == null) {
			mArrayAdapter.add("Does not support Bluetooth");
		}

		if (!mBluetoothAdapter.isEnabled()) { // Request user enable Bluetooth
			Intent enableBtIntent = new Intent(
					BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
		}

		Set<BluetoothDevice> pairedDevices = mBluetoothAdapter
				.getBondedDevices(); // Blocks till paired devices found

		if (pairedDevices.size() > 0) { // Paired devices
			mArrayAdapter.add("Paired devices");

			for (BluetoothDevice device : pairedDevices)
				// Loop through paired devices
				mArrayAdapter.add(device.getName() + "\n" + // Display name and address
						device.getAddress());
		}

		mArrayAdapter.add("Discovered devices");

		final BroadcastReceiver mReceiver = new BroadcastReceiver() { // BroadcastReceiver
																		// for
																		// ACTION_FOUND
			public void onReceive(Context context, Intent intent) {
				String action = intent.getAction();

				if (BluetoothDevice.ACTION_FOUND.equals(action)) { // When
																	// discovery
																	// finds a
																	// device
																	// Get the
																	// BluetoothDevice
																	// object
																	// from the
																	// Intent
					BluetoothDevice device = intent
							.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
					// Display name and address
					mArrayAdapter.add(device.getName() + "\n"
							+ device.getAddress());
				}
			}
		};
		// Register the BroadcastReceiver
		IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
		registerReceiver(mReceiver, filter); // Unregister during onDestroy

		mBluetoothAdapter.startDiscovery();
	}
}
