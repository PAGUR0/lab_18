package com.company;

public class Studio{

    public void dressMan(Cloth[] cloths) {
        System.out.println("Men's clothing:");
        for (Cloth cloth: cloths){
            if(cloth instanceof ManClothing){
                cloth.displayInfo();
                ((ManClothing) cloth).dressMan();
            }
        }
    }

    public void dressWoman(Cloth[] cloths) {
        System.out.println("Women's clothing:");
        for (Cloth cloth: cloths){
            if(cloth instanceof WomanClothing){
                cloth.displayInfo();
                ((WomanClothing) cloth).dressWoman();
            }
        }
    }
}
