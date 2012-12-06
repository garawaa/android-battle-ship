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

import com.android.battleship.objects.Ship;

import android.app.Activity;
import android.util.Log;

public class CPUPlayer extends Activity {

	int randHigh = 6;
	int randLow = 0;
	int result = 0;

	private Random generator = new Random(10);
	private int x, y, lastX, lastY, firstHitX, firstHitY, direction;
	private int[] hitGuesses = new int[] { 0, 0, 0, 0 };
	private boolean attackSuccess;
	boolean hitSuccess;
	boolean won;
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

	/** Use this to access the CPUs ships array from other classes */
	protected Ship[] getShipArray() {
		return ships;
	}

	// TODO: Randomize CPU ships

	private void initShips() {

		CPURandomizer();

	}

	/** This is the "main" function to facilitate CPU logic needs to be passed an int: 0 for ship not
	 *  sunk, 1 for ship sunk
	 */

	public void computerMove(int shipSunk) { 
		if (shipSunk == 1) { // this will reset the CPU state to random guess

			strategyState = random;
		}

		switch (strategyState) {
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
		hitSuccess = hit.checkForHit(BattleshipPlacementScreen.ships, move);
		if(hitSuccess){
			Log.v("","The CPU hit one of your ships! " + move);
			// Check to see if the CPU has taken down all ships
			if(hit.checkForWin(MainActivity.cpu.getShipArray())){
				won = true;
				Log.v("", "CPU WINS!!");
			}
		}
		strategyAssign(hitSuccess, strategyState);
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

		x = generator.nextInt(10);
		y = generator.nextInt(10) + 1;

	}

	private String getMove(int x, int y) {

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
			break;
		}

		return id += Integer.toString(y);
	}

	private boolean checkForHit(ArrayList<String> Array, String move) {

		for (int i = 0; i < Array.size(); ++i) {
			// TODO: pass in msg variable
			Log.v("msg", "move = ");
			if (move.equals(Array.get(i))) {
				firstHitX = x;
				firstHitY = y;
				lastX = x;
				lastY = y;
				return true;
			}
		}

		return false;

	}

	private void setCpuDirection() {

		Random generator2 = new Random(100);
		int guess = generator2.nextInt(4);

		if (hitGuesses[guess] == 1) { // if the random guess has already been
										// tried, gets new random number
			setCpuDirection();
		}

		else {
			hitGuesses[guess] = 1; // modifies array to show that the try was
									// attempted.

			switch (guess) {
			case north: // test top adjacent space

				attackSuccess = attack(north);
				if (attackSuccess == false) {
					setCpuDirection();
				}
				break;

			case east: // test right adjacent space

				attackSuccess = attack(east);
				if (attackSuccess == false) {
					setCpuDirection();
				}
				break;

			case south: // test bottom adjacent space

				attackSuccess = attack(south);
				if (attackSuccess == false) {
					setCpuDirection();
				}
				break;

			case west: // test left adjacent space

				attackSuccess = attack(west);
				if (attackSuccess == false) {
					setCpuDirection();
				}
				break;
			}

			direction = guess;
		}
	}

	private boolean attack(int direction) {
		boolean attackCompleted = false;
		switch (direction) {
		case north: // test top adjacent space

			y = lastY - 1;
			if (y >= 0) {
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}

		case east: // test right adjacent space

			x = lastX + 1;
			if (x <= 10) {
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}

		case south: // test bottom adjacent space

			y = lastY + 1;
			if (y <= 10) {
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}

		case west: // test left adjacent space

			x = lastX - 1;
			if (x >= 0) {
				getMove(x, y);
				lastX = x;
				lastY = y;
				attackCompleted = true;

			} else {
				attackCompleted = false;
			}
		}
		return attackCompleted;
	}

	void CPURandomizer() {
		result = randLow + (int) (Math.random() * (randHigh - randLow) + 0.5);
		CPUPlacer(result);
	}

	/** Use a random generated number from 1-5 to determine where to place ships
	 * 
	 * @param rand
	 */
	void CPUPlacer(int rand) {
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
