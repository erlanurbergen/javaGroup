package com.company.lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        // Stream api
        // Начиная с JDK 8 в Java появился новый API - Stream API. Его задача - упростить работу с наборами данных, в частности,
        // упростить операции фильтрации, сортировки и другие манипуляции с данными.

        // Вся основная функциональность данного API сосредоточена в пакете java.util.stream.
        // Ключевым понятием в Stream API является поток данных. Вообще сам термин "поток" довольно перегружен в программировании в целом и в Java в частности.
        // В одной из предыдущих глав рассматривалась работа с символьными и байтовыми потоками при чтении-записи файлов.
        // Применительно к Stream API поток представляет канал передачи данных из источника данных.
        // Причем в качестве источника могут выступать как файлы, так и массивы и коллекции.
        // Одной из отличительных черт Stream API является применение лямбда-выражений, которые позволяют значительно сократить запись выполняемых действий
        // При работе со Stream API важно понимать, что все операции с потоками бывают либо терминальными (terminal), либо промежуточными (intermediate).

        // создание
        List<Student> students = new ArrayList<>();
        students.add(new Student("Dina", 18, 3.1, Group.GROUP1));
        students.add(new Student("Shyngys", 20, 3.0, Group.GROUP2));
        students.add(new Student("Kairuddin", 17, 3.3, Group.GROUP3));
        students.add(new Student("Sanzhar", 22, 3.0, Group.GROUP1));
        students.add(new Student("Erlan", 19, 2.9, Group.GROUP2));

        // imperative approach
//        List<Student> group1 = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getGroup() == Group.GROUP1){
//                group1.add(student);
//            }
//        }
//
//        for (Student student : group1) {
//            System.out.println(student);
//        }
        // filter -> findAny -> orElse
//        List<Student> group1 = students.stream()
//                .filter(student -> student.getGroup() == Group.GROUP1).collect(Collectors.toList());
//
//        for (Student student : group1) {
//            System.out.println(student);
//        }

//        Student st = students.stream()
//                .filter(student -> student.getName().equals("Sanzhar"))
//                .findAny()
//                .orElse(null);
//
//        System.out.println(st);
        // filter -> findFirst
//        Student student1 = students.stream()
//                .filter(student -> student.getAge() > 33).findAny().orElse(null);
//        System.out.println(student1);

        // map
//        List<Student> increasedGPA = students.stream()
//                .map(student -> new Student(
//                        student.getName(), student.getAge() - 2, student.getGpa() * 0.4, student.getGroup()
//                )).collect(Collectors.toList());
//
//        for (Student student : increasedGPA) {
//            System.out.println(student);
//        }

        // sorted -> foreach
//        students.stream()
//                .sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        // allMatch
//        boolean check = students.stream()
//                .allMatch(student -> student.getAge() > 15);
//        System.out.println(check);
        
        // anyMatch
//        boolean b = students.stream().anyMatch(student -> student.getAge() > 23);
//        System.out.println(b);

        // NoneMatch
//        boolean b = students.stream().noneMatch(student -> student.getAge() > 25);
//        System.out.println(b);

        // max
//        Student student = students.stream()
//                .max(Comparator.comparing(Student::getGpa)).orElse(null);
//        System.out.println(student);

        // min
//        Student studentMin = students.stream()
//                .min(Comparator.comparing(Student::getGpa)).orElse(null);
//        System.out.println(studentMin);

        // group
//        Map<Group, List<Student>> collect =
//                students.stream()
//                .collect(Collectors.groupingBy(Student::getGroup));
//
//        collect.forEach(((group, students1) -> {
//            System.out.println(group);
//
//            for (Student student : students1) {
//                System.out.println(student);
//            }
//        }));

        // pagination

        // skip limit while(true) page = 3,4

    }
}

class Student {
    private String name;
    private int age;
    private double gpa;
    private Group group;

    public Student(String name, int age, double gpa, Group group) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.group = group;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", group=" + group +
                '}';
    }
}

enum Group {
    GROUP1, GROUP2, GROUP3;
}
