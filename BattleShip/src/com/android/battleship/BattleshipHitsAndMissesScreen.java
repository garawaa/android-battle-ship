package com.android.battleship;

import java.util.ArrayList;

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
	
}
