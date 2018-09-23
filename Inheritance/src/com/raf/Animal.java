package com.raf;

public class Animal {

    private String name;
    private int body;
    private int brain;
    private int weight;
    private int size;

    public Animal(String name, int body, int brain, int weight, int size) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.weight = weight;
        this.size = size;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move() {
        System.out.println("Animal.move() called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
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
}
