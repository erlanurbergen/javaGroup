package com.company.lesson19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainFrame extends JFrame {

    JLabel labelName;
    JTextField name;
//    JTextField result;
    JButton button;
    JTextArea area;

    JComboBox ages;

    Integer nums[] = new Integer[100];

    Person persons[] = {
            new Person("Erlan", 28),
            new Person("Arman", 18),
            new Person("Usman", 20)
    };

    public MainFrame() {

        setVisible(true);
        setSize(500, 400);
        setTitle("App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame
        setLayout(null);

        labelName = new JLabel("Insert name: ");
        labelName.setBounds(20, 30, 100, 30);
        add(labelName);

        name = new JTextField();
        name.setBounds(130, 30, 100, 30);
        add(name);

//        result = new JTextField();
//        result.setBounds(130, 70, 100, 30);
//        add(result);

        button = new JButton("Send");
        button.setBounds(200, 300, 100, 40);
        add(button);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

//        ages = new JComboBox(nums);
//        ages.setBounds(130, 70, 100, 30);
//        add(ages);

        area = new JTextArea();
        area.setBounds(130, 110, 200, 100);
        add(area);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = name.getText();
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hello.bin"))){
                    String login = (String) inputStream.readObject();

                    if (message.equals(login)){
                        SecondFrame secondFrame = new SecondFrame();

                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
//                Integer age = (Integer)ages.getSelectedItem();
//                System.out.println("Hello, " + message + " age is: " + age);
//                SecondFrame secondFrame = new SecondFrame();
//                secondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                area.append(message + "\n");

//                result.setText(message);
            }
        });
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age ;
    }
}
