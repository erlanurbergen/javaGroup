package com.company.lesson14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Generics - обобщения
        // Разобрать на примере List
        // Wildcards
        // Создание своих собственных на примере машин(Car, Body, Engines)

//        List persons = new ArrayList();
//
//        persons.add("Erlan");
//        persons.add("Arman");
//        persons.add("Usman");
//
//        String person = persons.get(0);
//
//        System.out.println(person);

        // java 8

//        List<String> people = new ArrayList<>();
//
//        people.add("Erlan");
//        people.add("Erlan2");
//        people.add("Erlan3");
//
//        System.out.println(people);

        Animal animal = new Cat("Murka"); // ?

        List<Animal> animals = new ArrayList<>();

        Collections.addAll(animals, new Animal("Animal1"), new Animal("Animal2"));
        printList(animals);

        List<Cat> cats = new ArrayList<>();
        Collections.addAll(cats, new Cat("Murka"), new Cat("Barsik"));
        printList(cats);

    }

    // Test method for generics
    private static void printList(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void catMethod() {
        System.out.println("cat cat");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}

