package com.company.lesson10;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        
        User users[] = {new User("Erlan", "Karabaliyev"),
                      new User("Arman", "Nurbergen")
        };

        UserBean userBean = new UserBean(users);

        System.out.println(Arrays.toString(userBean.getAllUsers()));
        System.out.println(Arrays.toString(userBean.getUsersByName("Erlan")));
        System.out.println(Arrays.toString(userBean.getUsersBySurname("Nurbergen")));


    }
}

class User {

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

interface UserBeanLocal {

    User[] getAllUsers();
    User[] getUsersByName(String name);
    User[] getUsersBySurname(String surname);
}

class UserBean implements UserBeanLocal {
    
    private User[] users;

    public UserBean(User[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    @Override
    public User[] getAllUsers() {
        return users;
    }

    @Override
    public User[] getUsersByName(String name) {

        User users1[] = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)){
                users1[i] = users[i];

            }
        }
        return users1;

    }

    @Override
    public User[] getUsersBySurname(String surname) {
        User users1[] = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equals(surname)){
                users1[i] = users[i];

            }
        }
        return users1;
    }
}
