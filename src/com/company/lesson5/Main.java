package com.company.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Сортировки


        /*
        1. Даны десять вещественных чисел. Найти их сумму.
        2. Дан набор ненулевых целых чисел; признак его завершения — число 0. Вывести количество чисел в наборе.
        3. Дано целое число N и набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их в указанном порядке.
        4. Дано целое число N и набор из N чисел. Найти номер минимального элемента из данного набора.
        5. Дано целое число N и набор из N целых чисел. Найти номера первого максимального и последнего минимального элемента из данного набора и вывести их в указанном порядке.

        1. Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами. Программа должна вывести массив таким образом, как в нижних примерах.
        Ввод:
        3
        0 -2 3
        -5 8 -8
        1 2 3
        Вывод:
        x-2 3
        -5 x-8
         1 2 x
        Ввод:
        5
        2 -4 -5 6 9
        0 1 -2 9 0
        -1-1 8 3 3
        3 4 5 6 1
        7 11 0 7 12
        Вывод:
        x -4 -5 6 9
        0 x -2 9 0
        -1-1 x 3 3
        3 4 5 x 1
        7 11 0 7 x


2. Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами. Программа должна вывести "Yes", если диагонали элементов симметричны, иначе "No". *** Для понятия диагонали, они в примере выделены жирным шрифтом.
Ввод:
3
1 2 3
2 7 4
3 4 6
Вывод:
Yes
               Scanner scanner = new Scanner(System.in);

       //1
//        int arr[] = new int[10];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//            sum += arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Sum is: " + sum);
//
       //2
//        int arr[] = new int[100];
//        int n;
//        int i = 0;
//        while (true){
//            n = scanner.nextInt();
//            if (n!= 0){
//                arr[i] = n;
//                i++;
//            }else
//                break;
//        }
//
//        int size = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != 0){
//                size++;
//            }
//        }
//        int arr2[] = new int[size];
//        for (int j = 0; j < size; j++) {
//            arr2[j] = arr[j];
//        }
//
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("Amount is: " + size);

       //3

//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(-20,20);
//        }
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <=min){
//                min = arr[i];
//            }
//            if (arr[i] >= max){
//                max = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Min is: " + min + ", Max is: " + max);
//
//
       //4
//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//        int index = 0;
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(-20,20);
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <=min){
//                min = arr[i];
//                index = i;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("index is: " + index +", min is: " + min);

       //5
//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
////            arr[i] = random.nextInt(-20,20);
//            arr[i] = scanner.nextInt();
//        }
//        int min = arr[0];
//        int max = arr[0];
//        int minindex = 0;
//        int maxindex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= min){
//                min = arr[i];
//                minindex = i;
//            }
//
//            if (arr[i] > max){
//                max = arr[i];
//                maxindex = i;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Max is: " + max + ", index: " + maxindex);
//        System.out.println("Min is: " + min + ", index: " + minindex);



       //Двумерный массив

       //1
//        int n = scanner.nextInt();
//        int arr[][] = new int[n][n];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = random.nextInt( -10,10);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i == j){
//                    System.out.print("x"+" ");
//                    continue;
//                }
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
       //2

       int n = scanner.nextInt();
       int arr[][] = new int[n][n];

       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               arr[i][j] = scanner.nextInt();
           }
       }
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               if (arr[i][j] != arr[j][i]){
                   System.out.println("NO");
                   return; // break
               }
           }
       }
       System.out.println("Yes"); // ???


    }
}
        */
        // Строки
        // String and StringBuilder mutable
//        String text = "hello"; // array char ummutable
//        String text2 = " world"; // array char ummutable
//        String text3 = " !!!"; // array char ummutable
//        String result = text + text2 + text3;
//        System.out.println(result);
//        System.out.println(text.length());
        // length
//        System.out.println(text.length()); // size capacity
        // equals
//        System.out.println(text.equals("Hello")); // ? true false ==
        // charAt []
//        System.out.println(text.charAt(1));
        // isEmpty
//        boolean empty = text.isEmpty(); // ctrl alt v
//        System.out.println(empty);
        // Cases
//        String s = text.toUpperCase();
//        System.out.println(s);
        // concat
//        String newString = text.concat(" world");
//        System.out.println(newString);
        // contains
//        boolean l = text.contains("LLO");
//        System.out.println(l);
        // indexOf
//        int index = text.indexOf("E");
//        System.out.println(index);
        // trim
//        String trim = text.trim();
//        System.out.println();
        // split
//        String[] s = text.split(" ");
//        System.out.println(Arrays.toString(s));
        // replace
//        String e = text.replace("e", "!!!");
//        System.out.println(e);

        // StringBuilder
//        StringBuilder stringBuilder = new StringBuilder("Hello");
////        String hello = stringBuilder.toString();
//        stringBuilder.append(" world")
//                .append(" !!!")
//                .append(" 4");
//        System.out.println(stringBuilder);
//        // append
//        // delete
//        stringBuilder.delete(2, 7);
//        // reverse
////        StringBuilder reverse = stringBuilder.reverse();
//        System.out.println(stringBuilder);


        // hello world joker naruto (string)
//        String text = "hello world joker naruto";
//        String[] s = text.split(" ");
//        String result = "";
//        for (int i = 0; i < s.length; i++) {
//            result+=s[i];
//        }
//        System.out.println(result);
//        String replace = text.replace(" ", "");
//        System.out.println(replace);
        // полиндром 2 варианта kazak aziza oppo
//        String text = "kazak";
//        StringBuilder text = new StringBuilder("kazak");
//        if (text.reverse().toString().equals(text.toString())){
//            System.out.println("yes");
//        } else
//            System.out.println("no");
//        String result = "";
//        for (int i = text.length() - 1; i >= 0; i--) {
//            result+=text.charAt(i);
//        }
//        System.out.println(text.equals(result));
//        int count = 0;
//        for (int i = 0; i < text.length() / 2; i++) {
//            if (text.charAt(i) == text.charAt(text.length() - 1 - i)){
//                count++;
//            }
//        }
//        if (count == text.length() / 2)
//            System.out.println("yes");
//        else
//            System.out.println("no");
        // Подсчет гласных букв
//        String text = "almaty"; // 3
//        String vowels = "eyuioa";
        /*
        for i in text:
            for j in vowels:
                if i == j:
                    count += 1
        * */
//        int count = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == 'a'
//            || text.charAt(i) == 'e'
//            || text.charAt(i) == 'y'
//            || text.charAt(i) == 'u'
//            || text.charAt(i) == 'o'
//            || text.charAt(i) == 'i')
//                count++;
//        }
//        System.out.println("Count: " + count);

//        for (int i = 0; i < text.length(); i++) {
//            for (int j = 0; j < vowels.length(); j++) {
//                if (text.charAt(i) == vowels.charAt(j)){
//                    count++;
//                }
//            }
//        }
        // Аутентификация
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        String pass = scanner.next();
//        auth(name, pass);
        //
    int arr[][] = new int [3][3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(20);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    System.out.print("x ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
//    private static void auth(String name, String pass){
//        if (name != null && pass != null){
//            if (name.equals("Erlan") && pass.equals("123")){
//                System.out.println("welcome");
//            } else {
//                System.out.println("try again");
//            }
//        }
//    }





}
