package com.company.lesson13;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      // Анонимные классы
      // lambda
      // Comparable
      // Comparator

//       Operation operation = new Operation() {
//
//           @Override
//           public void anotherMethod() {
//               System.out.println("hello");
//           }
//       };
//
//        System.out.println(operation.getClass());
//        AnotherClass anotherClass = new AnotherClass();
//        System.out.println(anotherClass.getClass());

//        Operation operation = (x , y) -> x - y;
//        System.out.println(operation.operation(10, 14));

//        new Thread(()-> {
//            System.out.println("hello");
//        }).start();
//
//        Thread thread = new Thread();
//        thread.start();

//        Button button = new Button("add");
//
//        button.addActionListener(x -> System.out.println("hello"));

        List<Person> people = new ArrayList<>();

        Collections.addAll(people, new Person("Erlan", 28),
                new Person("Arman", 20),
                new Person("Usman", 17)); // Usman Arman Erlan

//        System.out.println("Before sort");
//        for (Person person : people) {
//            System.out.println(person);
//        }
//
//        Collections.sort(people, new SortByName());
//        System.out.println("After sort");
//
//        for (Person person : people) {
//            System.out.println(person);
//        }

//        people.stream()
//                .sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);


//        Person person = people.stream()
//                .filter(p -> p.getAge() == 20).findAny().orElse(null);
//        System.out.println(person);
//
//        System.out.println(people);


    }
}

//interface Operation {
//    int operation(int a, int b); // ?
//}

// Comparable
//class Person implements Comparable<Person>{
//
//    @Override
//    public int compareTo(Person person) {
//
////        if (this.age == person.age)
////            return 0; // 0 1 -1
////        else if (this.age > person.age)
////            return -1;
////        return 1;
//
//        return this.name.compareTo(person.name);
//    }
//
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}

//class ThreadClass extends Thread {
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//}

//class AnotherClass implements Operation {
//    @Override
//    public void anotherMethod() {
//        System.out.println("hello");
//    }
//}

// Comparator

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getAge() == person2.getAge())
            return 0;
        else if (person1.getAge() > person2.getAge())
            return 1;
        return -1;
    }


}

class SortByName implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}







