package com.company;

public class Tie extends Cloth implements ManClothing{

    public Tie(Size size, int prise, String color) {
        super(size, prise, color);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Tie: size %s, price %d, color %s\n", size, prise, color);
    }

    @Override
    public void dressMan() {

    }
}
