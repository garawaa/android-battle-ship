package com.android.battleship;

import java.util.ArrayList;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

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
	BattleshipPlacementScreen shipPlacement;
	
	String msg;
	
	ImageButton placementA1 = (ImageButton) findViewById(R.id.placementA1);	
	ImageButton placementA2 = (ImageButton) findViewById(R.id.placementA2);
	ImageButton placementA3 = (ImageButton) findViewById(R.id.placementA3);
	ImageButton placementA4 = (ImageButton) findViewById(R.id.placementA4);
	ImageButton placementA5 = (ImageButton) findViewById(R.id.placementA5);
	ImageButton placementA6 = (ImageButton) findViewById(R.id.placementA6);
	ImageButton placementA7 = (ImageButton) findViewById(R.id.placementA7);
	ImageButton placementA8 = (ImageButton) findViewById(R.id.placementA8);
	ImageButton placementA9 = (ImageButton) findViewById(R.id.placementA9);
	ImageButton placementA10 = (ImageButton) findViewById(R.id.placementA10);
	ImageButton placementB1 = (ImageButton) findViewById(R.id.placementB1);
	ImageButton placementB2 = (ImageButton) findViewById(R.id.placementB2);
	ImageButton placementB3 = (ImageButton) findViewById(R.id.placementB3);
	ImageButton placementB4 = (ImageButton) findViewById(R.id.placementB4);
	ImageButton placementB5 = (ImageButton) findViewById(R.id.placementB5);
	ImageButton placementB6 = (ImageButton) findViewById(R.id.placementB6);
	ImageButton placementB7 = (ImageButton) findViewById(R.id.placementB7);
	ImageButton placementB8 = (ImageButton) findViewById(R.id.placementB8);
	ImageButton placementB9 = (ImageButton) findViewById(R.id.placementB9);
	ImageButton placementB10 = (ImageButton) findViewById(R.id.placementB10);
	ImageButton placementC1 = (ImageButton) findViewById(R.id.placementC1);
	ImageButton placementC2 = (ImageButton) findViewById(R.id.placementC2);
	ImageButton placementC3 = (ImageButton) findViewById(R.id.placementC3);
	ImageButton placementC4 = (ImageButton) findViewById(R.id.placementC4);
	ImageButton placementC5 = (ImageButton) findViewById(R.id.placementC5);
	ImageButton placementC6 = (ImageButton) findViewById(R.id.placementC6);
	ImageButton placementC7 = (ImageButton) findViewById(R.id.placementC7);
	ImageButton placementC8 = (ImageButton) findViewById(R.id.placementC8);
	ImageButton placementC9 = (ImageButton) findViewById(R.id.placementC9);
	ImageButton placementC10 = (ImageButton) findViewById(R.id.placementC10);
	ImageButton placementD1 = (ImageButton) findViewById(R.id.placementD1);
	ImageButton placementD2 = (ImageButton) findViewById(R.id.placementD2);
	ImageButton placementD3 = (ImageButton) findViewById(R.id.placementD3);
	ImageButton placementD4 = (ImageButton) findViewById(R.id.placementD4);
	ImageButton placementD5 = (ImageButton) findViewById(R.id.placementD5);
	ImageButton placementD6 = (ImageButton) findViewById(R.id.placementD6);
	ImageButton placementD7 = (ImageButton) findViewById(R.id.placementD7);
	ImageButton placementD8 = (ImageButton) findViewById(R.id.placementD8);
	ImageButton placementD9 = (ImageButton) findViewById(R.id.placementD9);
	ImageButton placementD10 = (ImageButton) findViewById(R.id.placementD10);
	ImageButton placementE1 = (ImageButton) findViewById(R.id.placementE1);
	ImageButton placementE2 = (ImageButton) findViewById(R.id.placementE2);
	ImageButton placementE3 = (ImageButton) findViewById(R.id.placementE3);
	ImageButton placementE4 = (ImageButton) findViewById(R.id.placementE4);
	ImageButton placementE5 = (ImageButton) findViewById(R.id.placementE5);
	ImageButton placementE6 = (ImageButton) findViewById(R.id.placementE6);
	ImageButton placementE7 = (ImageButton) findViewById(R.id.placementE7);
	ImageButton placementE8 = (ImageButton) findViewById(R.id.placementE8);
	ImageButton placementE9 = (ImageButton) findViewById(R.id.placementE9);
	ImageButton placementE10 = (ImageButton) findViewById(R.id.placementE10);
	ImageButton placementF1 = (ImageButton) findViewById(R.id.placementF1);
	ImageButton placementF2 = (ImageButton) findViewById(R.id.placementF2);
	ImageButton placementF3 = (ImageButton) findViewById(R.id.placementF3);
	ImageButton placementF4 = (ImageButton) findViewById(R.id.placementF4);
	ImageButton placementF5 = (ImageButton) findViewById(R.id.placementF5);
	ImageButton placementF6 = (ImageButton) findViewById(R.id.placementF6);
	ImageButton placementF7 = (ImageButton) findViewById(R.id.placementF7);
	ImageButton placementF8 = (ImageButton) findViewById(R.id.placementF8);
	ImageButton placementF9 = (ImageButton) findViewById(R.id.placementF9);
	ImageButton placementF10 = (ImageButton) findViewById(R.id.placementF10);
	ImageButton placementG1 = (ImageButton) findViewById(R.id.placementG1);
	ImageButton placementG2 = (ImageButton) findViewById(R.id.placementG2);
	ImageButton placementG3 = (ImageButton) findViewById(R.id.placementG3);
	ImageButton placementG4 = (ImageButton) findViewById(R.id.placementG4);
	ImageButton placementG5 = (ImageButton) findViewById(R.id.placementG5);
	ImageButton placementG6 = (ImageButton) findViewById(R.id.placementG6);
	ImageButton placementG7 = (ImageButton) findViewById(R.id.placementG7);
	ImageButton placementG8 = (ImageButton) findViewById(R.id.placementG8);
	ImageButton placementG9 = (ImageButton) findViewById(R.id.placementG9);
	ImageButton placementG10 = (ImageButton) findViewById(R.id.placementG10);
	ImageButton placementH1 = (ImageButton) findViewById(R.id.placementH1);
	ImageButton placementH2 = (ImageButton) findViewById(R.id.placementH2);
	ImageButton placementH3 = (ImageButton) findViewById(R.id.placementH3);
	ImageButton placementH4 = (ImageButton) findViewById(R.id.placementH4);
	ImageButton placementH5 = (ImageButton) findViewById(R.id.placementH5);
	ImageButton placementH6 = (ImageButton) findViewById(R.id.placementH6);
	ImageButton placementH7 = (ImageButton) findViewById(R.id.placementH7);
	ImageButton placementH8 = (ImageButton) findViewById(R.id.placementH8);
	ImageButton placementH9 = (ImageButton) findViewById(R.id.placementH9);
	ImageButton placementH10 = (ImageButton) findViewById(R.id.placementH10);
	ImageButton placementI1 = (ImageButton) findViewById(R.id.placementI1);
	ImageButton placementI2 = (ImageButton) findViewById(R.id.placementI2);
	ImageButton placementI3 = (ImageButton) findViewById(R.id.placementI3);
	ImageButton placementI4 = (ImageButton) findViewById(R.id.placementI4);
	ImageButton placementI5 = (ImageButton) findViewById(R.id.placementI5);
	ImageButton placementI6 = (ImageButton) findViewById(R.id.placementI6);
	ImageButton placementI7 = (ImageButton) findViewById(R.id.placementI7);
	ImageButton placementI8 = (ImageButton) findViewById(R.id.placementI8);
	ImageButton placementI9 = (ImageButton) findViewById(R.id.placementI9);
	ImageButton placementI10 = (ImageButton) findViewById(R.id.placementI10);
	ImageButton placementJ1 = (ImageButton) findViewById(R.id.placementJ1);
	ImageButton placementJ2 = (ImageButton) findViewById(R.id.placementJ2);
	ImageButton placementJ3 = (ImageButton) findViewById(R.id.placementJ3);
	ImageButton placementJ4 = (ImageButton) findViewById(R.id.placementJ4);
	ImageButton placementJ5 = (ImageButton) findViewById(R.id.placementJ5);
	ImageButton placementJ6 = (ImageButton) findViewById(R.id.placementJ6);
	ImageButton placementJ7 = (ImageButton) findViewById(R.id.placementJ7);
	ImageButton placementJ8 = (ImageButton) findViewById(R.id.placementJ8);
	ImageButton placementJ9 = (ImageButton) findViewById(R.id.placementJ9);
	ImageButton placementJ10 = (ImageButton) findViewById(R.id.placementJ10);
	
	Button b1 = (Button) findViewById(R.id.gameButton1);
	
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
	private String battleShip = "Please select 5 cells adjacent to one another horizontally or vertically"
			+ " to set your battleship";
	
	
	
	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		gm.displayMsg(context, gameInstructions, "Game Instructions");		
		
	 	Button btTest = (Button) findViewById(R.id.bttest);		
	  
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.garnet));

		btTest.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				Intent intent = new Intent(v.getContext(), BluetoothManagerScreen.class);
				//expects a return from the bluetooth screen, 1 for sucess, 0 for failure
				startActivityForResult(intent, 1);
			}
		});
		

		placementA1.setOnClickListener(this);
		placementA2.setOnClickListener(this);
		placementA3.setOnClickListener(this);
		placementA4.setOnClickListener(this);
		placementA5.setOnClickListener(this);
		placementA6.setOnClickListener(this);
		placementA7.setOnClickListener(this);
		placementA8.setOnClickListener(this);
		placementA9.setOnClickListener(this);
		placementA10.setOnClickListener(this);
		placementB1.setOnClickListener(this);
		placementB2.setOnClickListener(this);
		placementB3.setOnClickListener(this);
		placementB4.setOnClickListener(this);
		placementB5.setOnClickListener(this);
		placementB6.setOnClickListener(this);
		placementB7.setOnClickListener(this);
		placementB8.setOnClickListener(this);
		placementB9.setOnClickListener(this);
		placementB10.setOnClickListener(this);
		placementC1.setOnClickListener(this);
		placementC2.setOnClickListener(this);
		placementC3.setOnClickListener(this);
		placementC4.setOnClickListener(this);
		placementC5.setOnClickListener(this);
		placementC6.setOnClickListener(this);
		placementC7.setOnClickListener(this);
		placementC8.setOnClickListener(this);
		placementC9.setOnClickListener(this);
		placementC10.setOnClickListener(this);
		placementD1.setOnClickListener(this);
		placementD2.setOnClickListener(this);
		placementD3.setOnClickListener(this);
		placementD4.setOnClickListener(this);
		placementD5.setOnClickListener(this);
		placementD6.setOnClickListener(this);
		placementD7.setOnClickListener(this);
		placementD8.setOnClickListener(this);
		placementD9.setOnClickListener(this);
		placementD10.setOnClickListener(this);
		placementE1.setOnClickListener(this);
		placementE2.setOnClickListener(this);
		placementE3.setOnClickListener(this);
		placementE4.setOnClickListener(this);
		placementE5.setOnClickListener(this);
		placementE6.setOnClickListener(this);
		placementE7.setOnClickListener(this);
		placementE8.setOnClickListener(this);
		placementE9.setOnClickListener(this);
		placementE10.setOnClickListener(this);
		placementF1.setOnClickListener(this);
		placementF2.setOnClickListener(this);
		placementF3.setOnClickListener(this);
		placementF4.setOnClickListener(this);
		placementF5.setOnClickListener(this);
		placementF6.setOnClickListener(this);
		placementF7.setOnClickListener(this);
		placementF8.setOnClickListener(this);
		placementF9.setOnClickListener(this);
		placementF10.setOnClickListener(this);
		placementG1.setOnClickListener(this);
		placementG2.setOnClickListener(this);
		placementG3.setOnClickListener(this);
		placementG4.setOnClickListener(this);
		placementG5.setOnClickListener(this);
		placementG6.setOnClickListener(this);
		placementG7.setOnClickListener(this);
		placementG8.setOnClickListener(this);
		placementG9.setOnClickListener(this);
		placementG10.setOnClickListener(this);
		placementH1.setOnClickListener(this);
		placementH2.setOnClickListener(this);
		placementH3.setOnClickListener(this);
		placementH4.setOnClickListener(this);
		placementH5.setOnClickListener(this);
		placementH6.setOnClickListener(this);
		placementH7.setOnClickListener(this);
		placementH8.setOnClickListener(this);
		placementH9.setOnClickListener(this);
		placementH10.setOnClickListener(this);
		placementI1.setOnClickListener(this);
		placementI2.setOnClickListener(this);
		placementI3.setOnClickListener(this);
		placementI4.setOnClickListener(this);
		placementI5.setOnClickListener(this);
		placementI6.setOnClickListener(this);
		placementI7.setOnClickListener(this);
		placementI8.setOnClickListener(this);
		placementI9.setOnClickListener(this);
		placementI10.setOnClickListener(this);
		placementJ1.setOnClickListener(this);
		placementJ2.setOnClickListener(this);
		placementJ3.setOnClickListener(this);
		placementJ4.setOnClickListener(this);
		placementJ5.setOnClickListener(this);
		placementJ6.setOnClickListener(this);
		placementJ7.setOnClickListener(this);
		placementJ8.setOnClickListener(this);
		placementJ9.setOnClickListener(this);
		placementJ10.setOnClickListener(this);
		
		b1.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	    
	
	public void onClick(View v)
	{
		
		//Implemented onClick method courtesy of TheNewBoston on youtube
		switch (v.getId())
		{
			
		case R.id.A1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A1");

				player = 1;
			}

			break;


		case R.id.A2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A2");

				player = 1;
			}

			break;


		case R.id.A3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A3");

				player = 1;
			}

			break;


		case R.id.A4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A4");

				player = 1;
			}

			break;


		case R.id.A5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A5");

				player = 1;
			}

			break;


		case R.id.A6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A6");

				player = 1;
			}

			break;


		case R.id.A7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A7");

				player = 1;
			}

			break;


		case R.id.A8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A8");

				player = 1;
			}

			break;


		case R.id.A9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A9");

				player = 1;
			}

			break;


		case R.id.A10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "A10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "A10");

				player = 1;
			}

			break;


		case R.id.B1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B1");

				player = 1;
			}

			break;


		case R.id.B2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B2");

				player = 1;
			}

			break;


		case R.id.B3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B3");

				player = 1;
			}

			break;


		case R.id.B4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B4");

				player = 1;
			}

			break;


		case R.id.B5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B5");

				player = 1;
			}

			break;


		case R.id.B6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B6");

				player = 1;
			}

			break;


		case R.id.B7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B7");

				player = 1;
			}

			break;


		case R.id.B8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B8");

				player = 1;
			}

			break;


		case R.id.B9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B9");

				player = 1;
			}

			break;


		case R.id.B10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "B10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "B10");

				player = 1;
			}

			break;


		case R.id.C1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C1");

				player = 1;
			}

			break;


		case R.id.C2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C2");

				player = 1;
			}

			break;


		case R.id.C3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C3");

				player = 1;
			}

			break;


		case R.id.C4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C4");

				player = 1;
			}

			break;


		case R.id.C5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C5");

				player = 1;
			}

			break;


		case R.id.C6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C6");

				player = 1;
			}

			break;


		case R.id.C7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C7");

				player = 1;
			}

			break;


		case R.id.C8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C8");

				player = 1;
			}

			break;


		case R.id.C9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C9");

				player = 1;
			}

			break;


		case R.id.C10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "C10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "C10");

				player = 1;
			}

			break;


		case R.id.D1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D1");

				player = 1;
			}

			break;


		case R.id.D2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D2");

				player = 1;
			}

			break;


		case R.id.D3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D3");

				player = 1;
			}

			break;


		case R.id.D4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D4");

				player = 1;
			}

			break;


		case R.id.D5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D5");

				player = 1;
			}

			break;


		case R.id.D6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D6");

				player = 1;
			}

			break;


		case R.id.D7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D7");

				player = 1;
			}

			break;


		case R.id.D8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D8");

				player = 1;
			}

			break;


		case R.id.D9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D9");

				player = 1;
			}

			break;


		case R.id.D10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "D10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "D10");

				player = 1;
			}

			break;


		case R.id.E1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E1");

				player = 1;
			}

			break;


		case R.id.E2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E2");

				player = 1;
			}

			break;


		case R.id.E3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E3");

				player = 1;
			}

			break;


		case R.id.E4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E4");

				player = 1;
			}

			break;


		case R.id.E5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E5");

				player = 1;
			}

			break;


		case R.id.E6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E6");

				player = 1;
			}

			break;


		case R.id.E7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E7");

				player = 1;
			}

			break;


		case R.id.E8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E8");

				player = 1;
			}

			break;


		case R.id.E9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E9");

				player = 1;
			}

			break;


		case R.id.E10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "E10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "E10");

				player = 1;
			}

			break;


		case R.id.F1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F1");

				player = 1;
			}

			break;


		case R.id.F2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F2");

				player = 1;
			}

			break;


		case R.id.F3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F3");

				player = 1;
			}

			break;


		case R.id.F4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F4");

				player = 1;
			}

			break;


		case R.id.F5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F5");

				player = 1;
			}

			break;


		case R.id.F6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F6");

				player = 1;
			}

			break;


		case R.id.F7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F7");

				player = 1;
			}

			break;


		case R.id.F8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F8");

				player = 1;
			}

			break;


		case R.id.F9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F9");

				player = 1;
			}

			break;


		case R.id.F10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "F10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "F10");

				player = 1;
			}

			break;


		case R.id.G1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G1");

				player = 1;
			}

			break;


		case R.id.G2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G2");

				player = 1;
			}

			break;


		case R.id.G3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G3");

				player = 1;
			}

			break;


		case R.id.G4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G4");

				player = 1;
			}

			break;


		case R.id.G5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G5");

				player = 1;
			}

			break;


		case R.id.G6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G6");

				player = 1;
			}

			break;


		case R.id.G7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G7");

				player = 1;
			}

			break;


		case R.id.G8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G8");

				player = 1;
			}

			break;


		case R.id.G9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G9");

				player = 1;
			}

			break;


		case R.id.G10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "G10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "G10");

				player = 1;
			}

			break;


		case R.id.H1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H1");

				player = 1;
			}

			break;


		case R.id.H2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H2");

				player = 1;
			}

			break;


		case R.id.H3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H3");

				player = 1;
			}

			break;


		case R.id.H4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H4");

				player = 1;
			}

			break;


		case R.id.H5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H5");

				player = 1;
			}

			break;


		case R.id.H6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H6");

				player = 1;
			}

			break;


		case R.id.H7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H7");

				player = 1;
			}

			break;


		case R.id.H8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H8");

				player = 1;
			}

			break;


		case R.id.H9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H9");

				player = 1;
			}

			break;


		case R.id.H10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "H10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "H10");

				player = 1;
			}

			break;


		case R.id.I1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I1");

				player = 1;
			}

			break;


		case R.id.I2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I2");

				player = 1;
			}

			break;


		case R.id.I3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I3");

				player = 1;
			}

			break;


		case R.id.I4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I4");

				player = 1;
			}

			break;


		case R.id.I5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I5");

				player = 1;
			}

			break;


		case R.id.I6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I6");

				player = 1;
			}

			break;


		case R.id.I7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I7");

				player = 1;
			}

			break;


		case R.id.I8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I8");

				player = 1;
			}

			break;


		case R.id.I9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I9");

				player = 1;
			}

			break;


		case R.id.I10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "I10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "I10");

				player = 1;
			}

			break;


		case R.id.J1:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J1");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J1");

				player = 1;
			}

			break;


		case R.id.J2:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J2");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J2");

				player = 1;
			}

			break;


		case R.id.J3:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J3");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J3");

				player = 1;
			}

			break;


		case R.id.J4:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J4");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J4");

				player = 1;
			}

			break;


		case R.id.J5:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J5");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J5");

				player = 1;
			}

			break;


		case R.id.J6:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J6");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J6");

				player = 1;
			}

			break;


		case R.id.J7:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J7");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J7");

				player = 1;
			}

			break;


		case R.id.J8:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J8");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J8");

				player = 1;
			}

			break;


		case R.id.J9:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J9");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J9");

				player = 1;
			}

			break;


		case R.id.J10:

			if (player == 1)
			{
				hit.CheckForHit(player2ShipArray, "J10");

				player = 2;
			}

			else
			{
				hit.CheckForHit(player1ShipArray, "J10");

				player = 1;
			}

			break;
				 
		case R.id.gameButton1:
			
			Log.v(msg, "I got clicked!");
			setContentView(R.layout.placement_layout);
			gm.displayMsg(context, "Place Your Ship", battleShip);

			break;
             
		case R.id.gameButton2:
      
			setContentView(R.layout.placement_layout);
			gm.displayMsg(context, "Place Your Ship", battleShip);

			break;
			
		case R.id.placementA1:
			shipPlacement.placeShips("A1",1,placementA1);
			break;

		case R.id.placementA2:
			shipPlacement.placeShips("A2",2,placementA2);
			break;

		case R.id.placementA3:
			shipPlacement.placeShips("A3",3,placementA3);
			break;

		case R.id.placementA4:
			shipPlacement.placeShips("A4",4,placementA4);
			break;

		case R.id.placementA5:
			shipPlacement.placeShips("A5",5,placementA5);
			break;

		case R.id.placementA6:
			shipPlacement.placeShips("A6",6,placementA6);
			break;

		case R.id.placementA7:
			shipPlacement.placeShips("A7",7,placementA7);
			break;

		case R.id.placementA8:
			shipPlacement.placeShips("A8",8,placementA8);
			break;

		case R.id.placementA9:
			shipPlacement.placeShips("A9",9,placementA9);
			break;

		case R.id.placementA10:
			shipPlacement.placeShips("A10",10,placementA10);
			break;

		case R.id.placementB1:
			shipPlacement.placeShips("B1",11,placementB1);
			break;

		case R.id.placementB2:
			shipPlacement.placeShips("B2",12,placementB2);
			break;

		case R.id.placementB3:
			shipPlacement.placeShips("B3",13,placementB3);
			break;

		case R.id.placementB4:
			shipPlacement.placeShips("B4",14,placementB4);
			break;

		case R.id.placementB5:
			shipPlacement.placeShips("B5",15,placementB5);
			break;

		case R.id.placementB6:
			shipPlacement.placeShips("B6",16,placementB6);
			break;

		case R.id.placementB7:
			shipPlacement.placeShips("B7",17,placementB7);
			break;

		case R.id.placementB8:
			shipPlacement.placeShips("B8",18,placementB8);
			break;

		case R.id.placementB9:
			shipPlacement.placeShips("B9",19,placementB9);
			break;

		case R.id.placementB10:
			shipPlacement.placeShips("B10",20,placementB10);
			break;

		case R.id.placementC1:
			shipPlacement.placeShips("C1",21,placementC1);
			break;

		case R.id.placementC2:
			shipPlacement.placeShips("C2",22,placementC2);
			break;

		case R.id.placementC3:
			shipPlacement.placeShips("C3",23,placementC3);
			break;

		case R.id.placementC4:
			shipPlacement.placeShips("C4",24,placementC4);
			break;

		case R.id.placementC5:
			shipPlacement.placeShips("C5",25,placementC5);
			break;

		case R.id.placementC6:
			shipPlacement.placeShips("C6",26,placementC6);
			break;

		case R.id.placementC7:
			shipPlacement.placeShips("C7",27,placementC7);
			break;

		case R.id.placementC8:
			shipPlacement.placeShips("C8",28,placementC8);
			break;

		case R.id.placementC9:
			shipPlacement.placeShips("C9",29,placementC9);
			break;

		case R.id.placementC10:
			shipPlacement.placeShips("C10",30,placementC10);
			break;

		case R.id.placementD1:
			shipPlacement.placeShips("D1",31,placementD1);
			break;

		case R.id.placementD2:
			shipPlacement.placeShips("D2",32,placementD2);
			break;

		case R.id.placementD3:
			shipPlacement.placeShips("D3",33,placementD3);
			break;

		case R.id.placementD4:
			shipPlacement.placeShips("D4",34,placementD4);
			break;

		case R.id.placementD5:
			shipPlacement.placeShips("D5",35,placementD5);
			break;

		case R.id.placementD6:
			shipPlacement.placeShips("D6",36,placementD6);
			break;

		case R.id.placementD7:
			shipPlacement.placeShips("D7",37,placementD7);
			break;

		case R.id.placementD8:
			shipPlacement.placeShips("D8",38,placementD8);
			break;

		case R.id.placementD9:
			shipPlacement.placeShips("D9",39,placementD9);
			break;

		case R.id.placementD10:
			shipPlacement.placeShips("D10",40,placementD10);
			break;

		case R.id.placementE1:
			shipPlacement.placeShips("E1",41,placementE1);
			break;

		case R.id.placementE2:
			shipPlacement.placeShips("E2",42,placementE2);
			break;

		case R.id.placementE3:
			shipPlacement.placeShips("E3",43,placementE3);
			break;

		case R.id.placementE4:
			shipPlacement.placeShips("E4",44,placementE4);
			break;

		case R.id.placementE5:
			shipPlacement.placeShips("E5",45,placementE5);
			break;

		case R.id.placementE6:
			shipPlacement.placeShips("E6",46,placementE6);
			break;

		case R.id.placementE7:
			shipPlacement.placeShips("E7",47,placementE7);
			break;

		case R.id.placementE8:
			shipPlacement.placeShips("E8",48,placementE8);
			break;

		case R.id.placementE9:
			shipPlacement.placeShips("E9",49,placementE9);
			break;

		case R.id.placementE10:
			shipPlacement.placeShips("E10",50,placementE10);
			break;

		case R.id.placementF1:
			shipPlacement.placeShips("F1",51,placementF1);
			break;

		case R.id.placementF2:
			shipPlacement.placeShips("F2",52,placementF2);
			break;

		case R.id.placementF3:
			shipPlacement.placeShips("F3",53,placementF3);
			break;

		case R.id.placementF4:
			shipPlacement.placeShips("F4",54,placementF4);
			break;

		case R.id.placementF5:
			shipPlacement.placeShips("F5",55,placementF5);
			break;

		case R.id.placementF6:
			shipPlacement.placeShips("F6",56,placementF6);
			break;

		case R.id.placementF7:
			shipPlacement.placeShips("F7",57,placementF7);
			break;

		case R.id.placementF8:
			shipPlacement.placeShips("F8",58,placementF8);
			break;

		case R.id.placementF9:
			shipPlacement.placeShips("F9",59,placementF9);
			break;

		case R.id.placementF10:
			shipPlacement.placeShips("F10",60,placementF10);
			break;

		case R.id.placementG1:
			shipPlacement.placeShips("G1",61,placementG1);
			break;

		case R.id.placementG2:
			shipPlacement.placeShips("G2",62,placementG2);
			break;

		case R.id.placementG3:
			shipPlacement.placeShips("G3",63,placementG3);
			break;

		case R.id.placementG4:
			shipPlacement.placeShips("G4",64,placementG4);
			break;

		case R.id.placementG5:
			shipPlacement.placeShips("G5",65,placementG5);
			break;

		case R.id.placementG6:
			shipPlacement.placeShips("G6",66,placementG6);
			break;

		case R.id.placementG7:
			shipPlacement.placeShips("G7",67,placementG7);
			break;

		case R.id.placementG8:
			shipPlacement.placeShips("G8",68,placementG8);
			break;

		case R.id.placementG9:
			shipPlacement.placeShips("G9",69,placementG9);
			break;

		case R.id.placementG10:
			shipPlacement.placeShips("G10",70,placementG10);
			break;

		case R.id.placementH1:
			shipPlacement.placeShips("H1",71,placementH1);
			break;

		case R.id.placementH2:
			shipPlacement.placeShips("H2",72,placementH2);
			break;

		case R.id.placementH3:
			shipPlacement.placeShips("H3",73,placementH3);
			break;

		case R.id.placementH4:
			shipPlacement.placeShips("H4",74,placementH4);
			break;

		case R.id.placementH5:
			shipPlacement.placeShips("H5",75,placementH5);
			break;

		case R.id.placementH6:
			shipPlacement.placeShips("H6",76,placementH6);
			break;

		case R.id.placementH7:
			shipPlacement.placeShips("H7",77,placementH7);
			break;

		case R.id.placementH8:
			shipPlacement.placeShips("H8",78,placementH8);
			break;

		case R.id.placementH9:
			shipPlacement.placeShips("H9",79,placementH9);
			break;

		case R.id.placementH10:
			shipPlacement.placeShips("H10",80,placementH10);
			break;

		case R.id.placementI1:
			shipPlacement.placeShips("I1",81,placementI1);
			break;

		case R.id.placementI2:
			shipPlacement.placeShips("I2",82,placementI2);
			break;

		case R.id.placementI3:
			shipPlacement.placeShips("I3",83,placementI3);
			break;

		case R.id.placementI4:
			shipPlacement.placeShips("I4",84,placementI4);
			break;

		case R.id.placementI5:
			shipPlacement.placeShips("I5",85,placementI5);
			break;

		case R.id.placementI6:
			shipPlacement.placeShips("I6",86,placementI6);
			break;

		case R.id.placementI7:
			shipPlacement.placeShips("I7",87,placementI7);
			break;

		case R.id.placementI8:
			shipPlacement.placeShips("I8",88,placementI8);
			break;

		case R.id.placementI9:
			shipPlacement.placeShips("I9",89,placementI9);
			break;

		case R.id.placementI10:
			shipPlacement.placeShips("I10",90,placementI10);
			break;

		case R.id.placementJ1:
			shipPlacement.placeShips("J1",91,placementJ1);
			break;

		case R.id.placementJ2:
			shipPlacement.placeShips("J2",92,placementJ2);
			break;

		case R.id.placementJ3:
			shipPlacement.placeShips("J3",93,placementJ3);
			break;

		case R.id.placementJ4:
			shipPlacement.placeShips("J4",94,placementJ4);
			break;

		case R.id.placementJ5:
			shipPlacement.placeShips("J5",95,placementJ5);
			break;

		case R.id.placementJ6:
			shipPlacement.placeShips("J6",96,placementJ6);
			break;

		case R.id.placementJ7:
			shipPlacement.placeShips("J7",97,placementJ7);
			break;

		case R.id.placementJ8:
			shipPlacement.placeShips("J8",98,placementJ8);
			break;

		case R.id.placementJ9:
			shipPlacement.placeShips("J9",99,placementJ9);
			break;

		case R.id.placementJ10:
			shipPlacement.placeShips("J10",100,placementJ10);
			break;
              
		default:
				
			break;
		
		}
	}
}