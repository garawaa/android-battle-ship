package com.android.battleship;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageButton;

/**
 * This screen will be opened from an onClickListener in the GridScreen. From
 * this screen we will decide what ship to place and the orientation
 * (horizontal|vertical) to place it.
 * 
 * @author DPrinslow
 * 
 */
public class BattleshipPlacementScreen extends Activity {

	int counter = 0;
	int shipPlaced = 1;
	int previous = 999;
	ImageButton button;

	boolean btnSelected = false;
	String firstBtn;
	String previousBtn;

	MainActivity main;

	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
	}
	
	public void placeShips(String s, int i, ImageButton b) {

		int x = 0;
		button = b;

		switch (shipPlaced) {
		case 1:
			x = carrier(main.player, s, i);

			if (x == 999) {
				GameMessages gm = new GameMessages();
				final Context context = this;
				gm.displayMsg(context, "Move Not Available",
						"Please select another cell.");
			}
			break;

		case 2:
			x = submarine(main.player, s, i);

			if (x == 999) {
				GameMessages gm = new GameMessages();
				final Context context = this;
				gm.displayMsg(context, "Move Not Available",
						"Please select another cell.");
			}

			break;

		case 3:
			x = battleship(main.player, s, i);

			if (x == 999) {
				GameMessages gm = new GameMessages();
				final Context context = this;
				gm.displayMsg(context, "Move Not Available",
						"Please select another cell.");
			}

			break;

		case 4:
			x = destroyer(main.player, s, i);

			if (x == 999) {
				GameMessages gm = new GameMessages();
				final Context context = this;
				gm.displayMsg(context, "Move Not Available",
						"Please select another cell.");
			}

			break;

		case 5:
			x = ptBoat(main.player, s, i);

			if (x == 999) {
				GameMessages gm = new GameMessages();
				final Context context = this;
				gm.displayMsg(context, "Move Not Available",
						"Please select another cell.");
			}

			break;

		}
	}

	public int carrier(int player, String s, int i) {

		if (counter > 4)
		{
			++shipPlaced;
			return 0;
		}
		
		if (player == 1) {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player1ShipArray.add(s);
				changeImage(button);
				previousBtn = s;
			}

			else {
				return 999;
			}

		} else {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player2ShipArray.add(s);
				previousBtn = s;
			}

			else {
				return 999;
			}
		}

		counter++;
		return counter;
	}

	public int submarine(int player, String s, int i) {

		if (counter >= 8)
		{
			++shipPlaced;
			return 0;
		}
		
		if (player == 1) {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player1ShipArray.add(s);
				changeImage(button);
				previousBtn = s;
			}

			else {
				return 999;
			}

		} else {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player2ShipArray.add(s);
				previousBtn = s;
			}

			else {
				return 999;
			}
		}

		counter++;
		return counter;
	}
	
	public int battleship(int player, String s, int i) {

		if (counter > 10)
		{
			++shipPlaced;
			return 0;
		}
		
		if (player == 1) {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player1ShipArray.add(s);
				changeImage(button);
				previousBtn = s;
			}

			else {
				return 999;
			}

		} else {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player2ShipArray.add(s);
				previousBtn = s;
			}

			else {
				return 999;
			}
		}

		counter++;
		return counter;
	}
	public int destroyer(int player, String s, int i) {

		if (counter > 13)
		{
			++shipPlaced;
			return 0;
		}
		
		if (player == 1) {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player1ShipArray.add(s);
				previousBtn = s;
				++counter;
			}

		} else {
			btnSelected = checkSelection(i, previous);

			if (btnSelected) {
				main.player2ShipArray.add(s);
				previousBtn = s;
				++counter;
			}

			if (counter == 5) {
				++shipPlaced;
			}
		}

		++counter;

		return counter;
	}

	public int ptBoat(int player, String s, int i) {

		if (counter > 15)
		{
			++shipPlaced;
			GameMessages gm = new GameMessages();
			final Context context = this;
			gm.displayMsg(context, "Ships placed",
					"All your ships have been placed.");
			return 0;
		}
		
		if (player == 1) {
			main.player1ShipArray.add(s);
		} else {
			main.player2ShipArray.add(s);
		}

		++counter;

		return counter;
	}

	private boolean checkSelection(int previous, int current) {

		switch (shipPlaced) {
		case 1:

			if (current == previous + 1 || current == previous - 1
					|| current == previous + 10 || current == previous - 10) {
				return true;
			} else {
				return false;
			}
		default:
			return false;
		}

	}

	public void changeImage(ImageButton b) {
		b.setBackgroundResource(R.drawable.ocean);
	}
}
