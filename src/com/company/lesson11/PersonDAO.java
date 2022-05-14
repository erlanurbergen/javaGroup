package com.company.lesson11;

import java.util.ArrayList;

public class PersonDAO {

    private static int id = 4;

    // базы данных
    private ArrayList<Person> persons = new ArrayList<>();

    {
      persons.add(new Person(1, "Erlan", 28, Position.MIDDLE));
      persons.add(new Person(2, "Arman", 20, Position.JUNIOR));
      persons.add(new Person(3, "Usman", 33, Position.SENIOR));
    }

    void addPerson(Person person) {
        person.setId(id);
        persons.add(person);
        id++;
    }

    ArrayList<Person> getPersons() {
        return persons;
    }

}
