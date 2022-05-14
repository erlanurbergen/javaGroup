package com.company.lesson8;

public class Main {
    public static void main(String[] args) {
        /*
        //Student Class
        package com.company;

public class Student {
   public int id;
   public String name;
   public String surname;
   public double gpa;

   public Student() {

   }
   Student(int id, String name, String surname, double gpa){
       this.id = id;
       this.name = name;
       this.surname = surname;
       this.gpa = gpa;
   }
   public String getStudentData(){
       return "Id: " + id + ", Name: " + name + ", Surname: " + surname + ", GPA: " + gpa;
   }


   @Override
   public String toString() {
       return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", gpa=" + gpa +
               '}';
   }
}


// Club class
package com.company;

import java.util.Arrays;

public class Club {
   public String name;
   public String country;
   public int ratingPoints;
   public Player[] players;
   public Club(){};

   public Club(String name, String country, int ratingPoints, Player[] players) {
       this.name = name;
       this.country = country;
       this.ratingPoints = ratingPoints;
       this.players = players;
   }

   public void printClubData(){
       System.out.println("Club name: " + name + ", Country: " + country + ", Rating Points: " + ratingPoints + ", The players: \n" +
               Arrays.toString(players));
   }
}


//Player
package com.company;

public class Player {
   public int number;
   public String name;
   public String surname;
   public String position;
   public Player(){};

   public Player(int number, String name, String surname, String position) {
       this.number = number;
       this.name = name;
       this.surname = surname;
       this.position = position;
   }

   @Override
   public String toString() {
       return "Player{" +
               "number=" + number +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", position='" + position + '\'' +
               '}';
   }
}


//Main class

package com.company;

import java.util.*;
import java.lang.*;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //1
//        Student[] students = {
//                new Student(1, "Jongar", "Jongarov", 3.2 ),
//                new Student(2, "Palenshe", "Palensheev", 2.9 ),
//                new Student(3, "Arman", "Ospanov", 2.5 ),
//                new Student(4, "Joske", "JoJo", 2.5 ),
//                new Student(5, "Naruto", "Uzumaki", 2.5 )
//        };
//
//        for (Student student: students) {
//            System.out.println(student.getStudentData());
//        }

       //2
//        System.out.println("The best student is: " + topStudent(students).getStudentData());

       //3
//        ArrayList<Student> students = new ArrayList<>();
//        int id = 0;
//        boolean bool = true;
//        while (bool){
//            menu();
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("Insert name: ");
//                    String name = scanner.next();
//                    System.out.println("Insert surname: ");
//                    String surname = scanner.next();
//                    System.out.println("Insert gpa: ");
//                    double gpa = scanner.nextDouble();
//
//                    Student student = new Student(id, name, surname, gpa);
//                    students.add(student);
//                    id = id +1;
//
//                    break;
//                case 2:
//                    for (Student i: students) {
//                        System.out.println(i.getStudentData());
//                    }
//                    break;
//                case 0:
//                    bool = false;
//                    break;
//                default:
//                    System.out.println("Enter the right number!");
//
//            }
//        }

       //4
       Player[] players1 = {
               new Player(1, "Marc Andre", "Ter-Stegen", "Goalkeeper"),
               new Player(2, "Sergino", "Dest", "Right Defender"),
               new Player(3, "Gererd", "Pique", "Defender"),
               new Player(4, "Ronald", "Araujo", "Defender")
       };


       Player[] players2 = {
               new Player(5, "Sergio", "Busquets", "Middle"),
               new Player(6, "Riqui", "Puig", "Middle"),
               new Player(7, "Ousmane", "Dembele", "Middle"),
               new Player(8, "Frenkie", "De Jong", "Middle")
       };

       Club[] league = {
               new Club("Barca", "Kazakhstan", 5, players1),
               new Club("Real", "Ukraine", 4, players2)
       };

       for (int i = 0; i < league.length; i++) {
           System.out.println(Arrays.toString(sortPlayers(league[i].players)));
           System.out.println("------------------");
           sortClub(league)[i].printClubData();

       }


//        for (int i = 0; i < league.length; i++) {
//            league[i].printClubData();
//        }
   }
   private static Player [] sortPlayers(Player[] players){
       for (int i = 0; i < players.length; i++) {
           for (int j = 0; j < players.length-1-i; j++) {
               if (players[j].number < players[j+1].number){
                   Player player = players[j];
                   players[j] = players[j+1];
                   players[j + 1] = player;
               }
           }
       }
       return players;
   }
   private static Club [] sortClub(Club []club){
       for (int i = 0; i < club.length; i++) {
           for (int j = 0; j < club.length-1-i; j++) {
               if (club[j].ratingPoints < club[j+1].ratingPoints){
                   Club club1 = club[j];
                   club[j] = club[j+1];
                   club[j + 1] = club1;
               }
           }
       }
       return club;
   }
   private static Student topStudent (Student[] students){
       for (int i = 0; i < students.length; i++) {
           for (int j = 0; j < students.length-1-i; j++) {
               if (students[j].gpa < students[j+1].gpa){
                   Student student1 = students[j];
                   students[j] = students[j+1];
                   students[j + 1] = student1;
               }
           }
       }
       return students[0];
   }
   private static void menu(){
       System.out.println("PRESS [1] TO ADD STUDENT \n" +
               "PRESS [2] TO LIST STUDENT \n" +
               "PRESS [0] TO EXIT");
   }
}


*/
        // static field
        // вложенные классы (статические и не статические) nested class
        // builder pattern
        // инкапсуляция
        // getters and setters
        // https://habr.com/ru/post/439648/

//        Car car = new Car("Toyota camry 50", 45000);
//        car.sayHello();

        Person person = new Person.BuilderPerson()
                .withName("Erlan")
                .build();

        System.out.println(person);

    }

    // ????????
}

