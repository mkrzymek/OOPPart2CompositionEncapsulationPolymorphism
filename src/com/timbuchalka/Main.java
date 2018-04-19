package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        composition();
//        encapsulation();
        polymorphism();
    }

    public static void composition() {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        System.out.println("************************");

        Dimensions bedDimensions = new Dimensions(100, 50, 200);
        Dimensions tableDimensions = new Dimensions(250, 80, 100);

        Bed bed = new Bed(bedDimensions, "wood", true);
        Chair chair = new Chair("steel");
        Table table = new Table(tableDimensions, "brown", "wood");

        Room room = new Room(table, bed, chair);

        room.roomCoposition();
        room.getBed().bedDetails();
    }

    public static void encapsulation() {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "AK47";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining hp = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("remaining hp = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "AK47");
        System.out.println("initial hp is " + player.getHealth());
    }

    public static void polymorphism() {

        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " +movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number gen was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }

}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Darth Vader";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }
}

