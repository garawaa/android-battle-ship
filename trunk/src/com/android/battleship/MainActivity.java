package com.android.battleship;

import java.util.Set;
import android.annotation.TargetApi;
import android.app.ActionBar;
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
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

/**
 * This will be the starting screen for the app. From here we will click a button to open up a bluetooth
 * pairing screen and start a new game.
 * 
 * @author Team Battleship
 *
 */
@TargetApi(11)
public class MainActivity extends Activity {
	
	final Context context = this;
	GameMessages gm = new GameMessages();
	
	private BluetoothAdapter mBluetoothAdapter;
	private ArrayAdapter mArrayAdapter;
	private int REQUEST_ENABLE_BT = 1;
	private String gameInstructions =  "The objective of this game is to place your fleet's ships in your desired position."
			+ "  You can play with a friend or against the computer.  Once your ships are positioned,"
			+ " you will select coordinates for attacking the opponent's fleet and it will be determined"
			+ " whether you hit a ship.  Good luck!";
	private String fireShot = "Select a cell to fire a shot at your opponent's fleet.";

	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		gm.displayMsg(context, gameInstructions, "Game Instructions");
		
		/*
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
		alertDialogBuilder.setTitle("Game Instructions");
		alertDialogBuilder
				.setMessage(
						"The objective of this game is to place your fleet's ships in your desired position."
								+ "  You can play with a friend or against the computer.  Once your ships are positioned,"
								+ " you will select coordinates for attacking the opponent's fleet and it will be determined"
								+ " whether you hit a ship.  Good luck!")
				.setCancelable(false)
				.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
					}
				});
		
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
		*/
		
		
		Button b1;
		Button b2;

		b1 = (Button) findViewById(R.id.gameButton1);
		b2 = (Button) findViewById(R.id.gameButton2);

		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.garnet));

		
		b1.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				setContentView(R.layout.grid_screen);
				gm.displayMsg(context, fireShot, "Fire when ready!");
			}
		});

		b2.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				setContentView(R.layout.grid_screen);
				gm.displayMsg(context, fireShot, "Fire when ready!");
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	/**
	 * This method checks for a bluetooth adapter on the phone, checks to see if
	 * its enabled, and allows the user to enable it from the app.
	 */
	private void setUpBluetoothConnection() {
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		if (mBluetoothAdapter == null) {
			// device does not support bluetooth
			new AlertDialog.Builder(MainActivity.this)
					.setTitle("Your device is not bluetooth capable.")
					.setMessage("")
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
		final BroadcastReceiver mReceiver = new BroadcastReceiver() {
		    public void onReceive(Context context, Intent intent) {
		        String action = intent.getAction();
		        // When discovery finds a device
		        if (BluetoothDevice.ACTION_FOUND.equals(action)) {
		            // Get the BluetoothDevice object from the Intent
		            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
		            // Add the name and address to an array adapter to show in a ListView
		            mArrayAdapter.add(device.getName() + "\n" + device.getAddress());
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