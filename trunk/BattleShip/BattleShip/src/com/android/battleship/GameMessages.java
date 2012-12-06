package com.android.battleship;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * This file contains the infrastructure for displaying messages to game users through AlertDialogs.
 * 
 * @author HRaulerson
 *
 */
public class GameMessages extends Activity{
	
	public void displayMsg(Context c, String msg, String title)
	{
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				c);
		alertDialogBuilder.setTitle(title);
		alertDialogBuilder
				.setMessage(msg)
				.setCancelable(false)
				.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
					}
				});
		
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}
	
}
