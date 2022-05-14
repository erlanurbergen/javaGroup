package com.company.lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Сериализация
        // GUI
        // Socket
        // Threading
        // Socket + threading
        // MySQL(PostgreSQL) + JDBC API
        // Project


        // Сериализация

//        List<Person> persons = new ArrayList<>();
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hello.bin"))){
//            Person person = new Person(1, "Erlan", "Almaty");
//            Person person2 = new Person(1, "Erlan", "Almaty");
//            persons.add(person);
//            persons.add(person2);
//            out.writeObject(persons);
//            out.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }


        // Диссериализация
//        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("hello.bin"))){
//            List<Person> people = (ArrayList<Person>)input.readObject();
//            people.forEach(System.out::println);
//
//            input.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        List<Subject> subjects = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("stud.bat"));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("stud.bat"));

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("[1] add student");
                System.out.println("[2] list student");
                System.out.println("[0] exit");

                int choice = Integer.parseInt(reader.readLine());

                if (choice == 1) {
                    System.out.println("Insert name");
                    String name = reader.readLine();
                    System.out.println("[1] add subjects");
                    System.out.println("[2] go in to main menu");

                    int choice2 = Integer.parseInt(reader.readLine());
                    if (choice2 == 1){
                        System.out.println("Insert subject name");
                        String subName = reader.readLine();
                        System.out.println("Insert subject credits");
                        int credits = Integer.parseInt(reader.readLine());
                        subjects.add(new Subject(subName, credits));
                        students.add(new Student(name, subjects));
                    } else if (choice2 == 2) {
                        continue;
                    }

                } else if (choice == 2) {
                    outputStream.writeObject(students);
                    List<Student> std = (ArrayList<Student>)inputStream.readObject();
                    std.forEach(System.out::println);
                } else if (choice == 0)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
//
//class Person implements Serializable{
//    private int id;
//    private String name;
//    private String city;
//
//    public Person(int id, String name, String city) {
//        this.id = id;
//        this.name = name;
//        this.city = city;
//    }
//
//    public Person() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
//}

class Subject implements Serializable {
    private String name;
    private int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}

class Student implements Serializable {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}


