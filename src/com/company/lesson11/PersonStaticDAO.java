package com.company.lesson11;

import java.util.ArrayList;

public class PersonStaticDAO {

    private static ArrayList<Person> people = new ArrayList<>();
    private static int id = 4;

    static {
        people.add(new Person(1, "China", 18, Position.MIDDLE));
        people.add(new Person(2, "Kairuddin", 19, Position.JUNIOR));
        people.add(new Person(3, "Malik", 9, Position.SENIOR));
    }

    static void addPerson(Person person) {
        person.setId(id);
        people.add(person);
        id++;
    }

    static ArrayList<Person> getPersons() {
        return people;
    }
}
