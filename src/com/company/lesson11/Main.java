package com.company.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // ArrayList - initialization
        // size()
        // get()
        // add()
        // indexOf(Object obj)
        // remove()
        // set()
        // sort()

        // блоки инициализации
        // enum
        // DAO

//        ArrayList<Integer> nums = new ArrayList<>();
//        System.out.println(nums.size()); // размер
        // [0]
//        nums.add(10);
//        nums.add(8);
//        nums.add(-1);

//        System.out.println(nums.get(1));
//        System.out.println(nums.indexOf(10));
//        nums.remove(1);
//        System.out.println(nums);
//        nums.set(2, 100);
//        System.out.println(nums);

//        nums.sort(Comparator.naturalOrder());
//        System.out.println(nums);

//        List<Person> persons = getPersons();

//        Person person = new Person(1, "Erlan", 28, Position.MIDDLE);
//        Person person2 = new Person(2, "Arman", 20, Position.JUNIOR);
//        Person person21 = new Person(3, "Islam", 25, Position.JUNIOR);
//        Person person3 = new Person(4, "Usman", 30, Position.SENIOR);
//
//        ArrayList<Person> personArrayList = new ArrayList<>();
//        personArrayList.add(person);
//        personArrayList.add(person2);
//        personArrayList.add(person21);
//        personArrayList.add(person3);
//
//        List<Person> junior = checkPosition(personArrayList, "JUNIOR");
//        System.out.println(junior);

//        ArrayList<Person> people = new ArrayList<>();
//        Collections.addAll(people, person, person2);

//        for (Person person1 : personArrayList) {
//            if (person1.getPosition() == Position.JUNIOR){
//                System.out.println(person1);
//            }
//        }

    }

//    private static List<Person> checkPosition(List<Person> people, String position) {
////        List<Person> personList = new ArrayList<>();
////        for (Person person : people) {
////            if (person.getPosition().toString().equals(position)) {
////                personList.add(person);
////            }
////        }
////        return personList;
//
//        return people.stream()
//                        .filter(person -> person.getPosition().toString().equals(position))
//                        .collect(Collectors.toList());
//    }

//    private static List<Person> getPersons() {
//        return List.of(
//                new Person(1, "Erlan", 28),
//                new Person(2, "Arman", 17),
//                new Person(3, "Usman", 30)
//        );
//    }

}


