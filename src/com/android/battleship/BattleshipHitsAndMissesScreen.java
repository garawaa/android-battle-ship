package com.android.battleship;

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
	
	boolean CheckForHit (int Array[][], int x, int y)
	{
		int move;
		
		move = Array[x][y];
		Log.v(msg,"move = " + move);
		
		if (move == 1)
		{
			return true;
		}
		
		else
		{
			return false;
		}		 
	}
	
}
