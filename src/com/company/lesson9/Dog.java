package com.company.lesson9;

public class Dog extends Animal{

    private String voice;

    public Dog(String name, int age, String voice) {
        super(name, age);
        this.voice = voice;
    }

    @Override
    void eat() {
        System.out.println("My name is: " + getName() + ": Voice: " + voice);
    }

    void runOfCat(){
        System.out.println("running");
    }
}
