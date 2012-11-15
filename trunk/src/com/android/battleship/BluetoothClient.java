package com.android.battleship;

import java.io.IOException;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

public class BluetoothClient extends Thread {
    private final BluetoothSocket mmSocket = null;
    private final BluetoothDevice mmDevice = null;
 
    public BluetoothClient(BluetoothDevice device) {
        // Use a temporary object that is later assigned to mmSocket,
        // because mmSocket is final
        BluetoothSocket tmp = null;
        //mmDevice = device;
 
        // Get a BluetoothSocket to connect with the given BluetoothDevice
        try {
            // MY_UUID is the app's UUID string, also used by the server code
            //TODO: tmp = device.createRfcommSocketToServiceRecord(MY_UUID);
        } catch (Exception e) { 
        	
        }
       // mmSocket = tmp;
    }
 
    public void run() {
        // Cancel discovery because it will slow down the connection
        //TODO: mBluetoothAdapter.cancelDiscovery();
 
        try {
            // Connect the device through the socket. This will block
            // until it succeeds or throws an exception
            mmSocket.connect();
        } catch (IOException connectException) {
            // Unable to connect; close the socket and get out
            try {
                mmSocket.close();
            } catch (IOException closeException) { }
            return;
        }
 
        // Do work to manage the connection (in a separate thread)
       //TODO: manageConnectedSocket(mmSocket);
    }
 
    /** Will cancel an in-progress connection, and close the socket */
    public void cancel() {
        try {
            mmSocket.close();
        } catch (IOException e) { }
    }
}
