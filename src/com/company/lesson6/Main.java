package com.company.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Методы - функции

        // Модификаторы доступа
        // default
        // public
        // private
        // protected
        // static
        // overloading
        // return
        // void
        // recursion - функция вызывает сама себя

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int arr[][] = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] != arr[j][i]){ // 2 == 2
//                    System.out.println("NO");
//                    return; // break
//                }
//            }
//        }
//        System.out.println("Yes");

        // Создайте такой метод, который принимает в аргументы массив строк.
        // Метод внутри должен создать массив строк, в котором содержаться строки,
        // у которых количество гласных букв больше 4.
        // В итоге метод должен возвращать этот массив.
        // Ввод:
        // arman
        // erbolat armagedon avadakedavra lamusicasuena
        // Вывод:
        // avadakedavra lamusicasuena

//        int arr[] = {1, -4, 6, 10, -4, 5, 0, 100, 4};
//        printHello();
//        int sum = getSum();
//        sum = sum + 100;
//        System.out.println(sum);

//        String[] names = getNames();
//        System.out.println(Arrays.toString(names));
//
//        printHello();
//        System.out.println("Not sorted array");
//        System.out.println(Arrays.toString(arr));
//        getSort(arr);
//        System.out.println("Sorted array");
//        System.out.println(Arrays.toString(arr));
        System.out.println();

    }

    // модификатор доступа -> модификатор static(?) -> тип возвращаемого значения -> название метода (аргументы)
    private static void printHello(){
        int a = 10;
        int b = 20;
        System.out.println("Say hello!!!" + (a + b));
    }

    private static String[] getNames(){
        return new String[]{"Erlan", "Arman"};
    }

    private static void getSort(int arr[]){
        Arrays.sort(arr);
    }

    private static int getSum(){
        return 10 + 20;
    }

    private static int getSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


}
