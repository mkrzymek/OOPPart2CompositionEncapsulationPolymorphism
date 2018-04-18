package com.timbuchalka;

public class Table {

    private Dimensions dimensions;
    private String color;
    private String material;

    public Table(Dimensions dimensions, String color, String material) {
        this.dimensions = dimensions;
        this.color = color;
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
