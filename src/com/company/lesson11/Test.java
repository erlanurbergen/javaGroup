package com.company.lesson11;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

//        PersonDAO personDAO = new PersonDAO();
//        personDAO.addPerson(new Person("Islam", 23, Position.JUNIOR));
//        personDAO.addPerson(new Person("Dina", 18, Position.JUNIOR));
//        ArrayList<Person> persons = personDAO.getPersons();
//
//        for (Person person : persons) {
//            System.out.println(person);
//        }

        ArrayList<Person> persons = PersonStaticDAO.getPersons();

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
