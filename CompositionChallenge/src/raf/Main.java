package raf;

public class Main {

    public static void main(String[] args) {

		// Create a single room of a house using composition.
		// Think about the things that should be included in the room.
		// Maybe physical parts of the house but furniture as well
		// Add at least one method to access an object via a getter and
		// then that objects public method as you saw in the previous video
		// then add at least one method to hide the object e.g. not using a getter
		// but to access the object used in composition within the main class
		// like you saw in this video.

	    Sofa mySofa = new Sofa(false, false, "beige", "sitting and sleeping", "Cosy 3 Sitter 2000", true);
	    Cupboard myCupboard = new Cupboard(true, false, "brown", 2, 2);
	    Chair myChair = new Chair(true, false, "white", "Comfy 500", false, true);
	    Room myRoom = new Room(4, 1, 2, mySofa, myCupboard, myChair);

	    myRoom.getTheCupboard().openDrawer();

    }
}


