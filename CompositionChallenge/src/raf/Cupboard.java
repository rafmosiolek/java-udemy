package raf;

public class Cupboard extends Furniture {
    private int drawers;
    private int doors;

    public Cupboard(boolean isWooden, boolean isMetal, String colour, int drawers, int doors) {
        super(isWooden, isMetal, colour, "storage", 4);
        this.drawers = drawers;
        this.doors = doors;
    }

    public void openDrawer() {
        openDoors();
        if (drawers > 0) {
            System.out.println("Drawer is open");
        }
    }

    private void openDoors() {
        if (doors > 0) {
            System.out.println("Doors are open");
        } else {
            System.out.println("This cupboard has no doors");
        }
    }
}
