package com.android.battleship;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.UUID;

import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;

class BluetoothClient extends Thread {

	BluetoothAdapter mBluetoothAdapter;
	private String data = null;
	private String macAddress = null;
	private Context context;
	Handler handler;
	Runnable updateUI;

	public BluetoothClient(Handler handler, Runnable updateUI, String macAddress) {
		this.handler = handler;
		this.updateUI = updateUI;
		this.macAddress = macAddress;
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	}
	
	public BluetoothClient(String macAddress, Context context){
		this.macAddress = macAddress;
		this.context = context;
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	}

	public String getBluetoothClientData() {
		return data;
	}

	public void run() {
		BluetoothSocket clientSocket = null;
		BluetoothDevice mmDevice = null;
		
		// Client knows the server MAC address. Set in onitemclicklistener in bluetooth manager.
		try {
			mmDevice = mBluetoothAdapter
					.getRemoteDevice(macAddress);
		
			// UUID string same used by server
			clientSocket = mmDevice.createRfcommSocketToServiceRecord(UUID
					.fromString("00001101-0000-1000-8000-00805F9B34FB"));

			mBluetoothAdapter.cancelDiscovery(); // Cancel, discovery slows
													// connection
			clientSocket.connect();

			DataInputStream in = new DataInputStream(
					clientSocket.getInputStream());
			DataOutputStream out = new DataOutputStream(
					clientSocket.getOutputStream());

			out.writeUTF("Hello"); // Send to server
			
			data = in.readUTF(); // Read from server

			handler.post(new Runnable(){
				public void run() {
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
					alertDialogBuilder.setTitle("Bluetooth Shit");
					alertDialogBuilder
							.setMessage("Mac Addr is " + macAddress)
							.setCancelable(false)
							.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
					
					AlertDialog alertDialog = alertDialogBuilder.create();
					alertDialog.show();					
				}
				
			});
		} catch (Exception e) {
		}
	}
}