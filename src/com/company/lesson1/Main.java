package com.company.lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	  /*
	1. Типы данных
    2. Условные конструкции
    3. Циклы - вложенные циклы
    4. Массивы
    5. Двумерные массивы
    6. Класс String, StringBuilder, StringBuffer
    7. Методы - рекурсия
    8. Исключения
    9. Введение в ООП(Классы и объекты)
    10. Задачи на тему ООП
    11. Проект на 1 месяц
    12. Подведение итогов
	  * */

        // 1010101010 - машинная код
        // оперативная память??
        // jvm
        // 1. Stack - примитивы(значения примитивов) и ссылки
        // 2. Heap  - содержимое этих ссылок


        // Примитивные типы данных
        // целочисленные
//        int a = 10; // 4 bit
//        a = 99;
//
//        byte b = 2; // -32 000 32000
//        short s = 23; // -127 128
//        long l = 1999; // .....
//        char c = 'v'; // ascii code 118
//
//        System.out.println((c + 100) + " " + (7 + 10));
//        // конкатенация
//        System.out.println("Hello"+"Hello");
//        // дробные
//
//        double d1 = 12.4;
//        float fl = 23.5f;
//        // логический
//
//        boolean check = true; // true false
//        // String
//
//        String text = "Hello"; // 20 %

//        int a = 10;
//        System.out.println(a % 3);
        /*
        +
        -
        /
        *
        ++
        +=
        -=
        /+
        *=
        * */

//        Scanner scanner = new Scanner(System.in);
//        int a1 = scanner.nextInt();
//
//        System.out.println(a1 + 100);

        int a = 100;

//        double d = (double)a;
//
//        double d1 = 123.77;
//
//        int a1 = (int)d1;
//
//        System.out.println(a1);

//        String num = "134";
//
//        double num1 = Double.parseDouble(num);
//        System.out.println(num1);
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            int res = random.nextInt(100);
            System.out.println(res);
        }




    }
}
