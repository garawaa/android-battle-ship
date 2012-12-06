package com.android.battleship.objects;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

/**
 * This will be the ship object we will use to track the type of ship and orientation of the ship.
 * Each ship will have its own array to store the cells it occupies.
 * 
 * @author DPrinslow
 *
 */
public class Ship {

	private Drawable ship;
	private int orientation;
	protected PlayerShipArrays shipArray = new PlayerShipArrays(); // Hold cells occupied for the ship
	private String name = ""; // Name of the ship
	
	public Ship(Drawable ship, int orientation){
		this.ship = ship;
		this.orientation = orientation;
	}
	
	public Ship(String name){
		this.name = name;
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
	
	public ArrayList<String> getShipArray(){
		return shipArray.getPlayerShipArray();
	}
}
