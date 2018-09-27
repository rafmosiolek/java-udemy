package com.raf;

public class Vehicle {

    private int weight;
    private int size;
    private int numOfWheels;
    private int speed;

    public Vehicle(int weight, int size, int numOfWheels, int speed) {
        this.weight = weight;
        this.size = size;
        this.numOfWheels = numOfWheels;
        this.speed = speed;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Vehicle is moving at: " + speed);
        this.speed = speed;
    }

    public void stop() {
        System.out.println("Vehicle.stop() called. Vehicle stopped.");
        this.speed = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.