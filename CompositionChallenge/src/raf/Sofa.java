package raf;

public class Sofa extends Furniture {
    private String model;
    private boolean sofaBed;

    public Sofa(boolean isWooden, boolean isMetal, String colour, String purpose, String model, boolean sofaBed) {
        super(isWooden, isMetal, colour, purpose, 4);
        this.model = model;
        this.sofaBed = sofaBed;
    }

    public String getModel() {
        return model;
    }

    public boolean isSofaBed() {
        return sofaBed;
    }
}
