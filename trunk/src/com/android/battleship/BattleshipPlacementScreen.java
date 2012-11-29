package com.android.battleship;

import java.util.ArrayList;

import android.app.Activity;

/**
 * This screen will be opened from an onClickListener in the GridScreen. From this screen we will decide
 * what ship to place and the orientation (horizontal|vertical) to place it.
 * 
 * @author DPrinslow
 *
 */
public class BattleshipPlacementScreen extends Activity{
	
	int counter = 0;
	
	MainActivity main;

	public int carrier(int player, String s) {
		
		if (player == 1)
		{
			main.player1ShipArray.add(s);
		}
		else
		{
			main.player2ShipArray.add(s);
		}
		
		++counter;
		
		return counter;
	}

	public int battleship(int player, String s) {
		
		if (player == 1)
		{
			main.player1ShipArray.add(s);
		}
		else
		{
			main.player2ShipArray.add(s);
		}
		
		++counter;

		return counter;
	}

	public int destroyer(int player, String s) {
		
		if (player == 1)
		{
			main.player1ShipArray.add(s);
		}
		else
		{
			main.player2ShipArray.add(s);
		}
		
		++counter;

		return counter;
	}

	public int submarine(int player, String s) {
		
		if (player == 1)
		{
			main.player1ShipArray.add(s);
		}
		else
		{
			main.player2ShipArray.add(s);
		}
		
		++counter;

		return counter;
	}

	public int ptBoat(int player, String s) {
		
		if (player == 1)
		{
			main.player1ShipArray.add(s);
		}
		else
		{
			main.player2ShipArray.add(s);
		}
		
		++counter;

		return counter;
	}
}
