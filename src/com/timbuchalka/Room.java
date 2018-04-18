package com.timbuchalka;

public class Room {

    private Table table;
    private Bed bed;
    private Chair chair;

    public Room(Table table, Bed bed, Chair chair) {
        this.table = table;
        this.bed = bed;
        this.chair = chair;
    }

    public void roomCoposition() {
        System.out.println("Table is " + table.getColor() + " and made of " + table.getMaterial());
        bed.bedDetails();
        chair.chairDetails();
    }

    public Bed getBed() {
        return bed;
    }
}
