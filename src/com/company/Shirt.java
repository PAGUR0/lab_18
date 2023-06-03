package com.company;

public class Shirt extends Cloth implements ManClothing, WomanClothing{

    public Shirt(Size size, int prise, String color) {
        super(size, prise, color);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Shirt : size %s, price %d, color %s\n", size, prise, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWoman() {
    }
}
