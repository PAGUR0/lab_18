package com.company;

public enum Size {
    XXS(32){
        void getDescription(){System.out.println("Детский размер");}},

    XS(34), S(36), M(38), L(40);
    void getDescription() { System.out.println("Взрослый размер");}

    int EuroSize;

    Size(int euroSize){
        this.EuroSize = euroSize;
    }

    int getEuroSize(){
        return EuroSize;
    }
}

