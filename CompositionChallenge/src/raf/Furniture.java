package raf;

public class Furniture {
    private boolean isWooden;
    private boolean isMetal;
    private String colour;
    private String purpose;
    private int legs;

    public Furniture(boolean isWooden, boolean isMetal, String colour, String purpose, int legs) {
        this.isWooden = isWooden;
        this.isMetal = isMetal;
        this.colour = colour;
        this.purpose = purpose;
        this.legs = legs;
    }

    public boolean isWooden() {
        return isWooden;
    }

    public boolean isMetal() {
        return isMetal;
    }

    public String getColour() {
        return colour;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getLegs() {
        return legs;
    }
}
