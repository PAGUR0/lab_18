package com.company;

public class Main {

    public static void main(String[] args) {
        Cloth[] cloths = new Cloth[4];

        cloths[0] = new Shirt(Size.XXS, 500, "black");
        cloths[1] = new Pants(Size.XS, 1200, "green");
        cloths[2] = new Skirt(Size.M, 1000, "blue");
        cloths[3] = new Tie(Size.L, 900, "yellow");

        Studio studio = new Studio();

        studio.dressMan(cloths);
        studio.dressWoman(cloths);
    }
}
