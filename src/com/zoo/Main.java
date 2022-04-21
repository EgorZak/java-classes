package com.zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в зоопарк");
        Lion lion = new Lion(20, 60, Lion.Colors.ORANGE);
        lion.growl();

        System.out.println(lion.getWeight());
        lion.setWeight(123);
        System.out.println(lion.getWeight());
    }
}
