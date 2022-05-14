package com.company.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

//        //1
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        System.out.println("Max value is: " +intMax(a,b,c));
 //1
   private static int intMax(int a, int b, int c){
       return Math.max(a,Math.max(b,c));
   }

//
//        // 2
//        System.out.println("Enter size of array: ");
//        int n = scanner.nextInt();
//        Random random = new Random();
//        int[] a = new int[n];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(-10,10);
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println("Count is: " + arrCount(a));

//2
   private static int arrCount(int[] a){
       int count = 0;
       for (int i : a) {
           if (i != 0){
               count++;
           }
       }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]!=0){
//                count++;
//            }
//        }
       return count;
   }

       //3
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int[][] arr = new int[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(getMaxCount(arr));

//3
   private static int getMaxCount(int[][] arr){

       int count = 0;
       int max = count;
       int raw = 0;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if (arr[i][j] != 0){
                   count++;
               }
           }
           if (count >= max){
               max = count;
               raw = i+1;
           }
           count = 0;
       }
       return raw;
   }

       // 4
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int[][] arr = new int[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        mirroredArr(arr);
//4
   private static void mirroredArr(int[][] arr){

       for (int i = arr.length-1; i >=0; i--) {
           for (int j = 0; j < arr.length; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   }

       //5
       System.out.println("Enter size of arr: ");
       int a = scanner.nextInt();
       System.out.println("Enter n: ");
       int n = scanner.nextInt();
       int[] arr = new int[a];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = scanner.nextInt();
       }

       indexedNum(arr,n);


   }

   //5
   private static void indexedNum(int[] arr, int n){
       System.out.println("The new array: ");
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == i && arr[i] % n !=0){
               System.out.print(arr[i] + " ");
           }
       }
   }

         */

        // ООП - Объектно - ориентированное программирование
        // Инкапсуляция
        // Наследование и полиморфизм
        // Абстрактные классы и интерфейсы (SOLID, DRY, KISS)

        // Person 5
        City city = new City("Almaty", 3000000);
        City city2 = new City("Astana", 2000000);

        String hobbies1[] = {"Football", "Basketball"};

        String hobbies2[] = {"Swimming", "Running"};

        Person persons[] = {
                new Person("Erlan", 28, city, hobbies1),
                new Person("Arman", 20, city2, hobbies2),
                new Person("Usman", 29, city2, hobbies1),
                new Person("Zarema", 18, city, hobbies2)
        };

        persons[1].addBook("Fantasy");
        persons[1].addBook("Adventure");

        persons[2].addBook("Horror");
        persons[2].addBook("Love story");

        persons[1].showData();
        System.out.println("-------------------------");
        persons[2].showData();

//        printPersonArray(sortPersonArray(persons));
    }

    private static Person[] sortPersonArray(Person person[]) {
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].age > person[j + 1].age) {
                    Person person1 = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = person1;
                }
            }
        }
        return person;
    }

    private static void printPersonArray(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
