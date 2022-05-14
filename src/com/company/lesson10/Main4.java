package com.company.lesson10;

public class Main4 {
    public static void main(String[] args) {

    }
}

class Person {

    private Transport transport;

    public Person(Transport transport) { // dependency injection
        this.transport = transport;
    }

    void iAmDriving(Transport transport){
        if (transport!=null){
            transport.drive();
        }
    }
}

interface Transport {
    void drive();
}

class Car implements Transport{
    public void drive() {
        System.out.println("машина едет");
    }
}

class Bicycle implements Transport{
    public void drive(){
        System.out.println("Велосипед едет");
    }
}

class Skate implements Transport{
    public void drive() {
        System.out.println("Скейтборд едет");
    }
}


