package com.android.battleship;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

/**
 * This will be the main screen with a grid of buttons.
 * 
 * @author DPrinslow
 *
 */
@SuppressLint("Registered")
public class BattleshipGridScreen extends Activity{
	
	BattleshipHitsAndMissesScreen hit = new BattleshipHitsAndMissesScreen();
	
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

		 A1 = (ImageButton) findViewById(R.id.A1);
		 A2 = (ImageButton) findViewById(R.id.A2);
		 A3 = (ImageButton) findViewById(R.id.A3);
		 A4 = (ImageButton) findViewById(R.id.A4);
		 A5 = (ImageButton) findViewById(R.id.A5);
		 A6 = (ImageButton) findViewById(R.id.A6);
		 A7 = (ImageButton) findViewById(R.id.A7);
		 A8 = (ImageButton) findViewById(R.id.A8);
		 A9 = (ImageButton) findViewById(R.id.A9);
		 A10 = (ImageButton) findViewById(R.id.A10);
		 B1 = (ImageButton) findViewById(R.id.B1);
		 B2 = (ImageButton) findViewById(R.id.B2);
		 B3 = (ImageButton) findViewById(R.id.B3);
		 B4 = (ImageButton) findViewById(R.id.B4);
		 B5 = (ImageButton) findViewById(R.id.B5);
		 B6 = (ImageButton) findViewById(R.id.B6);
		 B7 = (ImageButton) findViewById(R.id.B7);
		 B8 = (ImageButton) findViewById(R.id.B8);
		 B9 = (ImageButton) findViewById(R.id.B9);
		 B10 = (ImageButton) findViewById(R.id.B10);
		 C1 = (ImageButton) findViewById(R.id.C1);
		 C2 = (ImageButton) findViewById(R.id.C2);
		 C3 = (ImageButton) findViewById(R.id.C3);
		 C4 = (ImageButton) findViewById(R.id.C4);
		 C5 = (ImageButton) findViewById(R.id.C5);
		 C6 = (ImageButton) findViewById(R.id.C6);
		 C7 = (ImageButton) findViewById(R.id.C7);
		 C8 = (ImageButton) findViewById(R.id.C8);
		 C9 = (ImageButton) findViewById(R.id.C9);
		 C10 = (ImageButton) findViewById(R.id.C10);
		 D1 = (ImageButton) findViewById(R.id.D1);
		 D2 = (ImageButton) findViewById(R.id.D2);
		 D3 = (ImageButton) findViewById(R.id.D3);
		 D4 = (ImageButton) findViewById(R.id.D4);
		 D5 = (ImageButton) findViewById(R.id.D5);
		 D6 = (ImageButton) findViewById(R.id.D6);
		 D7 = (ImageButton) findViewById(R.id.D7);
		 D8 = (ImageButton) findViewById(R.id.D8);
		 D9 = (ImageButton) findViewById(R.id.D9);
		 D10 = (ImageButton) findViewById(R.id.D10);
		 E1 = (ImageButton) findViewById(R.id.E1);
		 E2 = (ImageButton) findViewById(R.id.E2);
		 E3 = (ImageButton) findViewById(R.id.E3);
		 E4 = (ImageButton) findViewById(R.id.E4);
		 E5 = (ImageButton) findViewById(R.id.E5);
		 E6 = (ImageButton) findViewById(R.id.E6);
		 E7 = (ImageButton) findViewById(R.id.E7);
		 E8 = (ImageButton) findViewById(R.id.E8);
		 E9 = (ImageButton) findViewById(R.id.E9);
		 E10 = (ImageButton) findViewById(R.id.E10);
		 F1 = (ImageButton) findViewById(R.id.F1);
		 F2 = (ImageButton) findViewById(R.id.F2);
		 F3 = (ImageButton) findViewById(R.id.F3);
		 F4 = (ImageButton) findViewById(R.id.F4);
		 F5 = (ImageButton) findViewById(R.id.F5);
		 F6 = (ImageButton) findViewById(R.id.F6);
		 F7 = (ImageButton) findViewById(R.id.F7);
		 F8 = (ImageButton) findViewById(R.id.F8);
		 F9 = (ImageButton) findViewById(R.id.F9);
		 F10 = (ImageButton) findViewById(R.id.F10);
		 G1 = (ImageButton) findViewById(R.id.G1);
		 G2 = (ImageButton) findViewById(R.id.G2);
		 G3 = (ImageButton) findViewById(R.id.G3);
		 G4 = (ImageButton) findViewById(R.id.G4);
		 G5 = (ImageButton) findViewById(R.id.G5);
		 G6 = (ImageButton) findViewById(R.id.G6);
		 G7 = (ImageButton) findViewById(R.id.G7);
		 G8 = (ImageButton) findViewById(R.id.G8);
		 G9 = (ImageButton) findViewById(R.id.G9);
		 G10 = (ImageButton) findViewById(R.id.G10);
		 H1 = (ImageButton) findViewById(R.id.H1);
		 H2 = (ImageButton) findViewById(R.id.H2);
		 H3 = (ImageButton) findViewById(R.id.H3);
		 H4 = (ImageButton) findViewById(R.id.H4);
		 H5 = (ImageButton) findViewById(R.id.H5);
		 H6 = (ImageButton) findViewById(R.id.H6);
		 H7 = (ImageButton) findViewById(R.id.H7);
		 H8 = (ImageButton) findViewById(R.id.H8);
		 H9 = (ImageButton) findViewById(R.id.H9);
		 H10 = (ImageButton) findViewById(R.id.H10);
		 I1 = (ImageButton) findViewById(R.id.I1);
		 I2 = (ImageButton) findViewById(R.id.I2);
		 I3 = (ImageButton) findViewById(R.id.I3);
		 I4 = (ImageButton) findViewById(R.id.I4);
		 I5 = (ImageButton) findViewById(R.id.I5);
		 I6 = (ImageButton) findViewById(R.id.I6);
		 I7 = (ImageButton) findViewById(R.id.I7);
		 I8 = (ImageButton) findViewById(R.id.I8);
		 I9 = (ImageButton) findViewById(R.id.I9);
		 I10 = (ImageButton) findViewById(R.id.I10);
		 J1 = (ImageButton) findViewById(R.id.J1);
		 J2 = (ImageButton) findViewById(R.id.J2);
		 J3 = (ImageButton) findViewById(R.id.J3);
		 J4 = (ImageButton) findViewById(R.id.J4);
		 J5 = (ImageButton) findViewById(R.id.J5);
		 J6 = (ImageButton) findViewById(R.id.J6);
		 J7 = (ImageButton) findViewById(R.id.J7);
		 J8 = (ImageButton) findViewById(R.id.J8);
		 J9 = (ImageButton) findViewById(R.id.J9);
		 J10 = (ImageButton) findViewById(R.id.J10);
		 
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
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.A10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "A10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "A10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.B10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "B10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "B10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.C10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "C10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "C10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.D10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "D10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "D10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.E10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "E10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "E10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.F10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "F10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "F10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.G10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "G10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "G10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.H10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "H10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "H10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.I10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "I10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "I10");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J1:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J1");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J1");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J2:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J2");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J2");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J3:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J3");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J3");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J4:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J4");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J4");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J5:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J5");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J5");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J6:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J6");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J6");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J7:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J7");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J7");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J8:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J8");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J8");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J9:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J9");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J9");
	
						MainActivity.player = 1;
					}
	
					break;
	
	
				case R.id.J10:
	
					if (MainActivity.player == 1)
					{
						hit.CheckForHit(MainActivity.player2ShipArray, "J10");
	
						MainActivity.player = 2;
					}
	
					else
					{
						hit.CheckForHit(MainActivity.player1ShipArray, "J10");
	
						MainActivity.player = 1;
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
