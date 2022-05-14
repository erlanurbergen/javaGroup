package com.company.finalProject.entity;

public class Aircrafts {

    private int id;
    private String name;

    public Aircrafts(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Aircrafts(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aircrafts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
