package com.zoo;

public class Lion {
    public static final String ORANGE = "orange";
    public static final String RED = "red";
    public static final String YELLOW = "yellow";

    public float height;
    public float weight;
    public String color;

    public Lion(float height, float weight, String color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat(float food)
    {
        weight += food;
    }

    public void growl()
    {
        System.out.println("RRR");
    }
}
