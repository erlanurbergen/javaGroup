package com.company.finalProject.entity;

import com.company.finalProject.entity.Aircrafts;
import com.company.finalProject.entity.Cities;

public class Flights {

    private int id;
    private Aircrafts aircraft;
    private Cities departure;
    private Cities arrival;
    private int placeCount;

    public Flights(int id, Aircrafts aircraft, Cities departure, Cities arrival, int placeCount) {
        this.id = id;
        this.aircraft = aircraft;
        this.departure = departure;
        this.arrival = arrival;
        this.placeCount = placeCount;
    }

    public Flights(Aircrafts aircraft, Cities departure, Cities arrival, int placeCount) {
        this.aircraft = aircraft;
        this.departure = departure;
        this.arrival = arrival;
        this.placeCount = placeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aircrafts getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircrafts aircraft) {
        this.aircraft = aircraft;
    }

    public Cities getDeparture() {
        return departure;
    }

    public void setDeparture(Cities departure) {
        this.departure = departure;
    }

    public Cities getArrival() {
        return arrival;
    }

    public void setArrival(Cities arrival) {
        this.arrival = arrival;
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public void setPlaceCount(int placeCount) {
        this.placeCount = placeCount;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", aircraft=" + aircraft +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", placeCount=" + placeCount +
                '}';
    }
}
