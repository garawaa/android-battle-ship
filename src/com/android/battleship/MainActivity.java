package com.android.battleship;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;

//class MainActivity
public class MainActivity extends Activity 
{
	final Context context = this;  //Context object used in association with alertDialog
	
	//method onCreate
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
        //object for creating game instructions dialog message
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
	
		// set title
		alertDialogBuilder.setTitle("Game Instructions");
	
		// set dialog message
		alertDialogBuilder
			.setMessage("The objective of this game is to place your fleet's ships in your desired position." +
					"  You can play with a friend or against the computer.  Once your ships are positioned," +
					" you will select coordinates for attacking the opponent's fleet and it will be determined" +
					" whether you hit a ship.  Good luck!")
			.setCancelable(false)
			.setNegativeButton("Ok",new DialogInterface.OnClickListener() 
			{
				public void onClick(DialogInterface dialog,int id) 
				{
					// if this button is clicked, just close
					// the dialog box and do nothing
					dialog.cancel();
				}
			});
	
		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();
	
		// show it
		alertDialog.show();
	
    }
    //end method onCreate
    
    //method onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
  //end method onCreateOptionsMenu

}
//end class MainActivity
