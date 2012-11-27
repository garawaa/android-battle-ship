package com.android.battleship;

import java.util.ArrayList;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

/**
 * This will be the starting screen for the app. From here we will click a button to open up a bluetooth
 * pairing screen and start a new game.
 * 
 * @author Team Battleship
 *
 */
@TargetApi(11)
public class MainActivity extends Activity implements OnClickListener {
	
	final Context context = this;
	GameMessages gm = new GameMessages();
	
	
	//Bryan's Temporary Variables
	BattleshipHitsAndMissesScreen hit;
	
	ArrayList<String> player1ShipArray = new ArrayList<String>(1);
	ArrayList<String> player2ShipArray = new ArrayList<String>(1);
	
	int player = 1;
	
	//End Bryan's Temporary Variables
	
	private BluetoothAdapter mBluetoothAdapter;
	private ArrayAdapter mArrayAdapter;
	private int REQUEST_ENABLE_BT = 1;
	private String gameInstructions =  "The objective of this game is to place your fleet's ships in your desired position."
			+ "  You can play with a friend or against the computer.  Once your ships are positioned,"
			+ " you will select coordinates for attacking the opponent's fleet and it will be determined"
			+ " whether you hit a ship.  Good luck!";
	private String fireShot = "Select a cell to fire a shot at your opponent's fleet.";

	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		gm.displayMsg(context, gameInstructions, "Game Instructions");		
		
