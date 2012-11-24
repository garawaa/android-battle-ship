package com.android.battleship;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * This will be the main screen with a grid of buttons.
 * 
 * @author DPrinslow
 *
 */
@SuppressLint("Registered")
public class BattleshipGridScreen extends Activity{
/*
	public void switchLayout()
	{
		TableLayout table = new TableLayout(this);
	
		TableLayout.LayoutParams lp = new TableLayout.LayoutParams(
		        ViewGroup.LayoutParams.MATCH_PARENT,
		        ViewGroup.LayoutParams.MATCH_PARENT);
		
		table.setLayoutParams(lp);
		table.setStretchAllColumns(true);
	
		TableLayout.LayoutParams rowLp = new TableLayout.LayoutParams(
		        ViewGroup.LayoutParams.MATCH_PARENT,
		        ViewGroup.LayoutParams.MATCH_PARENT);
		
		TableRow.LayoutParams cellLp = new TableRow.LayoutParams(
		        ViewGroup.LayoutParams.MATCH_PARENT,
		        ViewGroup.LayoutParams.MATCH_PARENT);
		
		for (int r = 0; r < 2; ++r)
		{
		    TableRow row = new TableRow(this);
		    for (int c = 0; c < 2; ++c)
		    {
		        ImageButton btn = new ImageButton(this);
		        btn.setBackgroundResource(R.drawable.ocean);
		        row.addView(btn, cellLp);
		    }
		    
		    table.addView(row, rowLp);
		    
		}
		
		setContentView(table);
	}
*/
}
