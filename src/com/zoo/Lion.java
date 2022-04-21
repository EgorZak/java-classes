package com.zoo;

public class Lion {
    public enum Colors {RED, ORANGE, YELLOW};

    public float height;
    public float weight;
    public Colors color;

    public Lion(float height, float weight, Colors color) {
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
