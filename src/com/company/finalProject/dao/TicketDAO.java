package com.company.finalProject.dao;

import com.company.finalProject.entity.Tickets;
import com.company.finalProject.entity.Aircrafts;
import com.company.finalProject.entity.Cities;
import com.company.finalProject.entity.Flights;

import java.util.ArrayList;

public class TicketDAO {

    private static ArrayList<Tickets> tickets;
    private static int id = 5;

    static {

        tickets = new ArrayList<>();
        Cities departure = new Cities(1, "Almaty");
        Cities arrival = new Cities(1, "Moscow");

        Cities departure2 = new Cities(1, "Astana");
        Cities arrival2 = new Cities(1, "Aktau");

        Aircrafts aircrafts = new Aircrafts(1, "Boing 777");
        Aircrafts aircrafts2 = new Aircrafts(2, "Boing 890");

        Flights flight = new Flights(1, aircrafts, departure, arrival, 1);
        Flights flight2 = new Flights(2, aircrafts2, departure2, arrival2, 1);
        Flights flight3 = new Flights(3, aircrafts2, departure, arrival2, 2);
        Flights flight4 = new Flights(4, aircrafts2, departure2, arrival, 1);

        tickets.add(new Tickets(1, flight, 25000, UserDAO.getUsers().get(2)));
        tickets.add(new Tickets(2, flight, 15000));
        tickets.add(new Tickets(3, flight3, 18000));
        tickets.add(new Tickets(4, flight4, 17000));

    }

    public static void printAllTicketsData() {
        for (Tickets ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static ArrayList<Tickets> getTickets() {
        return tickets;
    }


    public static void addTickets() {

        Tickets t = getTickets().get(0);
        t.setId(id);
        tickets.add(t);
        id++;
    }


}