	 	Button btTest = (Button) findViewById(R.id.bttest);		
	  
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.garnet));

		GridButtonDeclaration();
		
		btTest.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				Intent intent = new Intent(v.getContext(), BluetoothManagerScreen.class);
				//expects a return from the bluetooth screen, 1 for sucess, 0 for failure
				startActivityForResult(intent, 1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	    
	void GridButtonDeclaration()
	{
		Button A1;
		Button A2;
		Button A3;
		Button A4;
		Button A5;
		Button A6;
		Button A7;
		Button A8;
		Button A9;
		Button A10;
		Button B1;
		Button B2;
		Button B3;
		Button B4;
		Button B5;
		Button B6;
		Button B7;
		Button B8;
		Button B9;
		Button B10;
		Button C1;
		Button C2;
		Button C3;
		Button C4;
		Button C5;
		Button C6;
		Button C7;
		Button C8;
		Button C9;
		Button C10;
		Button D1;
		Button D2;
		Button D3;
		Button D4;
		Button D5;
		Button D6;
		Button D7;
		Button D8;
		Button D9;
		Button D10;
		Button E1;
		Button E2;
		Button E3;
		Button E4;
		Button E5;
		Button E6;
		Button E7;
		Button E8;
		Button E9;
		Button E10;
		Button F1;
		Button F2;
		Button F3;
		Button F4;
		Button F5;
		Button F6;
		Button F7;
		Button F8;
		Button F9;
		Button F10;
		Button G1;
		Button G2;
		Button G3;
		Button G4;
		Button G5;
		Button G6;
		Button G7;
		Button G8;
		Button G9;
		Button G10;
		Button H1;
		Button H2;
		Button H3;
		Button H4;
		Button H5;
		Button H6;
		Button H7;
		Button H8;
		Button H9;
		Button H10;
		Button I1;
		Button I2;
		Button I3;
		Button I4;
		Button I5;
		Button I6;
		Button I7;
		Button I8;
		Button I9;
		Button I10;
		Button J1;
		Button J2;
		Button J3;
		Button J4;
		Button J5;
		Button J6;
		Button J7;
		Button J8;
		Button J9;
		Button J10;
		
		A1 = (Button) findViewById(R.id.A1);
		A2 = (Button) findViewById(R.id.A2);
		A3 = (Button) findViewById(R.id.A3);
		A4 = (Button) findViewById(R.id.A4);
		A5 = (Button) findViewById(R.id.A5);
		A6 = (Button) findViewById(R.id.A6);
		A7 = (Button) findViewById(R.id.A7);
		A8 = (Button) findViewById(R.id.A8);
		A9 = (Button) findViewById(R.id.A9);
		A10 = (Button) findViewById(R.id.A10);
		B1 = (Button) findViewById(R.id.B1);
		B2 = (Button) findViewById(R.id.B2);
		B3 = (Button) findViewById(R.id.B3);
		B4 = (Button) findViewById(R.id.B4);
		B5 = (Button) findViewById(R.id.B5);
		B6 = (Button) findViewById(R.id.B6);
		B7 = (Button) findViewById(R.id.B7);
		B8 = (Button) findViewById(R.id.B8);
		B9 = (Button) findViewById(R.id.B9);
		B10 = (Button) findViewById(R.id.B10);
		C1 = (Button) findViewById(R.id.C1);
		C2 = (Button) findViewById(R.id.C2);
		C3 = (Button) findViewById(R.id.C3);
		C4 = (Button) findViewById(R.id.C4);
		C5 = (Button) findViewById(R.id.C5);
		C6 = (Button) findViewById(R.id.C6);
		C7 = (Button) findViewById(R.id.C7);
		C8 = (Button) findViewById(R.id.C8);
		C9 = (Button) findViewById(R.id.C9);
		C10 = (Button) findViewById(R.id.C10);
		D1 = (Button) findViewById(R.id.D1);
		D2 = (Button) findViewById(R.id.D2);
		D3 = (Button) findViewById(R.id.D3);
		D4 = (Button) findViewById(R.id.D4);
		D5 = (Button) findViewById(R.id.D5);
		D6 = (Button) findViewById(R.id.D6);
		D7 = (Button) findViewById(R.id.D7);
		D8 = (Button) findViewById(R.id.D8);
		D9 = (Button) findViewById(R.id.D9);
		D10 = (Button) findViewById(R.id.D10);
		E1 = (Button) findViewById(R.id.E1);
		E2 = (Button) findViewById(R.id.E2);
		E3 = (Button) findViewById(R.id.E3);
		E4 = (Button) findViewById(R.id.E4);
		E5 = (Button) findViewById(R.id.E5);
		E6 = (Button) findViewById(R.id.E6);
		E7 = (Button) findViewById(R.id.E7);
		E8 = (Button) findViewById(R.id.E8);
		E9 = (Button) findViewById(R.id.E9);
		E10 = (Button) findViewById(R.id.E10);
		F1 = (Button) findViewById(R.id.F1);
		F2 = (Button) findViewById(R.id.F2);
		F3 = (Button) findViewById(R.id.F3);
		F4 = (Button) findViewById(R.id.F4);
		F5 = (Button) findViewById(R.id.F5);
		F6 = (Button) findViewById(R.id.F6);
		F7 = (Button) findViewById(R.id.F7);
		F8 = (Button) findViewById(R.id.F8);
		F9 = (Button) findViewById(R.id.F9);
		F10 = (Button) findViewById(R.id.F10);
		G1 = (Button) findViewById(R.id.G1);
		G2 = (Button) findViewById(R.id.G2);
		G3 = (Button) findViewById(R.id.G3);
		G4 = (Button) findViewById(R.id.G4);
		G5 = (Button) findViewById(R.id.G5);
		G6 = (Button) findViewById(R.id.G6);
		G7 = (Button) findViewById(R.id.G7);
		G8 = (Button) findViewById(R.id.G8);
		G9 = (Button) findViewById(R.id.G9);
		G10 = (Button) findViewById(R.id.G10);
		H1 = (Button) findViewById(R.id.H1);
		H2 = (Button) findViewById(R.id.H2);
		H3 = (Button) findViewById(R.id.H3);
		H4 = (Button) findViewById(R.id.H4);
		H5 = (Button) findViewById(R.id.H5);
		H6 = (Button) findViewById(R.id.H6);
		H7 = (Button) findViewById(R.id.H7);
		H8 = (Button) findViewById(R.id.H8);
		H9 = (Button) findViewById(R.id.H9);
		H10 = (Button) findViewById(R.id.H10);
		I1 = (Button) findViewById(R.id.I1);
		I2 = (Button) findViewById(R.id.I2);
		I3 = (Button) findViewById(R.id.I3);
		I4 = (Button) findViewById(R.id.I4);
		I5 = (Button) findViewById(R.id.I5);
		I6 = (Button) findViewById(R.id.I6);
		I7 = (Button) findViewById(R.id.I7);
		I8 = (Button) findViewById(R.id.I8);
		I9 = (Button) findViewById(R.id.I9);
		I10 = (Button) findViewById(R.id.I10);
		J1 = (Button) findViewById(R.id.J1);
		J2 = (Button) findViewById(R.id.J2);
		J3 = (Button) findViewById(R.id.J3);
		J4 = (Button) findViewById(R.id.J4);
		J5 = (Button) findViewById(R.id.J5);
		J6 = (Button) findViewById(R.id.J6);
		J7 = (Button) findViewById(R.id.J7);
		J8 = (Button) findViewById(R.id.J8);
		J9 = (Button) findViewById(R.id.J9);
		J10 = (Button) findViewById(R.id.J10);
		
	}
	
	public void onClick(View v)
	{
		//Implemented onClick method courtesy of TheNewBoston on youtube
		switch (v.getId())
		{
			
			case R.id.A1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.A10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "A10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "A10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.B10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "B10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "B10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.C10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "C10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "C10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.D10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "D10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "D10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.E10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "E10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "E10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.F10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "F10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "F10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.G10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "G10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "G10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.H10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "H10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "H10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.I10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "I10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "I10");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J1:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J1");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J1");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J2:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J2");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J2");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J3:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J3");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J3");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J4:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J4");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J4");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J5:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J5");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J5");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J6:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J6");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J6");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J7:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J7");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J7");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J8:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J8");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J8");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J9:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J9");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J9");
	
					player = 1;
				}
	
				break;
	
	
			case R.id.J10:
	
				if (player == 1)
				{
					hit.CheckForHit(player1ShipArray, "J10");
	
					player = 2;
				}
	
				else
				{
					hit.CheckForHit(player2ShipArray, "J10");
	
					player = 1;
				}
	
				break;
				 
      case R.id.gameButton1:
      
        setContentView(R.layout.grid_screen);
        gm.displayMsg(context, fireShot, "Fire when ready!");

				 break;
             
      case R.id.gameButton2:
      
        setContentView(R.layout.grid_screen);
        gm.displayMsg(context, fireShot, "Fire when ready!");

				 break;
                         
			default:
				
				break;
		
		}
	}
}