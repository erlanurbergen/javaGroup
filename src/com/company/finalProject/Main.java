package com.company.finalProject;

import com.company.finalProject.dao.TicketDAO;
import com.company.finalProject.dao.UserDAO;
import com.company.finalProject.entity.Tickets;
import com.company.finalProject.entity.User;
import com.company.finalProject.service.Cart;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("[1] Админ");
            System.out.println("[2] Кассир");
            System.out.println("[3] Покупатель");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Мы должны проверить вас");
                System.out.println("Введите пароль");
                String password = scanner.next();
                if (UserDAO.checkAdmin(password)) {
                    User user = UserDAO.getUsers().get(0);
                    System.out.println("Привет, админ " + user.getFullName());
                    System.out.println("Что будем делать? ");
                    System.out.println("Все билеты из базы");
                    TicketDAO.printAllTicketsData();
                    System.out.println("-----------------");
                    System.out.println("[1] Добавить новый билет");
                    System.out.println("[2] Поменять параметры полета");
                    System.out.println("[3] Изменить стоимость билета");
                    System.out.println("[4] Посмотреть выручку");
                    int choiceAdmin = scanner.nextInt();
                    if (choiceAdmin == 1) {
                        TicketDAO.addTickets();
                        System.out.println("Добавлен новый билет");
                        TicketDAO.printAllTicketsData();

                    } else if (choiceAdmin == 2) {
                        System.out.println("Вы можете поменять только кол-во мест");
                        TicketDAO.getTickets().get(0).getFlight().setPlaceCount(10);
                        System.out.println("Изменения сохранены");
                        TicketDAO.printAllTicketsData();
                    } else if (choiceAdmin == 3) {
                        System.out.println("Вы можете поменять стоимость билета");
                        TicketDAO.getTickets().get(0).setCost(33000);
                        System.out.println("Изменения сохранены");
                        TicketDAO.printAllTicketsData();
                    } else if (choiceAdmin == 4) {
                        cart.totalProfit();
                    }
                }
            }

            else if (choice == 3) {
                User user = UserDAO.getUsers().get(2);
                TicketDAO.printAllTicketsData();

                System.out.println("------------------");
                System.out.println("Что вы хотите сделать??");
                System.out.println("[1] купить билет");
                System.out.println("[2] вернуть билет");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Выберите билет по id ");
                    int id = scanner.nextInt();
                    ArrayList<Tickets> tickets = TicketDAO.getTickets();
                    for (Tickets ticket : tickets) {
                        if (ticket.getId() == id){
                            if (ticket.getFlight().getPlaceCount() >= 1){
                                cart.setUser(user);
                                cart.addTicket(ticket);
                                System.out.println("------");
                                cart.printCart();
                            }
                        }
                    }

                } else if (choice2 == 2) {
                    System.out.println("Вы возвращаете билет");
                    cart.printCart();
                    System.out.println("Выберите по id");
                    int id = scanner.nextInt();
                    for (Tickets ticket : cart.getTickets()) {
                        if (id == ticket.getId())
                            cart.removeTicket(ticket);
                    }
                    cart.printCart();
                }
                System.out.println("Что вы хотите сделать??");
            }
        }


    }
}
