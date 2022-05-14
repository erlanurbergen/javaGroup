package com.company.lesson7;

public class City {
    String name;
    long population;

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
