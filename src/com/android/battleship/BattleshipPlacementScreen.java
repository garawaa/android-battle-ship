package com.android.battleship;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.android.battleship.objects.PlayerShipArrays;
import com.android.battleship.objects.Ship;

/**
 * onClick screen will be opened from an onClickListener in the GridScreen. From
 * onClick screen we will decide what ship to place and the orientation
 * (horizontal|vertical) to place it.
 * 
 * @author DPrinslow
 * 
 */
public class BattleshipPlacementScreen extends Activity {
	
	int counter = 0;
	int firstMove = 0;
	int secondMove = 0;
	int cellsOccupied = 0;
	int shipPlaced = 1;
	int previous = 999;
	ImageButton button;
	String msg;
	GameMessages gm = new GameMessages();
	boolean btnSelected = false;
	String firstBtn;
	String previousBtn;
	BattleshipGridScreen grid;
	PlayerShipArrays player1ShipArray = new PlayerShipArrays();
	PlayerShipArrays player2ShipArray = new PlayerShipArrays();
	// Initialize the ships array
	static Ship[] ships = new Ship[5];{
		ships[0] = new Ship("Carrier"); // Add a carrier
		ships[1] = new Ship("Submarine"); // Add a submarine
		ships[2] = new Ship("Battleship"); // Add a battleship
		ships[3] = new Ship("Destroyer"); // Add a destroyer
		ships[4] = new Ship("PT Boat"); // Add a PT boat
	}
	
