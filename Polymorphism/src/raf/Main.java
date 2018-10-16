package raf;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "It has no plot";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats a lot of people lol";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Aliens destroy planet Earth";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("StarWars");
    }

    public String plot() {
        return "Empire tries to take over the universe";
    }
}


public class Main {

    public static void main(String[] args) {

    }

    public static Movie randomMovie() {
        int randomNum = (int)(Math.random() * 3) + 1;
        System.out.println("Random number is " + randomNum);

        switch (randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
        }

        return null;
    }
}
