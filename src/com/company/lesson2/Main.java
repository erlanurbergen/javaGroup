package com.company.lesson2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Exercise 1
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("P = " + (4 * a));


//        Exercise 2
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("S = " + (a * a));
//        System.out.println("S = " + (Math.pow(a,2)));


//        Exercise 3
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//
//        System.out.println("P = " + (2 * (a + b)));
//        System.out.println("P = " + (a * b));


//        Exercise 4
//
//        System.out.println("Enter diameter d: ");
//        int d = sc.nextInt();
//        double p = 3.14;
//
//        System.out.println("L = " + (p * d));


//        Exercise 5
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("V = " + (a * a * a));
//        System.out.println("V = " + (Math.pow(a,3)));
//        System.out.println("P = " + (6*a*a));
//        System.out.println("P = " + (6*(Math.pow(a,2))));


//        Exercise 6
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        System.out.println("V = " + a * b * c);
//        System.out.println("S = " + (2 * (a * b + b * c + a * c)));


       // Условные конструкции

        // if else else if
        // switch case

//        int a = sc.nextInt();

        // and && strong
        // or || not strong
        // not !

        // > < >= <= != == %

//        if (a == 20)  // true
//            System.out.println("Yes");
//        else
//            System.out.println("No");

//        String color = sc.next();
//
//        if (color.equals("green")) // ==
//            System.out.println("go go");
//        else if (color.equals("yellow"))
//            System.out.println("wait");
//        else if (color.equals("red"))
//            System.out.println("stop");
//        else
//            System.out.println("incorrect value");

//        boolean check = true;
//
//        int a = sc.nextInt();
//        if (a > 10)
//            check = true;
//        else
//            check = false;
//
//        if (check){
//            System.out.println("answer - true true");
//        } else {
//            System.out.println("answer - false");
//        }

        // тринарные операторы


//        if (a > 10)
//            System.out.println("A greater than 10");
//        else
//            System.out.println("A less than 10");


//        String message = a > 10 ? "A greater than 10" : "A less than 10";
//
//        int arr[] = a > 10 ? new int[2] : new int[5];
//
//        boolean check = a > 10;
//
//        System.out.println(message);

        // 1. Дано целое число A.
        // Проверить истинность высказывания: «Число A является положительным».

//        if (a > 0)
//            System.out.println("positive number");
//        else
//            System.out.println("negative number");

        // Даны два целых числа: A, B. Проверить истинность высказывания:
        // «Справедливы неравенства A ∏ 0 или B < °2».

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a >= 0 || b < -2)
//            System.out.println("yes");
//        else
//            System.out.println("no");

        // Дано целое положительное число. Проверить истинность высказывания:
        // «Данное число является четным двузначным».

//        int a = sc.nextInt();
//        if (a % 2 == 0 && a > 9 && a < 100) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

        // 87 : 8 + 7 = 15
//        int a = sc.nextInt();
//        System.out.println((a / 10) + (a % 10));

        // Даны два числа.
        // Вывести порядковый номер меньшего из них.
//
//        int firstNumber = sc.nextInt();
//        int secondNumber = sc.nextInt();
//
////        if (firstNumber > secondNumber)
////            System.out.println("1");
////        else
////            System.out.println("2");
//
//        System.out.println(firstNumber > secondNumber ? "1" : "2");

        // Арифметические действия над числами пронумерованы следующим образом:
        // 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
        // Дан номер действия N (целое число в диапазоне 1–4)
        // и вещественные числа A и B (В не равно 0).
        // Выполнить над числами указанное действие и вывести результат.

        System.out.println("Insert first number: ");
        int firstN = sc.nextInt();
        System.out.println("Insert second number: ");
        int secondN = sc.nextInt();
        System.out.println("Insert your choice: ");
        System.out.println("[1] sum");
        System.out.println("[2] minus");
        System.out.println("[3] multiply");
        System.out.println("[4] division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum: " + (firstN + secondN));
                break; // return exit
            case 2:
                System.out.println("Minus: " + (firstN - secondN));
                break;
            case 3:
                System.out.println("Multiply: " + (firstN * secondN));
                break;
            case 4:
                System.out.println("Division: " + (firstN / secondN));
                break;
            default:
                System.out.println("Incorrect choice");
        }

    }
}