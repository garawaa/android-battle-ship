package com.android.battleship;

import java.io.IOException;
import java.util.UUID;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;

public class BluetoothServer extends Thread {
	
    private final BluetoothServerSocket mmServerSocket;
    private BluetoothAdapter mBluetoothAdapter;
    private String NAME = "";
    private UUID MY_UUID = null;
    
    public BluetoothServer() {
        // Use a temporary object that is later assigned to mmServerSocket,
        // because mmServerSocket is final
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID is the app's UUID string, also used by the client code
            tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);
        } catch (Exception e) { 
        	
        }
        mmServerSocket = tmp;
    }
    
    public void run() {
        BluetoothSocket socket = null;
        // Keep listening until exception occurs or a socket is returned
        while (true) {
            try {
                socket = mmServerSocket.accept();
            } catch (IOException e) {
                break;
            }
            // If a connection was accepted
            if (socket != null) {
                // Do work to manage the connection (in a separate thread)
                //TODO: manageConnectedSocket(socket);
                try {
					mmServerSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
                break;
            }
        }
    }
 
    /** Will cancel the listening socket, and cause the thread to finish */
    public void cancel() {
        try {
            mmServerSocket.close();
        } catch (IOException e) { }
    }
}