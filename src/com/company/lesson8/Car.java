package com.company.lesson8;

public class Car {

    private String name;
    private int distance;

    // Engine engine;

    public static int count; // Class

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    private class Engine {

        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        double work () {
            System.out.print("Work is: ");
            return volume * distance;
        }
    }

    public static class Transmission {

        private boolean check; // автомат или механика

        public Transmission(boolean check) {
            this.check = check;
        }

        void print() {
            if (check) {
                System.out.println("Автомат ");
            } else {
                System.out.println("Механика");
            }

        }

    }

    void printCount() {
        System.out.println(count);
    }

    void drive() {
        Engine engine = new Engine(3.5);
        System.out.println(name + " is driving " + engine.work());
    }

     void sayHello(){
         System.out.println(this);
     }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
