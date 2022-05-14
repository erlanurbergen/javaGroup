package com.company.lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // проверить массив на возрастание его значений [1, 2, 3, 4, 19, 30] -> true

        // отсортировать String text = "hello" -> "ehllo";

        // [1, 4, 5, 6, 3, 2, 10], a = 7, мы должны вернуть массив с этими числами [4, 3], значение должно быть 2
        // [1, 2, 4], a = 7 []

        // оставить только уникальные элементы [1, 2, 3, 1, 2, 3, 5, 99, 100, 5] -> [99, 100]

        // убрать дубли элементов в массиве [1, 1, 2, 3, 4, 2, 5, 6] -> [1, 2, 3, 4, 5, 6]


        // 1 task

//        Scanner scanner = new Scanner(System.in);
//        int arr[] = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        boolean check = true;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] <= arr[i - 1]) {
//                check = false;
//                break;
//            }
//        }
//
//        if (check)
//            System.out.println("Мы идем по возрастанию");
//        else
//            System.out.println("Мы не идем по возрастанию");

        // task 2
        // 1 solution

//        String text = "almaty";
//        // split
//        String[] split = text.split("");
//        // stream
//        String s = Arrays.stream(split).sorted(Comparator.naturalOrder()).collect(Collectors.toList()).toString();
//        System.out.println(s);

        // 2 solution

        // string -> character array
//        String text = "almaty";
        // a = 114
        // b = 115
        // c = 116
        // d = 117
//        char arr[] = text.toCharArray();
//        int box;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    box = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = (char) box;
//                }
//            }
//        }
//
//        System.out.println("Sorting string:" + Arrays.toString(arr));

        // task 3

//        int arr[] = {1, 4, 5, 6, 3, 2, 10};
//        int a = 44;
//        System.out.println(Arrays.toString(sum(arr, a)));

        // task 4

        // 1 Solution

       int arr[] = {99, 12, 3, 2, 2, 3, 5, 99, 100, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//
//            boolean check = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j] && i != j) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check)
//                System.out.println(arr[i] + " ");
//        }


        // task 5
        // 1 Solution

        int[] ints = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(ints));

    }

    private static int[] sum(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == a){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return new int[0];
    }


}
