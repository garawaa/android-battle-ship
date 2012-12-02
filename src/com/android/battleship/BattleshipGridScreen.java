package com.android.battleship;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
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
	BattleshipHitsAndMissesScreen hit;
	
	MainActivity main;
	String msg;
	
	ImageButton A1;
	ImageButton A2;
	ImageButton A3;
	ImageButton A4;
	ImageButton A5;
	ImageButton A6;
	ImageButton A7;
	ImageButton A8;
	ImageButton A9;
	ImageButton A10;
	ImageButton B1;
	ImageButton B2;
	ImageButton B3;
	ImageButton B4;
	ImageButton B5;
	ImageButton B6;
	ImageButton B7;
	ImageButton B8;
	ImageButton B9;
	ImageButton B10;
	ImageButton C1;
	ImageButton C2;
	ImageButton C3;
	ImageButton C4;
	ImageButton C5;
	ImageButton C6;
	ImageButton C7;
	ImageButton C8;
	ImageButton C9;
	ImageButton C10;
	ImageButton D1;
	ImageButton D2;
	ImageButton D3;
	ImageButton D4;
	ImageButton D5;
	ImageButton D6;
	ImageButton D7;
	ImageButton D8;
	ImageButton D9;
	ImageButton D10;
	ImageButton E1;
	ImageButton E2;
	ImageButton E3;
	ImageButton E4;
	ImageButton E5;
	ImageButton E6;
	ImageButton E7;
	ImageButton E8;
	ImageButton E9;
	ImageButton E10;
	ImageButton F1;
	ImageButton F2;
	ImageButton F3;
	ImageButton F4;
	ImageButton F5;
	ImageButton F6;
	ImageButton F7;
	ImageButton F8;
	ImageButton F9;
	ImageButton F10;
	ImageButton G1;
	ImageButton G2;
	ImageButton G3;
	ImageButton G4;
	ImageButton G5;
	ImageButton G6;
	ImageButton G7;
	ImageButton G8;
	ImageButton G9;
	ImageButton G10;
	ImageButton H1;
	ImageButton H2;
	ImageButton H3;
	ImageButton H4;
	ImageButton H5;
	ImageButton H6;
	ImageButton H7;
	ImageButton H8;
	ImageButton H9;
	ImageButton H10;
	ImageButton I1;
	ImageButton I2;
	ImageButton I3;
	ImageButton I4;
	ImageButton I5;
	ImageButton I6;
	ImageButton I7;
	ImageButton I8;
	ImageButton I9;
	ImageButton I10;
	ImageButton J1;
	ImageButton J2;
	ImageButton J3;
	ImageButton J4;
	ImageButton J5;
	ImageButton J6;
	ImageButton J7;
	ImageButton J8;
	ImageButton J9;
	ImageButton J10;

	
	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_screen);
		
		init();
		
	}
	
	private OnClickListener onMoveClick = new OnClickListener()
	{

		public void onClick(View v)
		{
			switch (v.getId())
			{
				
				case R.id.A1:
					Log.v(msg,"placementA1 click Argument received");
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.A10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "A10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "A10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.B10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "B10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "B10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.C10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "C10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "C10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.D10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "D10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "D10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.E10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "E10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "E10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.F10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "F10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "F10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.G10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "G10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "G10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.H10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "H10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "H10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.I10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "I10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "I10");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J1:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J1");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J1");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J2:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J2");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J2");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J3:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J3");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J3");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J4:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J4");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J4");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J5:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J5");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J5");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J6:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J6");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J6");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J7:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J7");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J7");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J8:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J8");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J8");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J9:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J9");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J9");
	
						main.player = 1;
					}
	
					break;
	
	
				case R.id.J10:
	
					if (main.player == 1)
					{
						hit.CheckForHit(main.player2ShipArray, "J10");
	
						main.player = 2;
					}
	
					else
					{
						hit.CheckForHit(main.player1ShipArray, "J10");
	
						main.player = 1;
					}
	
					break;
					
				default:
					break;
			}			
		}
		
	};
	
	public void init()
	{
		A1.setOnClickListener(onMoveClick);
		A2.setOnClickListener(onMoveClick);
		A3.setOnClickListener(onMoveClick);
		A4.setOnClickListener(onMoveClick);
		A5.setOnClickListener(onMoveClick);
		A6.setOnClickListener(onMoveClick);
		A7.setOnClickListener(onMoveClick);
		A8.setOnClickListener(onMoveClick);
		A9.setOnClickListener(onMoveClick);
		A10.setOnClickListener(onMoveClick);
		B1.setOnClickListener(onMoveClick);
		B2.setOnClickListener(onMoveClick);
		B3.setOnClickListener(onMoveClick);
		B4.setOnClickListener(onMoveClick);
		B5.setOnClickListener(onMoveClick);
		B6.setOnClickListener(onMoveClick);
		B7.setOnClickListener(onMoveClick);
		B8.setOnClickListener(onMoveClick);
		B9.setOnClickListener(onMoveClick);
		B10.setOnClickListener(onMoveClick);
		C1.setOnClickListener(onMoveClick);
		C2.setOnClickListener(onMoveClick);
		C3.setOnClickListener(onMoveClick);
		C4.setOnClickListener(onMoveClick);
		C5.setOnClickListener(onMoveClick);
		C6.setOnClickListener(onMoveClick);
		C7.setOnClickListener(onMoveClick);
		C8.setOnClickListener(onMoveClick);
		C9.setOnClickListener(onMoveClick);
		C10.setOnClickListener(onMoveClick);
		D1.setOnClickListener(onMoveClick);
		D2.setOnClickListener(onMoveClick);
		D3.setOnClickListener(onMoveClick);
		D4.setOnClickListener(onMoveClick);
		D5.setOnClickListener(onMoveClick);
		D6.setOnClickListener(onMoveClick);
		D7.setOnClickListener(onMoveClick);
		D8.setOnClickListener(onMoveClick);
		D9.setOnClickListener(onMoveClick);
		D10.setOnClickListener(onMoveClick);
		E1.setOnClickListener(onMoveClick);
		E2.setOnClickListener(onMoveClick);
		E3.setOnClickListener(onMoveClick);
		E4.setOnClickListener(onMoveClick);
		E5.setOnClickListener(onMoveClick);
		E6.setOnClickListener(onMoveClick);
		E7.setOnClickListener(onMoveClick);
		E8.setOnClickListener(onMoveClick);
		E9.setOnClickListener(onMoveClick);
		E10.setOnClickListener(onMoveClick);
		F1.setOnClickListener(onMoveClick);
		F2.setOnClickListener(onMoveClick);
		F3.setOnClickListener(onMoveClick);
		F4.setOnClickListener(onMoveClick);
		F5.setOnClickListener(onMoveClick);
		F6.setOnClickListener(onMoveClick);
		F7.setOnClickListener(onMoveClick);
		F8.setOnClickListener(onMoveClick);
		F9.setOnClickListener(onMoveClick);
		F10.setOnClickListener(onMoveClick);
		G1.setOnClickListener(onMoveClick);
		G2.setOnClickListener(onMoveClick);
		G3.setOnClickListener(onMoveClick);
		G4.setOnClickListener(onMoveClick);
		G5.setOnClickListener(onMoveClick);
		G6.setOnClickListener(onMoveClick);
		G7.setOnClickListener(onMoveClick);
		G8.setOnClickListener(onMoveClick);
		G9.setOnClickListener(onMoveClick);
		G10.setOnClickListener(onMoveClick);
		H1.setOnClickListener(onMoveClick);
		H2.setOnClickListener(onMoveClick);
		H3.setOnClickListener(onMoveClick);
		H4.setOnClickListener(onMoveClick);
		H5.setOnClickListener(onMoveClick);
		H6.setOnClickListener(onMoveClick);
		H7.setOnClickListener(onMoveClick);
		H8.setOnClickListener(onMoveClick);
		H9.setOnClickListener(onMoveClick);
		H10.setOnClickListener(onMoveClick);
		I1.setOnClickListener(onMoveClick);
		I2.setOnClickListener(onMoveClick);
		I3.setOnClickListener(onMoveClick);
		I4.setOnClickListener(onMoveClick);
		I5.setOnClickListener(onMoveClick);
		I6.setOnClickListener(onMoveClick);
		I7.setOnClickListener(onMoveClick);
		I8.setOnClickListener(onMoveClick);
		I9.setOnClickListener(onMoveClick);
		I10.setOnClickListener(onMoveClick);
		J1.setOnClickListener(onMoveClick);
		J2.setOnClickListener(onMoveClick);
		J3.setOnClickListener(onMoveClick);
		J4.setOnClickListener(onMoveClick);
		J5.setOnClickListener(onMoveClick);
		J6.setOnClickListener(onMoveClick);
		J7.setOnClickListener(onMoveClick);
		J8.setOnClickListener(onMoveClick);
		J9.setOnClickListener(onMoveClick);
		J10.setOnClickListener(onMoveClick);

	}
	
}
