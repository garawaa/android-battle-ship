/* This class handles all CPU aspects of single player game.
 * 
 * TODO: Create method(s) to set computer ships
 * 		 Create Array to track all computer attempts so attempts are not re-tried.
 * 		 Integrate into Single Player gameplay
 * 
 * Updated: Mon, 12/3 at 4:45 PM by Matt
 * 
 */


package com.android.battleship;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.util.Log;

public class CPUPlayer extends Activity{

	private Random generator = new Random( 10 );
	private int x, y, lastX, lastY, firstHitX, firstHitY, direction;
	private int[] hitGuesses = new int[4];
	private boolean attackSuccess;
	final int random = 0;
	final int directionFind = 1;
	final int directionFollow = 2;
	final int directionChange = 3;
	final int north = 0;
	final int east = 1; 
	final int south = 2;
	final int west = 3;	
	private int strategyState = 0;
	
	//TODO: need to create computer ability to set ships.	
	
	public void computerMove(int shipSunk) { 	// this is the "main" function to facilitate CPU logic
												// needs to be passed an int: 0 for ship not sunk, 1 for ship sunk
		if (shipSunk == 1){						// this will reset the CPU state to random guess attack
			strategyState = random;
		}
		
		
		switch (strategyState){
			case random:
				getCpuRandomMove();
				break;
			
			case directionFind:
				setCpuDirection();
				
				break;
				
			case directionFollow:
				continueAttack();
				
				break;
			case directionChange:
				changeAttackDirection();
				computerMove(0);
				
					
		}
		
		
		String move = getMove(x, y);
		boolean hitSuccess = checkForHit(MainActivity.player1ShipArray, move);
		strategyAssign(hitSuccess, strategyState);
	}
	
	private void changeAttackDirection() {
		
		lastX = firstHitX;
		lastY = firstHitY;
		switch (direction){
			case north: direction = south;
				break;
			case east: direction = west;
				break;
			case south: direction = north;
				break;
			case west: direction = east;
				break;
		}
		
		continueAttack();
		strategyState = directionFollow;
	}

	private void continueAttack() {
		switch (direction){
		case north:
			
			attackSuccess = attack(north);
			if (attackSuccess == false){
				changeAttackDirection();
			}
			break;
			
		case east:
			
			attackSuccess = attack(east);
			if (attackSuccess == false){
				changeAttackDirection();
			}
			break;	
			
		case south:
			
			attackSuccess = attack(south);
			if (attackSuccess == false){
				changeAttackDirection();
			}
			break;	
				
		case west:
			
			attackSuccess = attack(west);
			if (attackSuccess == false){
				changeAttackDirection();
			}
			break;	
		}
			
		
	}

	private void strategyAssign(boolean hitSuccess, int strategyState2) {
		
		switch (strategyState){
		case random:
			if (hitSuccess = true){
				strategyState = directionFind;
			}
			break;
		
		case directionFind:
			if (hitSuccess = true){
				strategyState = directionFollow;
			}
			
			break;
		/*	
		 *  THIS SWITCH HANDLED IN CONTINUE ATTACK METHOD
		case directionFollow:
			if (hitSuccess = false){
				strategyState = directionChange;
			}
			break;
		/*	
		 * DIRECTION CHANGE SHOULD NOT BE A VALID CASE AT THIS POINT IN CODE *
		case directionChange:
			if (hitSuccess = true){
				strategyState = directionFollow;
			}
			
			break;
			
		*/
	}
		
	}

	private void getCpuRandomMove(){
		x = generator.nextInt(10);
		y = generator.nextInt(10)+1;

	}
	
	private  String getMove(int x, int y){
		
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

	private boolean checkForHit (ArrayList<String> Array, String move)
	{
				
		for (int i = 0; i < Array.size(); ++i)
		{
			// TODO: pass in msg variable
			Log.v("msg", "move = ");
			if (move.equals(Array.get(i)))
			{
				firstHitX = x;
				firstHitY = y;
				lastX = x;
				lastY = y;
				return true;
			}
		}
		
		return false;		
		
	}
	
	private void setCpuDirection(){
		
		Random generator2 = new Random (4);
		int guess = generator2.nextInt();
		
		if (hitGuesses[guess] == 1) { // if the random guess has already been tried, gets new random number
			setCpuDirection();
		}
		
		else {
			hitGuesses[guess] = 1; // modifies array to show that the try was attempted.
		
			switch (guess){
			case north: // test top adjacent space
				
				attackSuccess = attack(north);
				if (attackSuccess == false){
					setCpuDirection();
				}
				break;
			
			case east: // test right adjacent space
				
				attackSuccess = attack(east);
				if (attackSuccess == false){
					setCpuDirection();
				}
				break;
				
			case south: // test bottom adjacent space
				
				attackSuccess = attack(south);
				if (attackSuccess == false){
					setCpuDirection();
				}
				break;
			
			case west: // test left adjacent space
				
				attackSuccess = attack(west);
				if (attackSuccess == false){
					setCpuDirection();
				}
				break;
			}
			
			direction = guess;
		}
	}
	
	private boolean attack(int direction){
		boolean attackCompleted = false;
		switch (direction){
		case north: // test top adjacent space
			
			y = lastY - 1;
			if ( y >= 0 ) { 
				getMove( x , y);
				lastX = x;
				lastY = y;
				attackCompleted = true;
				
			}
			else {
				attackCompleted = false;
			}
			
			
		
		case east: // test right adjacent space
			
			x = lastX + 1;
			if ( x <= 10 ) { 
				getMove( x , y);
				lastX = x;
				lastY = y;
				attackCompleted = true;
				
			}
			else {
				attackCompleted = false;
			}
			
			
		case south: // test bottom adjacent space
			
			y = lastY + 1;
			if ( y <= 10 ) { 
				getMove( x , y);
				lastX = x;
				lastY = y;
				attackCompleted = true;
				
			}
			else {
				attackCompleted = false;
			}
		
		case west: // test left adjacent space
			
			x = lastX - 1;
			if ( x >= 0 ) { 
				getMove( x , y);
				lastX = x;
				lastY = y;
				attackCompleted = true;
				
			}
			else {
				attackCompleted = false;
			}
		}
		return attackCompleted;
	}
	
}

