package com.company.lesson8;

public class Employee {

    private String name;

    // getter and setter
    // getter - возвращает значение
    // setter - put value


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(" ")){
            System.out.println("Name is not characters");
            name = null;
        } else {
            this.name = name;
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
