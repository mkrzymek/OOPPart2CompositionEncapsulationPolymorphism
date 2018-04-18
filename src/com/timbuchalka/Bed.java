package com.timbuchalka;

public class Bed {

    private Dimensions dimensions;
    private String material;
    private boolean single;

    public Bed(Dimensions dimensions, String material, boolean single) {
        this.dimensions = dimensions;
        this.material = material;
        this.single = single;
    }

    public void bedDetails(){
        System.out.println("bed is made of " + material + ". Dimensions is: " + dimensions.getWidth() + "x" + dimensions.getHeight() + "x" + dimensions.getDepth());
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isSingle() {
        return single;
    }
}
