package com.raf;

public class Volvo extends Car {

    private String color;

    public Volvo(int weight, int size, int numOfWheels, int speed, String model, int topSpeed, int numOfSeats, int doors, int numOfGears, String color) {
        super(weight, size, numOfWheels, speed, "Volvo", model, topSpeed, numOfSeats, doors, numOfGears);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.