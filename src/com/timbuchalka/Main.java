package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        composition();
        encapsulation();
    }

    public static void composition() {
        Dimensions dimensions = new Dimensions(20,20,5);
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
}
