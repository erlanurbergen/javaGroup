package com.company.lesson10;

public class Main3 {
    public static void main(String[] args) {

        Duck duck = new Duck("Lucky duck");
        duck.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}

interface Flyable{
    void fly();
}

interface Swimable {
    void swim();
}

interface Runable {
    void run();
}

class Duck implements Flyable, Swimable, Runable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swiming");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }
}

class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("i am fish and i am swimming always because i am fish");
    }
}


// Плавают
// Ходят
// летают
// летают + плавают + ходят
