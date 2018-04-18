package com.timbuchalka;

public class Chair {

    private String material;

    public Chair(String material) {
        this.material = material;
    }

    public void chairDetails() {
        System.out.println("chair is made of " + material);
    }

    public String getMaterial() {
        return material;
    }
}
