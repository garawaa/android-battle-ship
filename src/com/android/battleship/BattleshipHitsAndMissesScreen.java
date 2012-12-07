package com.android.battleship;

import java.util.ArrayList;


import com.android.battleship.objects.Ship;

import android.app.Activity;
import android.util.Log;

/**
 * This screen will show where you've tried or hit your opponent
 * 
 * @author DPrinslow
 *
 */
public class BattleshipHitsAndMissesScreen extends Activity{

	String msg;
	
	/** Check the array of each ship object to see if the given move hit one of the ships; If it did hit a ship, 
	 * the currHits for that ship will be incremented. Each time a ship is hit, check to see if the hit sunk it.
	 * @param ships
	 * @param move
	 * @return boolean
	 */
	boolean checkForHit(Ship[] ships, String move){
		
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
					// Check to see if a ship was sunk
					if(ships[i].getCurrHits() >= ships[i].maxHits){
						ships[i].isSunk = true;
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
	boolean checkForWin(Ship[] ships){
		
		// If there is a ship that is not sunk, return false
		for(int i = 0; i < ships.length; i++){
			if(!ships[i].isSunk){
				return false;
			}
		}
		// No ship found that has not been sunk
		return true;
	}
}
