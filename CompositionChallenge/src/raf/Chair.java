package raf;

public class Chair extends Furniture {
    private String model;
    private boolean leatherSeat;
    private boolean hasBack;

    public Chair(boolean isWooden, boolean isMetal, String colour, String model, boolean leatherSeat, boolean hasBack) {
        super(isWooden, isMetal, colour, "sitting", 4);
        this.model = model;
        this.leatherSeat = leatherSeat;
        this.hasBack = hasBack;
    }
}
