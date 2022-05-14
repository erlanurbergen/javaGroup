package com.company.lesson8;

public class Person {

    private String name;
    private int age;
    private String country;
    private boolean sex; // пол мужской либо женский


    // 16 конструкторов мы должны создать
    // ? как надо нам избежать избыточность кода
    // builder pattern

    public static class BuilderPerson {
        private Person person;

        public BuilderPerson() {
            //данный конструктор нужен для инициализации объекта Персон
            person = new Person();
        }

        BuilderPerson withName(String name) {
            person.name = name;
            return this; // возвращает сам себя
        }

        BuilderPerson withAge(int age) {
            person.age = age;
            return this;
        }

        BuilderPerson withCountry(String country) {
            person.country = country;
            return this;
        }

        BuilderPerson withSex(boolean sex) {
            person.sex = sex;
            return this;
        }

        Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", sex=" + sex +
                '}';
    }
}
