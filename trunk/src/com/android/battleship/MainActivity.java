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

/**
 * This will be the starting screen for the app. From here we will click a button to open up a bluetooth
 * pairing screen and start a new game.
 * 
 * @author Team Battleship
 *
 */
@TargetApi(11)
public class MainActivity extends Activity {
	
	final Context context = this;
	GameMessages gm = new GameMessages();	
	BattleshipPlacementScreen shipPlacement;
	static CPUPlayer cpu = null; // For use in the 1-player game
	String msg;
	Button b1;
	Button b2;
	static int player = 1;
	
	static ArrayList<String> player1ShipArray = new ArrayList<String>(1);
	static ArrayList<String> player2ShipArray = new ArrayList<String>(1);
	
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

		btTest.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				Intent intent = new Intent(v.getContext(), BluetoothManagerScreen.class);
				//expects a return from the bluetooth screen, 1 for sucess, 0 for failure
				startActivityForResult(intent, 1);
			}
		});
		

		b1 = (Button) findViewById(R.id.gameButton1);
		b2 = (Button) findViewById(R.id.gameButton2);
		
		init();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	void init()
	{
		b1.setOnClickListener(onClick);
		b2.setOnClickListener(onClick);
	}
	    
	private OnClickListener onClick = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(v.getContext(), BattleshipPlacementScreen.class);
			switch (v.getId())
			{
					 
				case R.id.gameButton1:
					
					startActivityForResult(intent, 1);
					cpu = new CPUPlayer();
		
					break;
		             
				case R.id.gameButton2:
		      
					startActivityForResult(intent, 1);
		
					break;
		              
				default:
					break;
			
			}
		}
	};
}