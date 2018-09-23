package com.raf;

public class Dog extends Animal {

    private int eyes;
    private int teeth;
    private int tail;
    private int legs;
    private String coat;

    public Dog(String name, int weight, int size, int eyes, int teeth, int tail, int legs, String coat) {
        super(name, 1, 1, weight, size);
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
//        super.eat();
    }
}
