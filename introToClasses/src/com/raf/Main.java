package com.raf;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car opel = new Car();

        porsche.setModel("911");
        System.out.println("Porshe model is: " + porsche.getModel());
        opel.setModel("Vectra");
        opel.setColour("Green");
        opel.setEngine("1.6 16V");
        System.out.println("Opel model: " + opel.getModel());
        System.out.println("Opel colour is: " + opel.getColour());
        System.out.println("Opel engine is: " + opel.getEngine());
    }
}
