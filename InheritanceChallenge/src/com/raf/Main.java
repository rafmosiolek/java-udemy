package com.raf;

public class Main {

    public static void main(String[] args) {

        Vehicle bicycle = new Vehicle(3, 1, 2, 70);
        Car porsche = new Car(750, 10, 4, 0, "Porsche",
                        "911 Cayenne", 250, 4, 2, 6);
        Volvo X70 = new Volvo(1250, 15, 4, 0, "X70", 190,
                    6, 4, 5,"green");

        bicycle.move(5);
        System.out.println("Bicycle is moving at: " + bicycle.getSpeed());
        porsche.move(60);
        System.out.println(porsche.getBrand() + " " + porsche.getModel() + " is moving at: " + porsche.getSpeed() + ", but its top speed can be: " + porsche.getTopSpeed());
        X70.move(45);
        X70.stop();
        System.out.println(X70.getBrand() + " " + X70.getModel() + " is moving at: " + X70.getSpeed());

        porsche.changeGearUp();
        porsche.changeGearDown();
        porsche.changeGearDown();


    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.