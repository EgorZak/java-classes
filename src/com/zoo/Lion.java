package com.zoo;

public class Lion {
    public float height;
    public float weight;

    public Lion(float height, float weight) {
        this.height = height;
        this.weight = weight;
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
