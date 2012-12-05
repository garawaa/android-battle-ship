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
	
	boolean CheckForHit (ArrayList<String> Array, String move)
	{
				
		for (int i = 0; i < Array.size(); ++i)
		{
			Log.v(msg, "move = ");
			if (move.equals(Array.get(i)))
			{
				return true;
			}
		}
		
		return false;		
		
	}
	
	boolean CheckForHit(Ship[] ships, String move){
		
		// Loop through ships
		for(int i = 0; i < ships.length; i++){
			// Loops through cells of each ship
			for (int j = 0; j < ships[i].getShipArray().size(); j++)
			{
				if (move.equals(ships[i].getShipArray().get(j)))
				{
					Log.v(msg, "Move matched one of the elements in the shipArray");
					return true;
				}
			}
			
		}
		return false;
	}
	
}
