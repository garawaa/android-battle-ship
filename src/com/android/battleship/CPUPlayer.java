package com.android.battleship;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.util.Log;

public class CPUPlayer extends Activity{

	Random generator = new Random( 10 );
	boolean useSmartMove = false;
	int[] thisMove = new int[2];
	int x, y, lastX, lastY, hitX, hitY;
	int[] hitGuesses = new int[4];
	String orientation = "unknown";
	MainActivity main;
	
	
	public void computerMove() { // this is the "main" function to facilitate CPU logic
		if (useSmartMove == false) {
			getCpuRandomMove();
		}
		
		
		String move = getMove(x, y);
		checkForHit(MainActivity.player2ShipArray, move);
	}
	
	public getCpuRandomMove(){
		x = generator.nextInt(10);
		y = generator.nextInt(10)+1;

	}
	
	//TODO: need to create computer ability to set ships.
	
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
			case 8:
				id = "I";
				break;
			case 9:
				id = "J";
				break;
			default:
					break;
		}

		return id += Integer.toString(y);
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
				lastX = x;
				lastY = y;
				useSmartMove = true;
				return true;
			}
		}
		
		return false;		
		
	}
	
	public void cpuSmartMove(){
		
		Random generator2 = new Random (4);
		int guess = generator2.nextInt();
		
		if (orientation.equals("vertical")){ 	//once ship orientation is set, this changes the random
			if ( (guess + 2) % 2 == 1){			//number to modify only vertical (even) cases 0 or 2
				guess--;
			}
		}
		if (orientation.equals("horizontal")){	//once ship orientation is set, this changes the random
			if ( (guess + 2) % 2 == 0){			//number to modify only horizontal (odd) cases 1 or 2
					guess--;
			}
		}
		
		
		if (hitGuesses[guess] == 1) { // if the random guess has already been tried, gets new random number
			cpuSmartMove();
		}
		
		else {
			hitGuesses[guess] = 1; // modifies array to show that the try was attempted.
		
			switch (guess){
			case 0: // test top adjacent space
				
				y = lastY - 1;
				if ( y >= 0 ) { 
					getMove( x , y);
					lastX = x;
					lastY = y;
					orientation = "vertical";
				}
				else {
					cpuSmartMove();
				}
				
				break;
			
			case 1: // test right adjacent space
				
				x = lastX + 1;
				if ( x <= 10 ) { 
					getMove( x , y);
					lastX = x;
					lastY = y;
					orientation = "horizontal";
				}
				else {
					cpuSmartMove();
				}
				
				break;
				
			case 2: // test bottom adjacent space
				
				y = lastY + 1;
				if ( y <= 10 ) { 
					getMove( x , y);
					lastX = x;
					lastY = y;
					orientation = "vertical";
				}
				else {
					cpuSmartMove();
				}
				break;	
			
			case 3: // test left adjacent space
				
				x = lastX - 1;
				if ( x >= 0 ) { 
					getMove( x , y);
					lastX = x;
					lastY = y;
					orientation = "horizontal";
				}
				else {
					cpuSmartMove();
				}
				break;
			}
		}
	}
}

