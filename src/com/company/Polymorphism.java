package com.company;

abstract class Human {
    abstract void goPee();
}

class Female extends  Human {

    @Override
    void goPee() {
        System.out.println("sit down!");
    }
}
public class Polymorphism {

}