	ImageButton placementA1;
	ImageButton placementA2;
	ImageButton placementA3;
	ImageButton placementA4;
	ImageButton placementA5;
	ImageButton placementA6;
	ImageButton placementA7;
	ImageButton placementA8;
	ImageButton placementA9;
	ImageButton placementA10;
	ImageButton placementB1;
	ImageButton placementB2;
	ImageButton placementB3;
	ImageButton placementB4;
	ImageButton placementB5;
	ImageButton placementB6;
	ImageButton placementB7;
	ImageButton placementB8;
	ImageButton placementB9;
	ImageButton placementB10;
	ImageButton placementC1;
	ImageButton placementC2;
	ImageButton placementC3;
	ImageButton placementC4;
	ImageButton placementC5;
	ImageButton placementC6;
	ImageButton placementC7;
	ImageButton placementC8;
	ImageButton placementC9;
	ImageButton placementC10;
	ImageButton placementD1;
	ImageButton placementD2;
	ImageButton placementD3;
	ImageButton placementD4;
	ImageButton placementD5;
	ImageButton placementD6;
	ImageButton placementD7;
	ImageButton placementD8;
	ImageButton placementD9;
	ImageButton placementD10;
	ImageButton placementE1;
	ImageButton placementE2;
	ImageButton placementE3;
	ImageButton placementE4;
	ImageButton placementE5;
	ImageButton placementE6;
	ImageButton placementE7;
	ImageButton placementE8;
	ImageButton placementE9;
	ImageButton placementE10;
	ImageButton placementF1;
	ImageButton placementF2;
	ImageButton placementF3;
	ImageButton placementF4;
	ImageButton placementF5;
	ImageButton placementF6;
	ImageButton placementF7;
	ImageButton placementF8;
	ImageButton placementF9;
	ImageButton placementF10;
	ImageButton placementG1;
	ImageButton placementG2;
	ImageButton placementG3;
	ImageButton placementG4;
	ImageButton placementG5;
	ImageButton placementG6;
	ImageButton placementG7;
	ImageButton placementG8;
	ImageButton placementG9;
	ImageButton placementG10;
	ImageButton placementH1;
	ImageButton placementH2;
	ImageButton placementH3;
	ImageButton placementH4;
	ImageButton placementH5;
	ImageButton placementH6;
	ImageButton placementH7;
	ImageButton placementH8;
	ImageButton placementH9;
	ImageButton placementH10;
	ImageButton placementI1;
	ImageButton placementI2;
	ImageButton placementI3;
	ImageButton placementI4;
	ImageButton placementI5;
	ImageButton placementI6;
	ImageButton placementI7;
	ImageButton placementI8;
	ImageButton placementI9;
	ImageButton placementI10;
	ImageButton placementJ1;
	ImageButton placementJ2;
	ImageButton placementJ3;
	ImageButton placementJ4;
	ImageButton placementJ5;
	ImageButton placementJ6;
	ImageButton placementJ7;
	ImageButton placementJ8;
	ImageButton placementJ9;
	ImageButton placementJ10;

	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.placement_layout);
		
		// Create buttons and set their onClick listeners
		init();
		
		String carrier = "Please select 5 cells adjacent to one another horizontally or vertically"
				+ " to set your carrier";
		gm.displayMsg(this, carrier, "Place Your Ship");
	}
	
	private boolean checkSelection(int p, int c) {

		Log.v(msg, "Counter = " + counter);
		if (counter == 0 || counter == 5 || counter == 9 || counter == 12 || counter == 15) {
			firstMove = c;
			secondMove = firstMove;
			previous = c;
			counter++;
			return true;

		} else if (counter == 1 || counter == 6 || counter == 10 || counter == 13
				|| counter == 16) {
			Log.v(msg, "firstMove = " + firstMove);
			Log.v(msg, "secondMove = " + secondMove);
			Log.v(msg, "currentMove = " + c);
			if (c == firstMove + 1 || c == firstMove - 1 || c == firstMove + 10 || c == firstMove -10)
			{
				secondMove = c;
				previous = c;
				counter++;
				return true;
			}
			
			return false;

		} else {
			switch (shipPlaced) {
			case 1: 
				if (firstMove == secondMove - 1 || firstMove == secondMove + 1) {
					if (c == firstMove + 1 || c == firstMove + 2
							|| c == firstMove + 3 || c == firstMove + 4
							|| c == firstMove - 1 || c == firstMove - 2
							|| c == firstMove - 3 || c == firstMove - 4) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}

				} else if (firstMove == secondMove - 10 || firstMove == secondMove + 10) {
					if (c == firstMove + 10 || c == firstMove + 20
							|| c == firstMove + 30 || c == firstMove + 40
							|| c == firstMove - 10 || c == firstMove - 20
							|| c == firstMove - 30 || c == firstMove - 40) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}
				} else {
					Log.v(msg, "Returning calculated false");
					return false;
				}
			
				break;
			
			case 2: 
				if (firstMove == secondMove - 1 || firstMove == secondMove + 1) {
					if (c == firstMove + 1 || c == firstMove + 2
							|| c == firstMove + 3 || c == firstMove - 1
							|| c == firstMove - 2 || c == firstMove - 3) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}

				} else if (firstMove == secondMove - 10
						|| firstMove == secondMove + 10) {
					if (c == firstMove + 10 || c == firstMove + 20
							|| c == firstMove + 30 || c == firstMove - 10
							|| c == firstMove - 20 || c == firstMove - 30) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}
				} else {
					Log.v(msg, "Returning calculated false");
					return false;
				}
			
			
				break;
				
			case 3:	
				if (firstMove == secondMove - 1 || firstMove == secondMove + 1) {
					if (c == firstMove + 1 || c == firstMove + 2
							|| c == firstMove - 1 || c == firstMove - 2) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}

				} else if (firstMove == secondMove - 10
						|| firstMove == secondMove + 10) {
					if (c == firstMove + 10 || c == firstMove + 20
							|| c == firstMove - 10 || c == firstMove - 20) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}
				} else {
					Log.v(msg, "Returning calculated false");
					return false;
					}
			
				break;
				
			case 4: 
				if (firstMove == secondMove - 1 || firstMove == secondMove + 1) {
					if (c == firstMove + 1 || c == firstMove + 2
							|| c == firstMove - 1 || c == firstMove - 2) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}

				} else if (firstMove == secondMove - 10
						|| firstMove == secondMove + 10) {
					if (c == firstMove + 10 || c == firstMove + 20
							|| c == firstMove - 10 || c == firstMove - 20) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}
				 else {
					 	Log.v(msg, "Returning calculated false");
					 	return false;
				 	}
					
				}
			
				break;
			
			case 5: 
				if (firstMove == secondMove - 1 || firstMove == secondMove + 1) {
					if (c == firstMove + 1 || c == firstMove - 1) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}

				} else if (firstMove == secondMove - 10
						|| firstMove == secondMove + 10) {
					if (c == firstMove + 10 || c == firstMove - 10) {
						previous = c;
						Log.v(msg, "Returning true");
						counter++;
						return true;
					}
				} else {
					Log.v(msg, "Returning calculated false");
					return false;
				}
				
				break;
			
			
			default:
				
				break;
			
			
			}
		}
		return false;
	}
	
	public void placeShips(String cellId, int cellNum, ImageButton b) {
		boolean validSelection = false;
		button = b;
		String message = "";
		int max = 0;
		
		switch (shipPlaced) {
		case 1:
			max = 4;
			validSelection = createShip(cellId, cellNum, max, 0);

			if (!validSelection) {
				displayMsgInvalid();
			}
			
			if (cellsOccupied > max)
			{
				message = "Please select 4 cells adjacent to one another horizontally or vertically"
						+ " to set your submarine";
				gm.displayMsg(this, message, "Place Your Ship");
			}
			break;

		case 2:
			max = 8;
			validSelection = createShip(cellId, cellNum, max, 1);

			if (!validSelection) {
				displayMsgInvalid();
			}

			if (cellsOccupied > max)
			{
				message = "Please select 3 cells adjacent to one another horizontally or vertically"
						+ " to set your battleship";
				gm.displayMsg(this, message, "Place Your Ship");
			}
			
			break;

		case 3:
			max = 11;
			validSelection = createShip(cellId, cellNum, max, 2);

			if (!validSelection) {
				displayMsgInvalid();
			}
			
			if (cellsOccupied > max)
			{
				message = "Please select 3 cells adjacent to one another horizontally or vertically"
						+ " to set your destroyer";
				gm.displayMsg(this, message, "Place Your Ship");
			}

			break;

		case 4:
			max = 14;
			validSelection = createShip(cellId, cellNum, max, 3);

			if (!validSelection) {
				displayMsgInvalid();
			}
			
			if (cellsOccupied > max)
			{
				message = "Please select 2 cells adjacent to one another horizontally or vertically"
						+ " to set your pt boat";
				gm.displayMsg(this, message, "Place Your Ship");
			}

			break;

		case 5:
			max = 16;
			validSelection = createShip(cellId, cellNum, max, 4);

			if (!validSelection) {
				displayMsgInvalid();
			}
			
			// All ships are placed
			if (cellsOccupied > max)
			{
				gm.displayMsg(this, "All your ships have been placed.", "Ships placed");
				// Switch to the Grid Screen
					++shipPlaced;
					Log.v(msg, "Incrementing shipPlaced.  shipPlaced = " + shipPlaced);
					
					Log.v(msg, "Changing intent to Grid Screen.");
					
					Intent intent = new Intent(this, BattleshipGridScreen.class);
					startActivityForResult(intent, 1);
			}

			break;

		}
	}

	/** User has selected a cell that is not adjacent to the previous while trying to create a ship; Display a message
	 * to inform them of this and ask them to chose another cell.
	 */
	public void displayMsgInvalid(){
		GameMessages gm = new GameMessages();
		final Context context = this;
		gm.displayMsg(context, "Move Not Available",
				"Please select another cell.");
	}
	
	/** This method will use the cellId to update the previousBtn and the cellNum to check if the cell selection is valid. It will
	 * also determine if the cellsOccupied exceeds the provided max shipsPlaced will be incremented. The idx will be used
	 * to determine which ship's shipArray to update with the current cell. False will be returned if the user needs to select 
	 * another cell.
	 * @param cellId
	 * @param cellNum
	 * @param max
	 * @param idx
	 * @return boolean
	 */
	public boolean createShip(String cellId, int cellNum, int max, int idx) {
		
		if (MainActivity.player == 1) {
			btnSelected = checkSelection(previous, cellNum);
			Log.v(msg,"Previous after return = " + previous);			
			
			if (btnSelected) {
				player1ShipArray.getPlayerShipArray().add(cellId);
				// Add the cellId to the ships array
				ships[idx].getShipArray().add(cellId);
				changeImage(button);
				previousBtn = cellId;
			}

			// Not a valid selection
			else
			{
				Log.v(msg, "Returning false)");
				return false;
			}

		} else {
			btnSelected = checkSelection(previous, cellNum);

			if (btnSelected) {
				player2ShipArray.getPlayerShipArray().add(cellId);
				previousBtn = cellId;
			}

			// Not a valid selection
			else {
				return false;
			}
		}

		cellsOccupied++;
		Log.v(msg, "cellsOccupied = " + cellsOccupied);
		
		if (cellsOccupied > max)
		{
			++shipPlaced;
			previous = 999;
			Log.v(msg, "Incrementing shipPlaced.  shipPlaced = " + shipPlaced);
		}
		return true;
	}

	private OnClickListener onPlacementClick = new OnClickListener()
	{

		public void onClick(View arg0)
		{
			switch(arg0.getId())
			{
				case R.id.placementA1:
					placeShips("A1",1,placementA1);
					break;
		
				case R.id.placementA2:
					placeShips("A2",2,placementA2);
					break;
		
				case R.id.placementA3:
					placeShips("A3",3,placementA3);
					break;
		
				case R.id.placementA4:
					placeShips("A4",4,placementA4);
					break;
		
				case R.id.placementA5:
					placeShips("A5",5,placementA5);
					break;
		
				case R.id.placementA6:
					placeShips("A6",6,placementA6);
					break;
		
				case R.id.placementA7:
					placeShips("A7",7,placementA7);
					break;
		
				case R.id.placementA8:
					placeShips("A8",8,placementA8);
					break;
		
				case R.id.placementA9:
					placeShips("A9",9,placementA9);
					break;
		
				case R.id.placementA10:
					placeShips("A10",10,placementA10);
					break;
		
				case R.id.placementB1:
					placeShips("B1",11,placementB1);
					break;
		
				case R.id.placementB2:
					placeShips("B2",12,placementB2);
					break;
		
				case R.id.placementB3:
					placeShips("B3",13,placementB3);
					break;
		
				case R.id.placementB4:
					placeShips("B4",14,placementB4);
					break;
		
				case R.id.placementB5:
					placeShips("B5",15,placementB5);
					break;
		
				case R.id.placementB6:
					placeShips("B6",16,placementB6);
					break;
		
				case R.id.placementB7:
					placeShips("B7",17,placementB7);
					break;
		
				case R.id.placementB8:
					placeShips("B8",18,placementB8);
					break;
		
				case R.id.placementB9:
					placeShips("B9",19,placementB9);
					break;
		
				case R.id.placementB10:
					placeShips("B10",20,placementB10);
					break;
		
				case R.id.placementC1:
					placeShips("C1",21,placementC1);
					break;
		
				case R.id.placementC2:
					placeShips("C2",22,placementC2);
					break;
		
				case R.id.placementC3:
					placeShips("C3",23,placementC3);
					break;
		
				case R.id.placementC4:
					placeShips("C4",24,placementC4);
					break;
		
				case R.id.placementC5:
					placeShips("C5",25,placementC5);
					break;
		
				case R.id.placementC6:
					placeShips("C6",26,placementC6);
					break;
		
				case R.id.placementC7:
					placeShips("C7",27,placementC7);
					break;
		
				case R.id.placementC8:
					placeShips("C8",28,placementC8);
					break;
		
				case R.id.placementC9:
					placeShips("C9",29,placementC9);
					break;
		
				case R.id.placementC10:
					placeShips("C10",30,placementC10);
					break;
		
				case R.id.placementD1:
					placeShips("D1",31,placementD1);
					break;
		
				case R.id.placementD2:
					placeShips("D2",32,placementD2);
					break;
		
				case R.id.placementD3:
					placeShips("D3",33,placementD3);
					break;
		
				case R.id.placementD4:
					placeShips("D4",34,placementD4);
					break;
		
				case R.id.placementD5:
					placeShips("D5",35,placementD5);
					break;
		
				case R.id.placementD6:
					placeShips("D6",36,placementD6);
					break;
		
				case R.id.placementD7:
					placeShips("D7",37,placementD7);
					break;
		
				case R.id.placementD8:
					placeShips("D8",38,placementD8);
					break;
		
				case R.id.placementD9:
					placeShips("D9",39,placementD9);
					break;
		
				case R.id.placementD10:
					placeShips("D10",40,placementD10);
					break;
		
				case R.id.placementE1:
					placeShips("E1",41,placementE1);
					break;
		
				case R.id.placementE2:
					placeShips("E2",42,placementE2);
					break;
		
				case R.id.placementE3:
					placeShips("E3",43,placementE3);
					break;
		
				case R.id.placementE4:
					placeShips("E4",44,placementE4);
					break;
		
				case R.id.placementE5:
					placeShips("E5",45,placementE5);
					break;
		
				case R.id.placementE6:
					placeShips("E6",46,placementE6);
					break;
		
				case R.id.placementE7:
					placeShips("E7",47,placementE7);
					break;
		
				case R.id.placementE8:
					placeShips("E8",48,placementE8);
					break;
		
				case R.id.placementE9:
					placeShips("E9",49,placementE9);
					break;
		
				case R.id.placementE10:
					placeShips("E10",50,placementE10);
					break;
		
				case R.id.placementF1:
					placeShips("F1",51,placementF1);
					break;
		
				case R.id.placementF2:
					placeShips("F2",52,placementF2);
					break;
		
				case R.id.placementF3:
					placeShips("F3",53,placementF3);
					break;
		
				case R.id.placementF4:
					placeShips("F4",54,placementF4);
					break;
		
				case R.id.placementF5:
					placeShips("F5",55,placementF5);
					break;
		
				case R.id.placementF6:
					placeShips("F6",56,placementF6);
					break;
		
				case R.id.placementF7:
					placeShips("F7",57,placementF7);
					break;
		
				case R.id.placementF8:
					placeShips("F8",58,placementF8);
					break;
		
				case R.id.placementF9:
					placeShips("F9",59,placementF9);
					break;
		
				case R.id.placementF10:
					placeShips("F10",60,placementF10);
					break;
		
				case R.id.placementG1:
					placeShips("G1",61,placementG1);
					break;
		
				case R.id.placementG2:
					placeShips("G2",62,placementG2);
					break;
		
				case R.id.placementG3:
					placeShips("G3",63,placementG3);
					break;
		
				case R.id.placementG4:
					placeShips("G4",64,placementG4);
					break;
		
				case R.id.placementG5:
					placeShips("G5",65,placementG5);
					break;
		
				case R.id.placementG6:
					placeShips("G6",66,placementG6);
					break;
		
				case R.id.placementG7:
					placeShips("G7",67,placementG7);
					break;
		
				case R.id.placementG8:
					placeShips("G8",68,placementG8);
					break;
		
				case R.id.placementG9:
					placeShips("G9",69,placementG9);
					break;
		
				case R.id.placementG10:
					placeShips("G10",70,placementG10);
					break;
		
				case R.id.placementH1:
					placeShips("H1",71,placementH1);
					break;
		
				case R.id.placementH2:
					placeShips("H2",72,placementH2);
					break;
		
				case R.id.placementH3:
					placeShips("H3",73,placementH3);
					break;
		
				case R.id.placementH4:
					placeShips("H4",74,placementH4);
					break;
		
				case R.id.placementH5:
					placeShips("H5",75,placementH5);
					break;
		
				case R.id.placementH6:
					placeShips("H6",76,placementH6);
					break;
		
				case R.id.placementH7:
					placeShips("H7",77,placementH7);
					break;
		
				case R.id.placementH8:
					placeShips("H8",78,placementH8);
					break;
		
				case R.id.placementH9:
					placeShips("H9",79,placementH9);
					break;
		
				case R.id.placementH10:
					placeShips("H10",80,placementH10);
					break;
		
				case R.id.placementI1:
					placeShips("I1",81,placementI1);
					break;
		
				case R.id.placementI2:
					placeShips("I2",82,placementI2);
					break;
		
				case R.id.placementI3:
					placeShips("I3",83,placementI3);
					break;
		
				case R.id.placementI4:
					placeShips("I4",84,placementI4);
					break;
		
				case R.id.placementI5:
					placeShips("I5",85,placementI5);
					break;
		
				case R.id.placementI6:
					placeShips("I6",86,placementI6);
					break;
		
				case R.id.placementI7:
					placeShips("I7",87,placementI7);
					break;
		
				case R.id.placementI8:
					placeShips("I8",88,placementI8);
					break;
		
				case R.id.placementI9:
					placeShips("I9",89,placementI9);
					break;
		
				case R.id.placementI10:
					placeShips("I10",90,placementI10);
					break;
		
				case R.id.placementJ1:
					placeShips("J1",91,placementJ1);
					break;
		
				case R.id.placementJ2:
					placeShips("J2",92,placementJ2);
					break;
		
				case R.id.placementJ3:
					placeShips("J3",93,placementJ3);
					break;
		
				case R.id.placementJ4:
					placeShips("J4",94,placementJ4);
					break;
		
				case R.id.placementJ5:
					placeShips("J5",95,placementJ5);
					break;
		
				case R.id.placementJ6:
					placeShips("J6",96,placementJ6);
					break;
		
				case R.id.placementJ7:
					placeShips("J7",97,placementJ7);
					break;
		
				case R.id.placementJ8:
					placeShips("J8",98,placementJ8);
					break;
		
				case R.id.placementJ9:
					placeShips("J9",99,placementJ9);
					break;
		
				case R.id.placementJ10:
					placeShips("J10",100,placementJ10);
					break;	
					
				default:
					break;
		
			}
		}
		
	};
	
	public void init()
	{
		// Create buttons
		placementA1 = (ImageButton) findViewById(R.id.placementA1);
		placementA2 = (ImageButton) findViewById(R.id.placementA2);
		placementA3 = (ImageButton) findViewById(R.id.placementA3);
		placementA4 = (ImageButton) findViewById(R.id.placementA4);
		placementA5 = (ImageButton) findViewById(R.id.placementA5);
		placementA6 = (ImageButton) findViewById(R.id.placementA6);
		placementA7 = (ImageButton) findViewById(R.id.placementA7);
		placementA8 = (ImageButton) findViewById(R.id.placementA8);
		placementA9 = (ImageButton) findViewById(R.id.placementA9);
		placementA10 = (ImageButton) findViewById(R.id.placementA10);
		placementB1 = (ImageButton) findViewById(R.id.placementB1);
		placementB2 = (ImageButton) findViewById(R.id.placementB2);
		placementB3 = (ImageButton) findViewById(R.id.placementB3);
		placementB4 = (ImageButton) findViewById(R.id.placementB4);
		placementB5 = (ImageButton) findViewById(R.id.placementB5);
		placementB6 = (ImageButton) findViewById(R.id.placementB6);
		placementB7 = (ImageButton) findViewById(R.id.placementB7);
		placementB8 = (ImageButton) findViewById(R.id.placementB8);
		placementB9 = (ImageButton) findViewById(R.id.placementB9);
		placementB10 = (ImageButton) findViewById(R.id.placementB10);
		placementC1 = (ImageButton) findViewById(R.id.placementC1);
		placementC2 = (ImageButton) findViewById(R.id.placementC2);
		placementC3 = (ImageButton) findViewById(R.id.placementC3);
		placementC4 = (ImageButton) findViewById(R.id.placementC4);
		placementC5 = (ImageButton) findViewById(R.id.placementC5);
		placementC6 = (ImageButton) findViewById(R.id.placementC6);
		placementC7 = (ImageButton) findViewById(R.id.placementC7);
		placementC8 = (ImageButton) findViewById(R.id.placementC8);
		placementC9 = (ImageButton) findViewById(R.id.placementC9);
		placementC10 = (ImageButton) findViewById(R.id.placementC10);
		placementD1 = (ImageButton) findViewById(R.id.placementD1);
		placementD2 = (ImageButton) findViewById(R.id.placementD2);
		placementD3 = (ImageButton) findViewById(R.id.placementD3);
		placementD4 = (ImageButton) findViewById(R.id.placementD4);
		placementD5 = (ImageButton) findViewById(R.id.placementD5);
		placementD6 = (ImageButton) findViewById(R.id.placementD6);
		placementD7 = (ImageButton) findViewById(R.id.placementD7);
		placementD8 = (ImageButton) findViewById(R.id.placementD8);
		placementD9 = (ImageButton) findViewById(R.id.placementD9);
		placementD10 = (ImageButton) findViewById(R.id.placementD10);
		placementE1 = (ImageButton) findViewById(R.id.placementE1);
		placementE2 = (ImageButton) findViewById(R.id.placementE2);
		placementE3 = (ImageButton) findViewById(R.id.placementE3);
		placementE4 = (ImageButton) findViewById(R.id.placementE4);
		placementE5 = (ImageButton) findViewById(R.id.placementE5);
		placementE6 = (ImageButton) findViewById(R.id.placementE6);
		placementE7 = (ImageButton) findViewById(R.id.placementE7);
		placementE8 = (ImageButton) findViewById(R.id.placementE8);
		placementE9 = (ImageButton) findViewById(R.id.placementE9);
		placementE10 = (ImageButton) findViewById(R.id.placementE10);
		placementF1 = (ImageButton) findViewById(R.id.placementF1);
		placementF2 = (ImageButton) findViewById(R.id.placementF2);
		placementF3 = (ImageButton) findViewById(R.id.placementF3);
		placementF4 = (ImageButton) findViewById(R.id.placementF4);
		placementF5 = (ImageButton) findViewById(R.id.placementF5);
		placementF6 = (ImageButton) findViewById(R.id.placementF6);
		placementF7 = (ImageButton) findViewById(R.id.placementF7);
		placementF8 = (ImageButton) findViewById(R.id.placementF8);
		placementF9 = (ImageButton) findViewById(R.id.placementF9);
		placementF10 = (ImageButton) findViewById(R.id.placementF10);
		placementG1 = (ImageButton) findViewById(R.id.placementG1);
		placementG2 = (ImageButton) findViewById(R.id.placementG2);
		placementG3 = (ImageButton) findViewById(R.id.placementG3);
		placementG4 = (ImageButton) findViewById(R.id.placementG4);
		placementG5 = (ImageButton) findViewById(R.id.placementG5);
		placementG6 = (ImageButton) findViewById(R.id.placementG6);
		placementG7 = (ImageButton) findViewById(R.id.placementG7);
		placementG8 = (ImageButton) findViewById(R.id.placementG8);
		placementG9 = (ImageButton) findViewById(R.id.placementG9);
		placementG10 = (ImageButton) findViewById(R.id.placementG10);
		placementH1 = (ImageButton) findViewById(R.id.placementH1);
		placementH2 = (ImageButton) findViewById(R.id.placementH2);
		placementH3 = (ImageButton) findViewById(R.id.placementH3);
		placementH4 = (ImageButton) findViewById(R.id.placementH4);
		placementH5 = (ImageButton) findViewById(R.id.placementH5);
		placementH6 = (ImageButton) findViewById(R.id.placementH6);
		placementH7 = (ImageButton) findViewById(R.id.placementH7);
		placementH8 = (ImageButton) findViewById(R.id.placementH8);
		placementH9 = (ImageButton) findViewById(R.id.placementH9);
		placementH10 = (ImageButton) findViewById(R.id.placementH10);
		placementI1 = (ImageButton) findViewById(R.id.placementI1);
		placementI2 = (ImageButton) findViewById(R.id.placementI2);
		placementI3 = (ImageButton) findViewById(R.id.placementI3);
		placementI4 = (ImageButton) findViewById(R.id.placementI4);
		placementI5 = (ImageButton) findViewById(R.id.placementI5);
		placementI6 = (ImageButton) findViewById(R.id.placementI6);
		placementI7 = (ImageButton) findViewById(R.id.placementI7);
		placementI8 = (ImageButton) findViewById(R.id.placementI8);
		placementI9 = (ImageButton) findViewById(R.id.placementI9);
		placementI10 = (ImageButton) findViewById(R.id.placementI10);
		placementJ1 = (ImageButton) findViewById(R.id.placementJ1);
		placementJ2 = (ImageButton) findViewById(R.id.placementJ2);
		placementJ3 = (ImageButton) findViewById(R.id.placementJ3);
		placementJ4 = (ImageButton) findViewById(R.id.placementJ4);
		placementJ5 = (ImageButton) findViewById(R.id.placementJ5);
		placementJ6 = (ImageButton) findViewById(R.id.placementJ6);
		placementJ7 = (ImageButton) findViewById(R.id.placementJ7);
		placementJ8 = (ImageButton) findViewById(R.id.placementJ8);
		placementJ9 = (ImageButton) findViewById(R.id.placementJ9);
		placementJ10 = (ImageButton) findViewById(R.id.placementJ10);
		
		// Set onClick() listeners
		placementA1.setOnClickListener(onPlacementClick);
		placementA2.setOnClickListener(onPlacementClick);
		placementA3.setOnClickListener(onPlacementClick);
		placementA4.setOnClickListener(onPlacementClick);
		placementA5.setOnClickListener(onPlacementClick);
		placementA6.setOnClickListener(onPlacementClick);
		placementA7.setOnClickListener(onPlacementClick);
		placementA8.setOnClickListener(onPlacementClick);
		placementA9.setOnClickListener(onPlacementClick);
		placementA10.setOnClickListener(onPlacementClick);
		placementB1.setOnClickListener(onPlacementClick);
		placementB2.setOnClickListener(onPlacementClick);
		placementB3.setOnClickListener(onPlacementClick);
		placementB4.setOnClickListener(onPlacementClick);
		placementB5.setOnClickListener(onPlacementClick);
		placementB6.setOnClickListener(onPlacementClick);
		placementB7.setOnClickListener(onPlacementClick);
		placementB8.setOnClickListener(onPlacementClick);
		placementB9.setOnClickListener(onPlacementClick);
		placementB10.setOnClickListener(onPlacementClick);
		placementC1.setOnClickListener(onPlacementClick);
		placementC2.setOnClickListener(onPlacementClick);
		placementC3.setOnClickListener(onPlacementClick);
		placementC4.setOnClickListener(onPlacementClick);
		placementC5.setOnClickListener(onPlacementClick);
		placementC6.setOnClickListener(onPlacementClick);
		placementC7.setOnClickListener(onPlacementClick);
		placementC8.setOnClickListener(onPlacementClick);
		placementC9.setOnClickListener(onPlacementClick);
		placementC10.setOnClickListener(onPlacementClick);
		placementD1.setOnClickListener(onPlacementClick);
		placementD2.setOnClickListener(onPlacementClick);
		placementD3.setOnClickListener(onPlacementClick);
		placementD4.setOnClickListener(onPlacementClick);
		placementD5.setOnClickListener(onPlacementClick);
		placementD6.setOnClickListener(onPlacementClick);
		placementD7.setOnClickListener(onPlacementClick);
		placementD8.setOnClickListener(onPlacementClick);
		placementD9.setOnClickListener(onPlacementClick);
		placementD10.setOnClickListener(onPlacementClick);
		placementE1.setOnClickListener(onPlacementClick);
		placementE2.setOnClickListener(onPlacementClick);
		placementE3.setOnClickListener(onPlacementClick);
		placementE4.setOnClickListener(onPlacementClick);
		placementE5.setOnClickListener(onPlacementClick);
		placementE6.setOnClickListener(onPlacementClick);
		placementE7.setOnClickListener(onPlacementClick);
		placementE8.setOnClickListener(onPlacementClick);
		placementE9.setOnClickListener(onPlacementClick);
		placementE10.setOnClickListener(onPlacementClick);
		placementF1.setOnClickListener(onPlacementClick);
		placementF2.setOnClickListener(onPlacementClick);
		placementF3.setOnClickListener(onPlacementClick);
		placementF4.setOnClickListener(onPlacementClick);
		placementF5.setOnClickListener(onPlacementClick);
		placementF6.setOnClickListener(onPlacementClick);
		placementF7.setOnClickListener(onPlacementClick);
		placementF8.setOnClickListener(onPlacementClick);
		placementF9.setOnClickListener(onPlacementClick);
		placementF10.setOnClickListener(onPlacementClick);
		placementG1.setOnClickListener(onPlacementClick);
		placementG2.setOnClickListener(onPlacementClick);
		placementG3.setOnClickListener(onPlacementClick);
		placementG4.setOnClickListener(onPlacementClick);
		placementG5.setOnClickListener(onPlacementClick);
		placementG6.setOnClickListener(onPlacementClick);
		placementG7.setOnClickListener(onPlacementClick);
		placementG8.setOnClickListener(onPlacementClick);
		placementG9.setOnClickListener(onPlacementClick);
		placementG10.setOnClickListener(onPlacementClick);
		placementH1.setOnClickListener(onPlacementClick);
		placementH2.setOnClickListener(onPlacementClick);
		placementH3.setOnClickListener(onPlacementClick);
		placementH4.setOnClickListener(onPlacementClick);
		placementH5.setOnClickListener(onPlacementClick);
		placementH6.setOnClickListener(onPlacementClick);
		placementH7.setOnClickListener(onPlacementClick);
		placementH8.setOnClickListener(onPlacementClick);
		placementH9.setOnClickListener(onPlacementClick);
		placementH10.setOnClickListener(onPlacementClick);
		placementI1.setOnClickListener(onPlacementClick);
		placementI2.setOnClickListener(onPlacementClick);
		placementI3.setOnClickListener(onPlacementClick);
		placementI4.setOnClickListener(onPlacementClick);
		placementI5.setOnClickListener(onPlacementClick);
		placementI6.setOnClickListener(onPlacementClick);
		placementI7.setOnClickListener(onPlacementClick);
		placementI8.setOnClickListener(onPlacementClick);
		placementI9.setOnClickListener(onPlacementClick);
		placementI10.setOnClickListener(onPlacementClick);
		placementJ1.setOnClickListener(onPlacementClick);
		placementJ2.setOnClickListener(onPlacementClick);
		placementJ3.setOnClickListener(onPlacementClick);
		placementJ4.setOnClickListener(onPlacementClick);
		placementJ5.setOnClickListener(onPlacementClick);
		placementJ6.setOnClickListener(onPlacementClick);
		placementJ7.setOnClickListener(onPlacementClick);
		placementJ8.setOnClickListener(onPlacementClick);
		placementJ9.setOnClickListener(onPlacementClick);
		placementJ10.setOnClickListener(onPlacementClick);
	}

	public void changeImage(ImageButton b) {
		b.setImageResource(R.drawable.gray);
	}
}