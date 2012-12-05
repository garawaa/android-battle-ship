package com.android.battleship.objects;

import android.graphics.drawable.Drawable;

/**
 * This will be the ship object we will use to track the type of ship and orientation of the ship.
 * 
 * @author DPrinslow
 *
 */
public class Ship {

	private Drawable ship;
	private int orientation;
	
	public Ship(Drawable ship, int orientation){
		this.ship = ship;
		this.orientation = orientation;
	}

	public Drawable getShip() {
		return ship;
	}

	public void setShip(Drawable ship) {
		this.ship = ship;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}	
}
