package com.company;

public abstract class Cloth {
    Size size;
    int prise;
    String color;

    public Cloth(Size size, int prise, String color) {
        this.size = size;
        this.prise = prise;
        this.color = color;
    }

    abstract public void displayInfo();
}
