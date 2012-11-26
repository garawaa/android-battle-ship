package com.android.battleship;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.UUID;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;

class BluetoothClient extends Thread {

	BluetoothAdapter mBluetoothAdapter;
	private String data = null;

	final Handler handler;
	final Runnable updateUI;

	public BluetoothClient(Handler handler, Runnable updateUI) {
		this.handler = handler;
		this.updateUI = updateUI;

		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	}

	public String getBluetoothClientData() {
		return data;
	}

	public void run() {
		BluetoothSocket clientSocket = null;
		// Client knows the server MAC address
		BluetoothDevice mmDevice = mBluetoothAdapter
				.getRemoteDevice("28:CF:DA:D6:41:5D");

		try {
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

			handler.post(updateUI);
		} catch (Exception e) {
		}
	}
}