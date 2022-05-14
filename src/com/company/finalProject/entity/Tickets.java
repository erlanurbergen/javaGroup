package com.company.finalProject.entity;

import com.company.finalProject.entity.Flights;
import com.company.finalProject.entity.User;

public class Tickets {

    private int id;
    private Flights flight;
    private double cost;
    private User user;

    public Tickets(int id, Flights flight, double cost, User user) {
        this.id = id;
        this.flight = flight;
        this.cost = cost;
        this.user = user;
    }

    public Tickets(Flights flight, double cost, User user) {
        this.flight = flight;
        this.cost = cost;
        this.user = user;
    }

    public Tickets(int id, Flights flight, double cost) {
        this.id = id;
        this.flight = flight;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "id=" + id +
                ", flight=" + flight +
                ", cost=" + cost ;
    }
}
