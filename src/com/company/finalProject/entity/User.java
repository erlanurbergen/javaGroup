package com.company.finalProject.entity;

import com.company.finalProject.Role;

public class User {

    private String fullName;
    private String city;
    private int money;
    private Role role;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String fullName, String city, Role role) {
        this.fullName = fullName;
        this.city = city;
        this.role = role;
    }

    public User(String fullName, String city, int money, Role role) {
        this.fullName = fullName;
        this.city = city;
        this.role = role;
        this.money = money;
    }
}
