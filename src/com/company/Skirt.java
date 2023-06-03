package com.company;

public class Skirt extends Cloth implements WomanClothing{

    public Skirt(Size size, int prise, String color) {
        super(size, prise, color);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Skirt : size %s, price %d, color %s\n", size, prise, color);
    }

    @Override
    public void dressWoman() {

    }
}
