package com.raf;

public class Car extends Vehicle {

    private String brand;
    private String model;
    private int topSpeed;
    private int numOfSeats;
    private int doors;
    private int numOfGears;
    private int currentGear;

    public Car(int weight, int size, int numOfWheels, int speed, String brand, String model, int topSpeed, int numOfSeats, int doors, int numOfGears) {
        super(weight, size, numOfWheels, speed);
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
        this.numOfSeats = numOfSeats;
        this.doors = doors;
        this.numOfGears = numOfGears;
        this.currentGear = 0;
    }

    public void changeGearUp() {
        if (this.currentGear == this.numOfGears) {
            System.out.println("You're on the top gear!");
        } else {
            this.currentGear++;
            System.out.println("Gear changed up. You're on: " + this.currentGear + " gear.");
        }
    }

    public void changeGearDown() {
        if (this.currentGear == 0) {
            System.out.println("You're idle. Change gear up to move!");
        } else {
            this.currentGear--;
            System.out.println("Gear changed down. You're on: " + this.currentGear + " gear");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}


// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.