package com.company.finalProject.service;

import com.company.finalProject.dao.TicketDAO;
import com.company.finalProject.entity.Tickets;
import com.company.finalProject.entity.User;

import java.util.ArrayList;

public class Cart {

    private User user;
    private ArrayList<Tickets> tickets = new ArrayList<>();

    public Cart() {
    }

    public Cart(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Tickets> tickets) {
        this.tickets = tickets;
    }

    public boolean checkUserMoney(){

        int sum = 0;
        for (Tickets ticket : tickets) {
            sum += ticket.getCost();
        }
        return user.getMoney() >= sum;
    }

    public void totalProfit(){

        int sum = 0;
        for (Tickets ticket : tickets) {
            sum += ticket.getCost();
        }
        System.out.println("Общая прибыль " +  sum);
    }

    public void addTicket(Tickets ticket) {
        if (checkUserMoney()){
            System.out.println("У вас достаточно средств");
            System.out.println("Вы купили билет");
            tickets.add(ticket);
        }else {
            System.out.println("У вас не достаточно средств");
        }
    }

    public void printCart() {
        for (Tickets ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public void removeTicket(Tickets ticket) {
        tickets.remove(ticket);
    }
}
