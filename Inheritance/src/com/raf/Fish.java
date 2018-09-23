package com.raf;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int body, int brain, int weight, int size, int gills, int eyes, int fins) {
        super(name, body, brain, weight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuslces() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuslces();
        moveBackFin();
        super.move(speed);
    }


}
