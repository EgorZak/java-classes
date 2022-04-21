package com.zoo;

public class Lion {
    public enum Colors {RED, ORANGE, YELLOW}

    private float height;
    private float weight;
    private Colors color;

    public Lion(float height, float weight, Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
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
