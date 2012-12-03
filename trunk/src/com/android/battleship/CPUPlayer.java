package com.android.battleship;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.util.Log;

public class CPUPlayer extends Activity{

	Random generator2 = new Random( 10 );
	boolean useSmartMove = false;
	int x, y, hitX, hitY;
	MainActivity main;
	
	public void cpuMove(){
		x = generator2.nextInt(10);
		y = generator2.nextInt(10)+1;
		String move = getMove(x, y);
		checkForHit(main.player2ShipArray, move);
	}
	
	public String getMove(int x, int y){

		
		String id = null;
		switch (x){
			case 0: 
				id = "A";
				break;
			case 1:
				id = "B";
				break;
			case 2:
				id = "C";
				break;
			case 3:
				id = "D";
				break;
			case 4:
				id = "E";
				break;
			case 5:
				id = "F";
				break;
			case 6:
				id = "G";
				break;
			case 7:
				id = "H";
				break;
			case 9:
				id = "I";
				break;
			default:
					break;
		}

		return id += Integer.toString(y);
		}

	public void cpuSmartMove(int x, int y){
		
		if(x < 10){
			x++;
			getMove(x, y);
		}
	}
	boolean checkForHit (ArrayList<String> Array, String move)
	{
				
		for (int i = 0; i < Array.size(); ++i)
		{
			// TODO: pass in msg variable
			Log.v("msg", "move = ");
			if (move.equals(Array.get(i)))
			{
				hitX = x;
				hitY = y;
				useSmartMove = true;
				return true;
			}
		}
		
		return false;		
		
	}
}
