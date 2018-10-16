package raf;

public class Room {

    private int walls;
    private int doors;
    private int windows;
    private Sofa theSofa;
    private Cupboard theCupboard;
    private Chair theChair;

    public Room(int walls, int doors, int windows, Sofa theSofa, Cupboard theCupboard, Chair theChair) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.theSofa = theSofa;
        this.theCupboard = theCupboard;
        this.theChair = theChair;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Sofa getTheSofa() {
        return theSofa;
    }

    public Cupboard getTheCupboard() {
        return theCupboard;
    }

    public Chair getTheChair() {
        return theChair;
    }
}
