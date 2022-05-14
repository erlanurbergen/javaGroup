package com.company.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 5; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);

//
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 0; j < 5-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
        Scanner scanner = new Scanner(System.in);
//          Stars

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 5; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// Мое решение

        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


       //1

       1. Даны целые положительные числа A и B (A < B). Вывести все целые числа от A до B включительно;
       при этом каждое число должно выводиться столько раз, каково его значение (например, число 3 выводится 3 раза).

//        System.out.println("Enter a: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter b: ");
//        int b = scanner.nextInt();
//        for (int i = a; i <= b; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
       //2

       2. Даны целые числа A и B (A < B).
       Вывести все целые числа от A до B включительно; при этом число A должно выводиться 1 раз,
       число A + 1 должно выводиться 2 раза и т. д.

//        System.out.println("Enter a: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter b: ");
//        int b = scanner.nextInt();
//
//        for (int i = 1; i <= b-a+1; i++) {
//            for(int j = 1; j<= i; j++){
//                System.out.print(a + i - 1);
//            }
//            System.out.println();
//        }

       //3

       3. Дано целое число N (>1). Найти наименьшее целое число K,
       при котором выполняется неравенство 3K > N.

//        System.out.println("Enter a number: ");
//        int n = scanner.nextInt();
          int i = 0;
//        while (true){
//            if (3*i>n){
//            break;
//            }
//            i++;
//        }
//        System.out.println("K is: " + i);

       //4

       4. Спортсмен-лыжник начал тренировки, пробежав в первый день 10 км.
       Каждый следующий день он увеличивал длину пробега на P про- центов от пробега предыдущего дня
       (P — вещественное, 0<P<50).
       По данному P определить, после какого дня суммарный пробег лыжника за все дни превысит 200 км,
       и вывести найденное количество дней K (целое) и суммарный пробег S (вещественное число).
       double s = 10;
       double k = 1;
       System.out.println("Enter the p in the range of (0<P<50)");
       double p = scanner.nextDouble();
       if (p > 0 && p < 50){
           while (true){
               if (s > 200 ){
                   break;
               }
               else {
                   s = s + (s * p) / 100;
                   k++;
               }
           }
       }
       else
       System.out.println("Enter the right number!");
       System.out.println("Amount of days: " + k);
       System.out.println("Total S is " + Math.round(s));


        * */


        // Массивы - набор данных с однотипнными данными

        // Как создать

//        int arr[] = new int[4]; // [1] [5] [6] [8]
//
//        int arr2[] = {1, 4, 5, 6};
        // index - place место элемента в массиве
//        System.out.println(arr2[3]);
//        arr2[3] = 100;
//
//        System.out.println(arr2[3]);

//        System.out.println(arr2.length);

        // Как заполнить

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }

//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//        }

        // Как вывести
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

//        System.out.println(Arrays.toString(arr));

        // Задачи


        // Task 1
        /*
        Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в
        массив. Программа должна вывести сумму и среднее значение введенных чисел.

        Ввод:
        3 492
        Вывод:
        15 5
        */

//        System.out.println("Insert array size: ");
//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//
//        double sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Average total: " + (sum/ arr.length));

        // Task 2

        /*
        Программа запрашивает число n.
        Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        Далее, программа запрашивает пользователя число m.
        Если число m существует в нашем массиве, программа должна вывести слово "Yes" и вывести индекс (расположение, адрес) данного числа.
        Иначе вывести слово "No".
        Ввод:
        3
        4 9 2
        8
        Вывод:
        No
        Ввод:
        10
        6 19 26 3 46 8 5 65 90 25
        46
        Вывод:
        Yes
        Index: 4

        */

//        System.out.println("Insert array size: ");
//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("Insert m: ");
//
//        int m = scanner.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (m == arr[i]){
//                System.out.println("Yes");
//                index = i;
//            }
//        }
//
//        System.out.println("Index: " + index);

        // Task 4

        /*
        Дан целочисленный массив размера N. Вывести вначале все содержа-
        щиеся в данном массиве четные числа в порядке возрастания их индексов,
        а затем — все нечетные числа в порядке убывания их индексов.
        */

//        System.out.println("Insert array size: ");
//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0)
//                System.out.print(arr[i] + " ");
//        }
//
//        System.out.println(" _______________");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] % 2 != 0)
//                System.out.print(arr[i] + " ");
//        }


        // Task 5

        /*
        Дан массив A ненулевых целых чисел размера 10. Вывести значение первого из тех его элементов AK,
        которые удовлетворяют неравенству AK < A10. Если таких элементов нет, то вывести 0.
        */

        // 1 2 3 4 5 6 7 8 9 10

//        int arr[] = new int[10];
//
//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//            arr[i] = random.nextInt(20);
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] < 10){
//                System.out.println("Index: " + i + " : " + arr[i]);
//                break;
//            }
//            else {
//                System.out.println(0);
//            }
//        }



        // Task 6 Самостоятельно

        /*
        Программа запрашивает число N, затем вы создаете двумерный массив с размером 2xN, заполняете их.
        Программа должна вывести "Yes", если числа в первом массиве совпадают со вторыми. Иначе "No".
        */


        // Task 7
        /*
        Дан массив размера N и целые числа K и L( 1 <= K <= L <= N).
        Найти сумму элементов массива с номерами от K до L включительно.
        */


//        int n = scanner.nextInt();
//        int arr[] = new int[n];
//
//        int k = scanner.nextInt();
//        int l = scanner.nextInt();
////
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = random.nextInt(10);
//        }
//
//        int sum = 0;
//
//        for (int i = k; i < l; i++) {
//            sum+= arr[i];
//        }
//
//        System.out.println(sum);

        // Двумерные массивы


        /*
        i = 0: 1 2 3
        i = 1: 6 4 2
        i = 2: 8 0 9


        */

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j] % 2 == 0){
//                    count++;
//                }
//            }
//            System.out.println(i + ": count " + count);
//
//            count = 0;
//        }



        // Задача из собеседования

        /*
         Дан двумерный массив, найти на каждой строке максимальный элемент,
         после, необходимо среди всех максимальных найденных элементов узнать номер строки

        * */

//        int arr[][] = new int[3][3];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = random.nextInt(20);
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int max = -99999;
//        int arr2[] = new int[3];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//            arr2[i] = max;
//            max = -99999;
//        }
//
//
//        int max2 = -99999;
//        int index = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] > max) {
//                max = arr2[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index);
        int arr[][] = new int[3][3];

        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int max = -9999;
        int max2 = -9999;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            if(max>max2)
            {
                max2=max2;
                ind = i;
            }
        }
        System.out.println("ind: " + ind);



    }
}
