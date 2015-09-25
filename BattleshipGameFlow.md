Game Flow:

A user starts the app, chooses multiplayer.
They are then asked to enable Bluetooth and will be shown a list of devices that are pairable.
The user will pair with a device that they choose.
The game will then start with ship placement on a grid.
After all ships are placed, a user is chosen to place the first move.
The user will have to wait before making another move until the oppenent has made one.
The hitsAndMisses screen will have to be updated every move.
When all ships are hit, the game will be over and return back to the main screen.



Technical Details To Think Aboot:

Cannot let the game start until both devices say they are ready (all ships are placed on the grid)
We have to put some kind of detection in for ship placement, cant place in a corner and orient it off the grid (probably just a try catch with a popup message and reset the placement)
When it's not a players turn, we have to prevent them from making any moves (i was thinking a boolean passed back and forth)

Thinking about using an AsyncTask class to manage sending a move to the other mobile device,
analyzing if its a hit or a miss then returning a simple boolean that'll trigger a popup saying "YOU MISSED"
or "YOU HIT!"

Not sure about the graphics spreading across 3 buttons.. Might just have to start off with basic colored squares until that part is figured out.