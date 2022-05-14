package com.company.lesson7;

import java.util.Arrays;


public class Person {

    // примитивные - хранят значение
    // ссылочные - хранят ссылку, которая указывает на значения
    // Строка, массив, объект ? из множества значений

    // свойства
     String name;
     int age;
     City city;
     String hobbies[];

     String books[] = new String[100]; // данный массив как база данных для книг
     int size = 0;

    void addBook(String book) {
        books[size] = book;
        size++;
    }

    void showData() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}');
        System.out.println("I was reading this books: ");
        for (int i = 0; i < size; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }

    // конструкторы - методы которые страбатывают при инициализаци объекта

    // garbage system

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age, City city, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.hobbies = hobbies;
    }

    public Person() {

    }

    // поведение (методы)

    void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
