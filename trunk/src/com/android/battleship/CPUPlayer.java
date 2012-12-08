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
import java.util.Random;
import com.android.battleship.objects.Ship;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class CPUPlayer extends Activity {

	int randHigh = 6;
	int randLow = 0;
	private int result = 0;
	private Random generator = new Random(10);
	private Random generator2;
	private int x, y, lastX, lastY, firstHitX, firstHitY, direction;
	private boolean attackSuccess;
	boolean hitSuccess;
	boolean won;
	int shipSunk = 1;
	final int random = 0;
	final int directionFind = 1;
	final int directionFollow = 2;
	final int directionChange = 3;
	final int north = 0;
	final int east = 1;
	final int south = 2;
	final int west = 3;
	private int strategyState = 0;
	BattleshipHitsAndMissesScreen hit = new BattleshipHitsAndMissesScreen();
	String[] guesses = new String[100];
	private int numSunk = 0;
	private int numSunkCurr = 0;
	// Initialize variables for a toast
	CharSequence toastText = "Hello toast!";
	int duration = Toast.LENGTH_SHORT;
	Context context;
	// Initialize the ships array
	private Ship[] ships = new Ship[5];
	{
		ships[0] = new Ship("Carrier", 5); // Add a carrier
		ships[1] = new Ship("Submarine", 4); // Add a submarine
		ships[2] = new Ship("Battleship", 3); // Add a battleship
		ships[3] = new Ship("Destroyer", 3); // Add a destroyer
		ships[4] = new Ship("PT Boat", 2); // Add a PT boat
	}
	
	public CPUPlayer() {
		initShips();
	}

	public void setContext(Context ctext){
		this.context = ctext;
	}
	
	/** Use this to access the CPUs ships array from other classes */
	protected Ship[] getShipArray() {
		return ships;
	}

	private void initShips() {
		CPURandomizer();
		CPUPlacer(result);
	}

	/** This is the "main" function to facilitate CPU logic needs to be passed an int: 0 for ship not
	 *  sunk, 1 for ship sunk
	 */
	public void computerMove(int shipSunk) { 
		
		if (shipSunk == 1) { // This will reset the CPU state to random guess
			shipSunk = 0; // Reset 
			strategyState = random;
		}

		switch (strategyState) {
			case random:
				Log.v("", "computerMove(): case random, calling getCpuRandomMove()");
				getCpuRandomMove();
				break;
			case directionFind:
				Log.v("", "computerMove(): case directionFind, calling setCpuDirection()");
				setCpuDirection();
				break;
			case directionFollow:
				Log.v("", "computerMove(): case directionFollow, calling continueAttack()");
				continueAttack();
				break;
			case directionChange:
				Log.v("", "computerMove(): case directionChange, calling changeAttackDirection()");
				changeAttackDirection();
				computerMove(0);
				break;
			default:
				Log.v("", "computerMove(): case default, calling getCpuRandomMove()");
				getCpuRandomMove();
				break;
		}

		Log.v("", "getMove called on line 95");
		String move = getMove(x, y);

		
		/* Check for a move & check for CPU win */
		hitSuccess = hit.checkForHit(BattleshipPlacementScreen.ships, move);
		if(hitSuccess){
			// TODO: toast
			toastText = "The CPU hit one of your ships!";
			Toast toast = Toast.makeText(context, toastText, duration);
			toast.show();
			
			Log.v("", "CPU hit your ship: " + move);
			// After a hit, get a new strategy
			strategyAssign(hitSuccess, strategyState); 
			
			/* If the CPU just sunk a ship we want strategy to reset to random*/
			numSunkCurr = hit.getNumShipsSunk(BattleshipPlacementScreen.ships);
			Log.v("","numSunkCurr: " + numSunkCurr);
			if(numSunkCurr > numSunk){
				numSunk +=1; // Keep track of current number of ships sunk
				shipSunk = 1; // This will handle resetting the logic to random
			}
			
			// Check to see if the CPU has taken down all ships
			if(hit.checkForWin(MainActivity.cpu.getShipArray())){
				won = true;
				//Toast.makeText(this, "The computer beat you!", Toast.LENGTH_SHORT).show(); 
			}
		}
	}

	private void changeAttackDirection() {
		
		lastX = firstHitX;
		lastY = firstHitY;
		switch (direction) {
		case north:
			direction = south;
			break;
		case east:
			direction = west;
			break;
		case south:
			direction = north;
			break;
		case west:
			direction = east;
			break;
		}

		continueAttack();
		strategyState = directionFollow;
	}

	private void continueAttack() {
		
		switch (direction) {
		case north:
			attackSuccess = attack(north);
			if (attackSuccess == false) {
				changeAttackDirection();
			}
			break;
		case east:
			attackSuccess = attack(east);
			if (attackSuccess == false) {
				changeAttackDirection();
			}
			break;
		case south:
			attackSuccess = attack(south);
			if (attackSuccess == false) {
				changeAttackDirection();
			}
			break;
		case west:
			attackSuccess = attack(west);
			if (attackSuccess == false) {
				changeAttackDirection();
			}
			break;
		}
	}

	private void strategyAssign(boolean hitSuccess, int strategyState2) {
		
		switch (strategyState) {
		case random:
			if (hitSuccess = true) {
				strategyState = directionFind;
			}
			break;

		case directionFind:
			if (hitSuccess = true) {
				strategyState = directionFollow;
			}
			break;
		/*
		 * THIS SWITCH HANDLED IN CONTINUE ATTACK METHOD case directionFollow:
		 * if (hitSuccess = false){ strategyState = directionChange; } break; /*
		 * DIRECTION CHANGE SHOULD NOT BE A VALID CASE AT THIS POINT IN CODE *
		 * case directionChange: if (hitSuccess = true){ strategyState =
		 * directionFollow; }
		 * 
		 * break;
		 */
		}

	}

	private void getCpuRandomMove() {
		
		Log.v("", "Getting CpuRandomMove");
		x = randLow + (int) (Math.random() * (10) + 0.5) + 1;
		y = randLow + (int) (Math.random() * (10) + 0.5) + 1;
		Log.v("", "x & y: " + x + " " + y);
		lastX = x;
		lastY = y;
	}

	private String getMove(int x, int y) {
		
		Log.v("", "getMove() was called");
		String id = null;
		switch (x) {
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
			id = "A";
			break;
		}

		id += Integer.toString(y);
		Log.v("", "CPU Move ID = " + id);
		for(int i = 0; i < guesses.length; i++){
			// The ID has already been tried, get new X & Y
			if(guesses[i] == id){
				Log.v("", "CPU Move ID was not unique, getting a new one. ID was: " + id);
				getCpuRandomMove();
				getMove(x, y);
			}
		}
		return id;
	}

	private void setCpuDirection() {

		/* This kept producing the same int, looping out of control, and causing a stackOverflowException */
		/*generator2 = new Random(100);
		 int guess = generator2.nextInt(3) + 1; // 1 - 4
		if (hitGuesses[guess] == 1) { // if the random guess has already been guessed, get new
			setCpuDirection();
			Log.v("", "setCpuDirection, hit guess already tried: " + guess);
		} */
		
		int guess = 1; // Let's just start with one and increment from there
		Log.v("", "setCpuDirection, guess: " + guess);

			switch (guess) {
			case 1: // test top adjacent space NORTH
				guess = 2;
				attackSuccess = attack(north);
				if (attackSuccess == false) {
				}
				break;
			case 2: // test right adjacent space EAST
				guess = 3;
				attackSuccess = attack(east);
				if (attackSuccess == false) {
				}
				break;
			case 3: // test bottom adjacent space SOUTH
				guess = 4;
				attackSuccess = attack(south);
				if (attackSuccess == false) {
				}
				break;
			case 4: // test left adjacent space WEST
				guess = 1; // Restart with 0
				attackSuccess = attack(west);
				if (attackSuccess == false) {
				}
				break;
			default:
				break;
			}

			//setCpuDirection(); // ?? Why was this being called again?
			direction = guess;
	}

	private boolean attack(int direction) {
		boolean attackCompleted = false;
		switch (direction) {
		case north: // test top adjacent space
			y = lastY - 1;
			if (y >= 0) {
				Log.v("", "getMove called on line 306");
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}
			break;
		case east: // test right adjacent space
			x = lastX + 1;
			if (x <= 10) {
				Log.v("", "getMove called on line 318");
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}
			break;
		case south: // test bottom adjacent space
			y = lastY + 1;
			if (y <= 10) {
				Log.v("", "getMove called on line 329");
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}
			break;
		case west: // test left adjacent space
			x = lastX - 1;
			if (x >= 0) {
				Log.v("", "getMove called on line 341");
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;
			} else {
				attackCompleted = false;
			}
			break;
		}
		return attackCompleted;
	}

	/** Randomizes a number for use in placing the CPU ships 
	 * 
	 */
	public void CPURandomizer() {
		result = randLow + (int) (Math.random() * (randHigh - randLow) + 0.5);
	}

	/** Use a random generated number from 1-5 to determine where to place ships
	 * 
	 * @param rand
	 */
	public void CPUPlacer(int rand) {
		switch (rand) {
		case 1:
			// carrier
			ships[0].getShipArray().add("A1");
			ships[0].getShipArray().add("A2");
			ships[0].getShipArray().add("A3");
			ships[0].getShipArray().add("A4");
			ships[0].getShipArray().add("A5");

			// submarine
			ships[1].getShipArray().add("A9");
			ships[1].getShipArray().add("B9");
			ships[1].getShipArray().add("C9");
			ships[1].getShipArray().add("D9");

			// destroyer
			ships[2].getShipArray().add("C3");
			ships[2].getShipArray().add("C4");
			ships[2].getShipArray().add("C5");

			// battleship
			ships[3].getShipArray().add("J4");
			ships[3].getShipArray().add("J5");
			ships[3].getShipArray().add("J7");

			// PT Boat
			ships[4].getShipArray().add("G1");
			ships[4].getShipArray().add("H1");

			break;
			
		case 2:
			// carrier
			ships[0].getShipArray().add("A1");
			ships[0].getShipArray().add("B1");
			ships[0].getShipArray().add("C1");
			ships[0].getShipArray().add("D1");
			ships[0].getShipArray().add("E1");

			// submarine
			ships[1].getShipArray().add("B7");
			ships[1].getShipArray().add("C7");
			ships[1].getShipArray().add("D7");
			ships[1].getShipArray().add("E7");

			// destroyer
			ships[2].getShipArray().add("H1");
			ships[2].getShipArray().add("H2");
			ships[2].getShipArray().add("H3");

			// battleship
			ships[3].getShipArray().add("H10");
			ships[3].getShipArray().add("I10");
			ships[3].getShipArray().add("J10");

			// PT Boat
			ships[4].getShipArray().add("D4");
			ships[4].getShipArray().add("D5");

			break;

		case 3:
			// carrier
			ships[0].getShipArray().add("E5");
			ships[0].getShipArray().add("E6");
			ships[0].getShipArray().add("E7");
			ships[0].getShipArray().add("E8");
			ships[0].getShipArray().add("E9");

			// submarine
			ships[1].getShipArray().add("J3");
			ships[1].getShipArray().add("I3");
			ships[1].getShipArray().add("H3");
			ships[1].getShipArray().add("G3");

			// destroyer
			ships[2].getShipArray().add("A8");
			ships[2].getShipArray().add("A9");
			ships[2].getShipArray().add("A10");

			// battleship
			ships[3].getShipArray().add("C7");
			ships[3].getShipArray().add("D7");
			ships[3].getShipArray().add("E7");

			// PT Boat
			ships[4].getShipArray().add("F3");
			ships[4].getShipArray().add("F4");

			break;

		case 4:
			// carrier
			ships[0].getShipArray().add("J10");
			ships[0].getShipArray().add("J9");
			ships[0].getShipArray().add("J8");
			ships[0].getShipArray().add("J7");
			ships[0].getShipArray().add("J6");

			// submarine
			ships[1].getShipArray().add("J1");
			ships[1].getShipArray().add("J2");
			ships[1].getShipArray().add("J3");
			ships[1].getShipArray().add("J4");

			// destroyer
			ships[2].getShipArray().add("H1");
			ships[2].getShipArray().add("G1");
			ships[2].getShipArray().add("F1");

			// battleship
			ships[3].getShipArray().add("B2");
			ships[3].getShipArray().add("B3");
			ships[3].getShipArray().add("B4");

			// PT Boat
			ships[4].getShipArray().add("D10");
			ships[4].getShipArray().add("E10");

			break;

		case 5:
			// carrier
			ships[0].getShipArray().add("I3");
			ships[0].getShipArray().add("I4");
			ships[0].getShipArray().add("I5");
			ships[0].getShipArray().add("I6");
			ships[0].getShipArray().add("I7");

			// submarine
			ships[1].getShipArray().add("A10");
			ships[1].getShipArray().add("A9");
			ships[1].getShipArray().add("A8");
			ships[1].getShipArray().add("A7");

			// destroyer
			ships[2].getShipArray().add("F5");
			ships[2].getShipArray().add("G5");
			ships[2].getShipArray().add("H5");

			// battleship
			ships[3].getShipArray().add("E7");
			ships[3].getShipArray().add("F7");
			ships[3].getShipArray().add("G7");

			// PT Boat
			ships[4].getShipArray().add("B1");
			ships[4].getShipArray().add("C1");

			break;

		default:
			// carrier
			ships[0].getShipArray().add("F10");
			ships[0].getShipArray().add("G10");
			ships[0].getShipArray().add("H10");
			ships[0].getShipArray().add("I10");
			ships[0].getShipArray().add("J10");

			// submarine
			ships[1].getShipArray().add("D5");
			ships[1].getShipArray().add("D4");
			ships[1].getShipArray().add("D3");
			ships[1].getShipArray().add("D2");

			// destroyer
			ships[2].getShipArray().add("B7");
			ships[2].getShipArray().add("C7");
			ships[2].getShipArray().add("D7");

			// battleship
			ships[3].getShipArray().add("I1");
			ships[3].getShipArray().add("I2");
			ships[3].getShipArray().add("I3");

			// PT Boat
			ships[4].getShipArray().add("A4");
			ships[4].getShipArray().add("B4");

			break;
		}

		for (int i = 0; i < ships.length; i++) {
			// Loops through cells of each ship
			for (int j = 0; j < ships[i].getShipArray().size(); j++) {

				Log.v("", "Print ship array" + ships[i].getShipArray().get(j));

			}
		}
	}
}
