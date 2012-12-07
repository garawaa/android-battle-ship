package com.android.battleship.objects;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

/**
 * This will be the ship object we will use to track the type of ship and orientation of the ship.
 * Each ship will have its own array to store the cells it occupies.
 */
public class Ship {

	private Drawable ship;
	private int orientation;
	protected PlayerShipArrays shipArray = new PlayerShipArrays(); // Hold cells occupied for the ship
	public final String name; // Name of the ship
	public boolean isSunk = false; // Once each cell for the ship has been hit the ship will be declared 'sunk'
	public final int maxHits; // Each ship will have a max number of hits before sinkage; based on size of ship
	private int currHits = 0; // Number of hits the ship has currently
	
	/*public Ship(Drawable ship, int orientation){
		this.ship = ship;
		this.orientation = orientation;
	}*/
	
	public Ship(String name, int max){
		this.name = name;
		this.maxHits = max;
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

	public int getCurrHits() {
		return currHits;
	}

	public void setCurrHits(int currHits) {
		this.currHits = currHits;
	}
}
