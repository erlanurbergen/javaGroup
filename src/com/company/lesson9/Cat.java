package com.company.lesson9;

public class Cat extends Animal{

    private int nails;

    public Cat(String name, int age, int nails) {
        super(name, age);
        this.nails = nails;
    }

    @Override
    void eat() {
        System.out.println("My name is: " + getName() + ": Nails: " + nails);
    }

    void jumpOfWall(){
        System.out.println("jumping");
    }


}
