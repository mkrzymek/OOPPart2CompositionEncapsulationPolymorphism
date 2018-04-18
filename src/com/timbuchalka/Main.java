package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

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
}
