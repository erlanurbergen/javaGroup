package com.company.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        1. Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        2. Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».
        3. Даны три целых числа: A, B, C. Проверить истинность высказы- вания: «Справедливо двойное неравенство A < B < C».
        4. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
        5. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений, а в B — большее. Вывести новые значения переменных A и B.
        6. Даны три числа. Найти наименьшее из них.
        7. Даны три числа. Найти сумму двух наибольших из них.
        8. Даны три переменные вещественного типа: A, B, C. Если их значения упорядочены по возрастанию или убыванию, то удвоить их; в противном случае заменить значение каждой переменной на противоположное. Вывести новые значения переменных A, B, C.
        9. Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
        * */

//        HomeWork-2
//
//        Exercise-1
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//
//        if(a >= 0) {
//            System.out.println("This number - positive number! ");
//        }else {
//            System.out.println("This number - negative number! ");
//        }


//        Exercise-2
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//
//        if((a > 2) && (b <= 3)) {
//            System.out.println("True! ");
//        }else {
//            System.out.println("False! ");
//        }


//        Exercise-3
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        boolean res = ((a < b ) && (b < c));
//        System.out.println(res);


//        Exercise-4
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//
//        int res = (a > 0) ? (a + 1) : (a);
//        System.out.println(res);


//        Exercise-5
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//
//        if(a < b) {
//            System.out.println(a + "\n" + b);
//        }else {
//            System.out.println(b + "\n" + a);
//        }


//        Exercise-6
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        if((a < b) && (a < c)) {
//            System.out.println(a);
//        }else if((b < a) && (b < c)){
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }


//        Exercise-7
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        if((a < b) && (a < c)) {
//            String res = (b < c) ? (c + "\n" + b) : (b + "\n" + c);
//            System.out.println(res);
//        }else if((b < a) && (b < c)){
//            String res2 = (a < c) ? (a + "\n" + c) : (c + "\n" + a);
//            System.out.println(res2);
//        }else {
//            String res3 = (a < b) ? (a + "\n" + b) : (b + "\n" + a);
//            System.out.println(res3);
//        }


//        Exercise-8
//
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        if ((a < b) && (b < c)) {
//            System.out.println(2*a);
//            System.out.println(2*b);
//            System.out.println(2*c);
//        }else if ((a > b) && (b > c)) {
//            System.out.println((-1) * a);
//            System.out.println((-1) * b);
//            System.out.println((-1) * c);
//        }else {
//            System.out.println("Invalid number");
//        }


//        Exercise-9
//
//        System.out.println("Enter day number: ");
//        int a = sc.nextInt();
//
//        switch (a) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Incorrect choice! ");
//        }
//    }
//
//}


        // loops
        // while
        // for
        // foreach

        // dry - don't repeat yourself

//        for (int i = 5; i <= 10; i++) {
//            System.out.println(i + " = Hello");
//        }

//        int count = 0;
//        for (;;) {
//            System.out.println("Hello");
//            count++;
//
//            if (count == 5)
//                break;
//        }

//        int i = 10;
//        while (i >= 0) {
//            System.out.println(i + " = Hello");
//            i--;
//        }

        // foreach - перебор (Iterator)

//        int arr[] = {1, 2, 3, 5 };
//
//        for (int i : arr) {
//            System.out.println(i);
//        }

        // вложенные циклы


//        int count = 0;
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 0; j < i; j++) {
//                count++;
//                System.out.print(count + " ");
//            }
//
//            System.out.println();
//
//        }

        /*

        1
        2 3
        4 5 6
        7 8 9 10

        */

        // Работа с группой

        // For1. Даны целые числа K и N (N > 0). Вывести N раз число K.
//        System.out.println("Insert k: ");
//        int k = sc.nextInt();
//        System.out.println("Insert n: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(k);
//        }

        /*
         For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа,
         расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
        */

//        System.out.println("Insert a: ");
//        int a = sc.nextInt();
//        System.out.println("Insert b: ");
//        int b = sc.nextInt();
//
//        int count = 0;
//        for (int i = a; i <= b; i++) {
//            System.out.println(i);
//            count++;
//        }
//
//        System.out.println("Count: " + count);


        /*
         For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
         целые числа, расположенные между A и B (не включая числа A и B), а
         также количество N этих чисел.
        */

//        System.out.println("Insert a: ");
//        int a = sc.nextInt();
//        System.out.println("Insert b: ");
//        int b = sc.nextInt();
//
//        int count = 0;
//        for (int i = b; i >= a; i--) {
//            System.out.println(i);
//            count++;
//        }
//
//        System.out.println("Count: " + count);

        /*
         Напишите программу, которая запрашивает числа.
         Программа должна остановиться запрашивать, когда мы вводим 0.
         Программа должна вывести количество введенных чисел и среднее значение.
         Ввод:
         3 8 9 0
         Вывод:
         3 6.67
        */

//        int count = 0;
//        double result = 0;
//        while (true) {
//            int a = sc.nextInt();
//            if (a == 0)
//                break;
//
//            result += a;
//            count++;
//
//        }
//
//        System.out.println("Count: " + count);
//        System.out.println("Average: " + (result / count));

        /*
        Напишите программу, которая запрашивает числа.
        Программа должна остановиться запрашивать, когда мы вводим 0.
        Программа должна вывести максимальное значение из всех чисел.
        Ввод:
        1 2 3 0
        Вывод:
        3
        Ввод:
        3 17 8 9 0
        Вывод:
        17
        */

//        int min = 9999999;
//
//        while (true) {
//            int a = sc.nextInt();
//            if (a == 0)
//                break;
//            if (a < min)
//                min = a;
//
//        }
//
//        System.out.println(min);

        // Самостоятельная работа

        // 1 task
        // Даны положительные числа A и B (A > B).
        // На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
        // Не используя операции умножения и деления, найти длину незанятой части отрезка A.

        // 2 task
        // Дано целое число N (> 0), являющееся некоторой степенью числа 2: N = 2K.
        // Найти целое число K — показатель этой степени.

        /*

        *
        **
        ***
        ****
        *****

            *
           **
          ***
         ****
        *****


        * */


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



    }
}