package com.company;

public class Pants extends Cloth implements ManClothing, WomanClothing{

    public Pants(Size size, int prise, String color) {
        super(size, prise, color);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Pants : size %s, price %d, color %s\n", size, prise, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
