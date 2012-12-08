package com.android.battleship;

import com.android.battleship.objects.Ship;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * This screen will show where you've tried or hit your opponent
 * 
 * @author DPrinslow
 *
 */
public class BattleshipHitsAndMissesScreen extends Activity{

	String msg;
	// Initialize variables for a toast
	CharSequence toastText = "Hello toast!";
	int duration = Toast.LENGTH_SHORT;
	Context context;
	Toast toast;
	Toast toast2;
	
	public void setContext(Context ctext){
		this.context = ctext;
	}
	
	/** Check the array of each ship object to see if the given move hit one of the ships; If it did hit a ship, 
	 * the currHits for that ship will be incremented. Each time a ship is hit, check to see if the hit sunk it.
	 * @param ships
	 * @param move
	 * @return boolean
	 */
	protected boolean checkForHit(Ship[] ships, String move, int player){
		
		// Loop through ships
		for(int i = 0; i < ships.length; i++){
			// Loops through cells of each ship
			for (int j = 0; j < ships[i].getShipArray().size(); j++)
			{
				if (move.equals(ships[i].getShipArray().get(j)))
				{
					Log.v(" ", "Looping through ship cells: ship[" + i + "].getShipArray().get(" + j + ") : " + ships[i].getShipArray().get(j));
					Log.v(msg, "Move matched one of the elements in the shipArray");
					// Add a hit to the ship
					ships[i].setCurrHits(ships[i].getCurrHits() + 1) ;
					displayToast(player, ships[i].getShipArray().get(j), "hit");
					// Check to see if a ship was sunk
					if(ships[i].getCurrHits() >= ships[i].maxHits){
						ships[i].isSunk = true;
						displayToast(player, ships[i].name);
						Log.v(msg, ships[i].name + " was sunk!!");
						
					}
					return true;
				}
			}
		}
		return false;
	}
	
	/** This method will be used in the event that a successful hit was made and will check to see if all of the
	 * opponents ships have been sunk.
	 * @return
	 */
	protected boolean checkForWin(Ship[] ships){
		
		// If there is a ship that is not sunk, return false
		for(int i = 0; i < ships.length; i++){
			if(!ships[i].isSunk){
				return false;
			}
		}
		// No ship found that has not been sunk
		return true;
	}
	
	private void displayToast(int player, String shipName){
		try{
			String toastText = "";
			if(player == 1){
				toastText = "You sunk the CPU's " + shipName + "!";
			}
			else if(player == 2){
				toastText = "The CPU sunk your " + shipName + "!";
			}
			else{
				Log.v(msg, "Invalid playerNum passed to displayToast()");
			}
			toast2 = Toast.makeText(context, toastText, duration);
			toast2.show();
		}catch(Exception e){
			Log.v(msg, "Exception trying to display toast (ship sunk): ", e);
		}
	}
	
	// When the CPU makes a hit it displays a null pointer exception???
	private void displayToast(int player, String id, String hit){
		try{
			String toastText = "";
			if(player == 1){
				toastText = "You hit the CPU's ship at: " + id + "!";
			}
			else if(player == 2){
				toastText = "The CPU hit your ship at: " + id + "!";
			}
			else{
				Log.v(msg, "Invalid playerNum passed to displayToast()");
			}
			toast = Toast.makeText(context, toastText, duration);
			toast.show();
		}catch(Exception e){
			Log.v(msg, "Exception trying to display toast (hit): ", e);
		}
	}
	
	/** This method will be use primarily for the CPU; The CPU needs to be able to detect when a ship has sunk so that
	 * it can adjust its strategy appropriately.
	 * @param ships
	 * @return numSunk
	 */
	protected int getNumShipsSunk(Ship[] ships){
		int numSunk = 0;
		// Loop through array of ships and check how many are sunk
		for(int i = 0; i < ships.length; i++){
			if(ships[i].isSunk){
				numSunk += 1;
			}
		}
		return numSunk;
	}
}
