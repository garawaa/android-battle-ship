package com.android.battleship;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
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
		
		/*
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
		alertDialogBuilder.setTitle("Game Instructions");
		alertDialogBuilder
				.setMessage(
						"The objective of this game is to place your fleet's ships in your desired position."
								+ "  You can play with a friend or against the computer.  Once your ships are positioned,"
								+ " you will select coordinates for attacking the opponent's fleet and it will be determined"
								+ " whether you hit a ship.  Good luck!")
				.setCancelable(false)
				.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
					}
				});
		
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
		
		Button multiplayerButton = (Button)findViewById(R.id.gameButton2);
		multiplayerButton.setOnClickListener(new OnClickListener(){
			public void onClick(View view) {
				Intent intent = new Intent(view.getContext(), BluetoothManagerScreen.class);
				//expects a return from the bluetooth screen, 1 for sucess, 0 for failure
				startActivityForResult(intent, 1);
			}			
		});
		*/
		
		
		Button b1;
		Button b2;
		Button btTest = (Button) findViewById(R.id.bttest);
		
		b1 = (Button) findViewById(R.id.gameButton1);
		b2 = (Button) findViewById(R.id.gameButton2);

		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.garnet));

		
		b1.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				setContentView(R.layout.grid_screen);
				gm.displayMsg(context, fireShot, "Fire when ready!");
			}
		});

		b2.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				setContentView(R.layout.grid_screen);
				gm.displayMsg(context, fireShot, "Fire when ready!");
			}
		});
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
}