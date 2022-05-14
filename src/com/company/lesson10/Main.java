package com.company.lesson10;

public class Main {
    public static void main(String[] args) {
        /*
package com.company;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Count count = new Count();

        String subjects[] = {"Physics", "Art", "Music"};
        String courses[] = {"Web", "Cisco", "Linux"};

        User user = new User(123, "Soma", "Somic", "Samal", "Utegen");
        Staff staf = new Staff(1233, "Good", "Bad", "Killer", "Cute", 300000, subjects);
        Student studen = new Student(1237, "Horse", "Candle", "Ulzhan", "Maxat", 3.2, courses);

        User users[] = {user, staf, studen};

        for(User user1 : users) {
          // to get all data
        }

        for (; ; ) {

            System.out.println("PRESS [1] ADD USER" + '\n' +
                    "PRESS [2] TO LIST USERS" + '\n' +
                    "PRESS [0] TO EXIT" + '\n');

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Good job! ");
                break;
            } else if (choice == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT" + '\n' +
                        "PRESS [2] TO ADD STAFF" + '\n');
                int choice1 = sc.nextInt();

                if (choice1 == 1) {

                    Student student = new Student(1222, "jhgf", "kjg", "kjhg","jhgf",2.3, courses);

                    System.out.println("Insert new Id: ");
                    int newId = sc.nextInt();
                    student.setId(newId);

                    System.out.println("Insert new Login: ");
                    String newLogin = sc.next();
                    student.setLogin(newLogin);

                    System.out.println("Insert new Password: ");
                    String newPassword = sc.next();
                    student.setPassword(newPassword);

                    System.out.println("Insert new Name: ");
                    String newName = sc.next();
                    student.setName(newName);

                    System.out.println("Insert new Surname: ");
                    String newSurname = sc.next();
                    student.setSurname(newSurname);

                    System.out.println("Insert new Gpa: ");
                    double newGpa = sc.nextInt();
                    student.setGpa(newGpa);

                    System.out.println("Insert number of new Courses");
                    int a = sc.nextInt();
                    System.out.println("Insert new Courses");
                    String newCourses[] = new String[a];
                    for (int i = 0; i < a; i++) {
                        newCourses[i] = sc.next();
                    }

                    System.out.print("Welcome! " + student.getId() + " " +
                            student.getLogin() + " " +
                            student.getPassword() + " " +
                            student.getName() + " " +
                            student.getSurname() + " " +
                            student.getGpa());
                    for (int i = 0; i < a; i++) {
                        System.out.print(" " + newCourses[i]);
                    }
                    System.out.println('\n');
                    student.setCourses(newCourses);

                    count.addStudents(student);


                }else if(choice1 == 2) {
                    Staff staff = new Staff(12233, "jhgf", ",mnbv", "Kjhgf", "jhgfd",350000, subjects);

                    System.out.println("Insert new Id: ");
                    int newId = sc.nextInt();
                    staff.setId(newId);

                    System.out.println("Insert new Login: ");
                    String newLogin = sc.next();
                    staff.setLogin(newLogin);

                    System.out.println("Insert new Password: ");
                    String newPassword = sc.next();
                    staff.setPassword(newPassword);

                    System.out.println("Insert new Name: ");
                    String newName = sc.next();
                    staff.setName(newName);

                    System.out.println("Insert new Surname: ");
                    String newSurname = sc.next();
                    staff.setSurname(newSurname);

                    System.out.println("Insert new Salary: ");
                    int newSalary = sc.nextInt();
                    staff.setSalary(newSalary);

                    System.out.println("Insert number of new Subjects: ");
                    int b = sc.nextInt();
                    System.out.println("Insert new Subjects: ");
                    String newSubjects[] = new String[b];
                    for (int i = 0; i < b; i++) {
                        newSubjects[i] = sc.next();
                    }

                    System.out.print("Welcome! " + staff.getId() + " " +
                            staff.getLogin() + " " +
                            staff.getPassword() + " " +
                            staff.getName() + " " +
                            staff.getSurname() + " " +
                            staff.getSalary());
                    for (int i = 0; i < b; i++) {
                        System.out.print(" " + newSubjects[i]);
                    }
                    System.out.println('\n');
                    staf.setSubjects(newSubjects);

                    count.addStaffs(staff);

                }else System.out.println("Incorrect! ");

                }else if (choice == 2) {
                    System.out.println("PRESS [1] TO LIST STUDENTS" + '\n' +
                            "PRESS [2] TO LIST STAFF" + '\n');
                    int choice2 = sc.nextInt();

                    if(choice2 == 1) {
                        count.listStudents();
                        System.out.println();
                    }else if(choice2 == 2) {
                        count.listStaffs();
                        System.out.println();
                    }else System.out.println("Incorrect! ");
                } else System.out.println("Incorrect! ");
            }






        }
    }








//package com.company;
//
//public class Count {
//
//    private Student[] students = new Student[100];
//    private Staff[] staffs = new Staff[100];
//    private int size = 0;
//    private int size1 = 0;
//
//    void addStudents(Student student) {
//        students[size++] = student;
//    }
//
//    void addStaffs(Staff staff) {
//        staffs[size1++] = staff;
//    }
//
//    void listStudents() {
//        System.out.println();
//        for (int i = 0; i < size; i++) {
//            System.out.println(students[i]);
//
//        }
//    }
//
//    void listStaffs() {
//        System.out.println();
//        for (int i = 0; i < size1; i++) {
//            System.out.println(staffs[i]);
//
//        }
//    }
//}







//package com.company;
//
//public class User {
//
//    protected int id;
//    protected String login;
//    protected String password;
//    protected String name;
//    protected String surname;
//
//    public User() {
//    }
//
//    public User(int id, String login, String password, String name, String surname) {
//        this.id = id;
//        this.login = login;
//        this.password = password;
//        this.name = name;
//        this.surname = surname;
//    }
//
//        public String getData() {
//        return "User{" +
//                "id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//}












//package com.company;
//
//import java.util.Arrays;
//
//public class Staff extends User {
//
//    private double salary;
//    private String subjects[];
//
//
//    public Staff(int id, String login, String password, String name, String surname, double salary, String subjects[]) {
//        super(id, login, password, name, surname);
//        this.salary = salary;
//        this.subjects = subjects;
//
//    }
//
//    public String getData() {
//        return super.getData()
//                + " salary: " + salary + " subjects: " + Arrays.toString(subjects);
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String[] getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(String[] subjects) {
//        this.subjects = subjects;
//    }
//
//    @Override
//    public String toString() {
//        return "Staff{" +
//                ", id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                "salary=" + salary +
//                ", subjects=" + Arrays.toString(subjects) +
//                '}';
//    }
//}











//package com.company;
//
//import java.util.Arrays;
//
//public class Student extends User {
//
//    private double gpa;
//    private String courses[];
//
////    public Student(double gpa, String[] courses) {
////        this.gpa = gpa;
////        this.courses = courses;
////    }
//
//    public Student(int id, String login, String password, String name, String surname, double gpa, String courses[]) {
//        super(id, login, password, name, surname);
//        this.gpa = gpa;
//        this.courses = courses;
//    }
//
//    public String getData() {
//        return super.getData()
//                + " gpa: " + gpa + " courses: " + Arrays.toString(courses);
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    public String[] getCourses() {
//        return courses;
//    }
//
//    public void setCourses(String[] courses) {
//        this.courses = courses;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                ", id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                "gpa=" + gpa +
//                ", courses=" + Arrays.toString(courses) +
//                '}';
//    }
//}*/


    }
}
