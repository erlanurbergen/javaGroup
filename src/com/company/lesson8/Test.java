package com.company.lesson8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User users[] = {
                new User("Erlan", "123", "admin"),
                new User("Arman", "444", "superuser"),
                new User("Usman", "555", "user"),
        };

        System.out.println("Insert login: ");
        String login = scanner.next();
        System.out.println("Insert pass: ");
        String pass = scanner.next();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(pass)) {
                System.out.println("Welcome: " + user.getLogin());
                while (true) {
                    System.out.println("[1] edit login");
                    System.out.println("[2] change password");
                    System.out.println("[3] delete account");
                    System.out.println("[4] exit account");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Insert new login: ");
                        String newLogin = scanner.next();
                        user.setLogin(newLogin);
                        System.out.println("Your new login: " + user.getLogin());
                    }else if (choice == 2){
                        System.out.println("Insert new pass: ");
                        String pass2 = scanner.next();
                        user.setPassword(pass2);
                        System.out.println("Your new login: " + user.getPassword());
                    } else if (choice == 3){
                        user = null;
                        System.out.println("Your account is deleted: " + user);
                    } else if (choice == 4)
                        break;
                }
            }
        }
    }
}

class User {
    private int id;
    private String login;
    private String password;
    private String role;
    private static int count = 0;

    public User(String login, String password, String role) {
        this.id = count;
        this.login = login;
        this.password = password;
        this.role = role;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
