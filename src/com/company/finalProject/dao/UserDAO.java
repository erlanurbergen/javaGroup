package com.company.finalProject.dao;

import com.company.finalProject.Role;
import com.company.finalProject.entity.User;

import java.util.ArrayList;

public class UserDAO {

    private static ArrayList<User> users = new ArrayList<>();

    static {

        User admin = new User("Erlan Karabaliyev", "Almaty", Role.ADMIN);
        User cashier = new User("Arman Nurbergen", "Almaty", Role.CASHIER);
        User client = new User("Erlanuly Usman", "Almaty", 50000, Role.CLIENT);

        users.add(admin);
        users.add(cashier);
        users.add(client);
    }

    public static ArrayList<User> getUsers(){
        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        for (User user1 : users) {
            if (user1.getRole() == Role.ADMIN){
                users.remove(user);
            }
        }
    }

    public static boolean checkAdmin(String password) {
        for (User user : users) {
            if (user.getRole() == Role.ADMIN && password.equals("admin"))
                return true;
        }
        return false;
    }
}
