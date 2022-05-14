package com.company.lesson19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    // GUI
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();

        String login = "Erlan";
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hello.bin"))) {
            outputStream.writeObject(login);
            outputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
