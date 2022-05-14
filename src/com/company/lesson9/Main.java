package com.company.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * TASK 1

public class Worker {
    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;


    public Worker() {
    }

    public Worker(int id, String name, String surname, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}

//////////////////////////////////////////////////////////////

package Incapsulation_lesson;

public class BankApplication {
    private String name;
    private String country;
    private Worker []workers = new Worker[100]; // Для данного поля геттер и сеттер запрещен
    private int sizeOfWorkers=0;

    public BankApplication() {
    }

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    void addWorker(Worker worker){
        workers[sizeOfWorkers++]=worker;
        System.out.println("New worker was added!");
    }

    void listWorkers(){
        System.out.println(name+" "+country);
        for (int i=0; i<sizeOfWorkers; i++){
            System.out.println(workers[i]);
        }
    }

}

/////////////////////////////////////////////////////////
package Incapsulation_lesson;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankApplication bank1=new BankApplication("Halyk Bank","Almaty");

        System.out.println("Welcome to Java intensive – Almaty\n");
        while(true){
            System.out.println("PRESS\n" +
                    " [1] TO ADD WORKER PRESS \n" +
                    "[2] TO LIST WORKERS\n" +
                    "[0] TO EXIT");

            int choice= sc.nextInt();
            if(choice==0){
                System.out.println("Goodbye!");
                break;
            }
            if(choice==1){
                System.out.println("Enter id");
                int temp_id= sc.nextInt();
                System.out.println("Enter name");
                String temp_name=sc.next();
                System.out.println("Enter surname");
                String temp_surname=sc.next();
                System.out.println("Enter department");
                String temp_department=sc.next();
                System.out.println("Enter salary");
                int temp_salary= sc.nextInt();
                Worker worker=new Worker();
                worker.setId(temp_id);
                worker.setName(temp_name);
                worker.setSurname(temp_name);
                worker.setDepartment(temp_department);
                worker.setSalary(temp_salary);
                bank1.addWorker(worker);
            }

            if(choice==2){
                bank1.listWorkers();
            }

        }
    }
}
/////////////////////////////////////////////////////////////////





Task 2
//////////////////////////////////////////////////////////////
package lesson1;

public class Book {
    private String name;
    private String author;
    private int isbn;
    private int price;

    public Book() {
    }

    public Book(String name, String author, int isbn, int price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

//////////////////////////////////////////////////////
package lesson1;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    int size(){
        return books.length;
    }


    void getBook(int index){
        for (int i = 0; i < books.length; i++) {
            if(index==i){
                System.out.println(books[i]);
            }
        }
    }

    void addBook(Book book){
        books[sizeOfBooks++]=book;
    }

    int priceSum(){
        int sum=0;
        for (int i = 0; i < sizeOfBooks; i++) {
            sum+=books[i].getPrice();
        }
        return sum;
    }

    void pricesOfAllBooks(){
        for (int i = 0; i < sizeOfBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
//////////////////////////////////////////////////////////
package lesson1;
    import java.util.Scanner;
    public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Book book1=new Book("Мастер и Маргарита", "Михаил Булгаков", 1956,1200);
        Book book2=new Book("1984", "Джордж Оруэлл", 1989,3000);
        Book book3=new Book("Маленький принц","Антуан де Сент-Экзюпери",1993,2300);
        Book book4=new Book("Вино из одуванчиков", "Рэй Брэдбери",2003,5000);
        Book book5=new Book("Атлант расправил плечи","Рэнд Айн",1989,8000);
        Book book6=new Book("Бесы","Фёдор Достоевский",1899,3400);
        Book book7=new Book("Harry Potter", "Джоан К. Роулинг", 1999,5400);
        Book book8=new Book("Алхимик", "Пауло Коэльо", 2003, 2000);
        Book book9=new Book("Игра престолов", "Джордж Р. Р. Мартин", 2005, 3900);
        Book book10=new Book("Джейн Эйр", "Шарлотта Бронте", 1878,1600);


        Library library1=new Library("City library", "Almaty");
        Library library2=new Library("Youth library","Astana" );

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);

        library2.addBook(book5);
        library2.addBook(book6);
        library2.addBook(book7);
        library2.addBook(book8);
        library2.addBook(book9);
        library2.addBook(book10);


        System.out.println("Total SUM of all Books : "+(library1.priceSum()+library2.priceSum()));

        System.out.println("/////////////////////////////////////////////////////////");

        System.out.println("Prices of all books");
        library1.pricesOfAllBooks();
        library2.pricesOfAllBooks();

        System.out.println("/////////////////////////////////////////////////////////");

        System.out.println("Total SUM of all Books in Library 1\n"+library1.priceSum());
        System.out.println("Total SUM of all Books in Library 2\n"+library2.priceSum());*/

        // Наследование и полиморфизм

        /*
        * Создайте класс Book с параметрами:
        private String name;
        * private String code;
        * private int pages;
        +Book() // Конструктор по умолчанию
        +Book(String name, String code, int pages) // Конструкторы с параметрами
        Геттеры и сеттеры
        +String getBookData(); // Данный метод возвращает данные о книге
        *
        *
        Создайте класс ScientificBook которая наследует от Book:
        * private int price;
        private String publisher;
        * + ScientificBook()
        + ScientificBook(String name, String code, int pages, int price, String publicsher)
        * Геттеры и сеттеры
        Переопределите метод getBookData()
        Создайте класс LiteratureBook Которая наследует от класса Book:
        * private String author;
        private int publishedYear;
        * + LiteratureBook()
        + LiteratureBook(String name, String code, int pages, String author, int publishedYear)
        Геттеры и сеттеры
        Переопределите метод getBookData()
        *
        * Создайте класс Library с параметрами:
        private String name;
        private String city;
        private String country;
        private Book[] books; //Для данного массива не создавайте геттер и сеттер private int sizeOfBooks; //Для данного типа не создавайте геттер и сеттер
        +Library() // Конструктор по умолчанию
        +Library(String name, String city, String country, Book[] books)
        Геттеры и сеттеры
        + void addBook(Book b) // данный метод добавляет книгу в массив используя курсор sizeOfBooks
        + void printLibraryData() //Данный метод выведет данные о библиотеке и выведет данные о каждой книге
        In main class:
        Создайте объект класса Library.
        Добавьте туда разных по 5 объектов класса ScientificBook и LiteratureBook. Выведите все данные о библиотеке с ее книгами используя метод printLibraryData()
        *
        *
*/

        // Наследование и полиморфизм

        // Родительский класс(субкласс) и дочерний класс(подкласс)

//        Animal animal = new Animal("Animal1", 5);
//        Cat cat = new Cat("Murka", 2, 18);
//        Dog dog = new Dog("Agata", 8, "Gav gav");
//
//        Animal animals[] = {animal, cat, dog};
//        // Erlan Malik Dina Kairike = Human
//
//        for (Animal animal1 : animals) {
//            if (animal1 instanceof Cat){
//                animal1.eat();
//            }
//        }

        List<String> names = new ArrayList<>();

        // преобразование типов
//        Cat animal1 = new Cat("Barsik", 4, 20);
//        Animal animal2 = new Dog("Rax", 5, "brrrr");
//        animal1.jumpOfWall();
//
//        Dog dog1 = (Dog)new Animal("Dog2", 5); // ? npe
//
//

        Book books[] = {
                new Book("Harry potter", "Htrt2", 750),
                new LiteratureBook("War and peace", "iueiru9", 800, "L.N.Tolstoy", 1854),
                new ScientificBook("Interstellar", "iu9090", 500, 4500, "Nolan"),

        };

        Library library = new Library("Central Lib", "Almaty", "KZ");
        library.addBook(books[0]);
        library.addBook(books[1]);
        library.addBook(books[2]);
        library.printLibraryData();

    }

}

class Book {
    // private String name;
    //        * private String code;
    //        * private int pages;

    private String name;
    private String code;
    private int pages;

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getBookData() {
        return "Book{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", pages=" + pages +
                '}';
    }
}

class ScientificBook extends Book {
//    * private int price;
//        private String publisher;
    private int price;
    private String publisher;

    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getBookData() {
        return super.getBookData() + ": Price " + price + " : Publisher " + publisher;
    }
}

class LiteratureBook extends Book {
    private String author;
    private int publishedYear;

    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public LiteratureBook(String author, int publishedYear) {
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String getBookData() {
        return super.getBookData() + " author: " + author + " PublishedYear: " + publishedYear;
    }
}

class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100]; // ?
    int size = 0;

    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    void addBook(Book book) {
        books[size] = book;
        size++;
    }

    void printLibraryData() {
        System.out.println(name + " " + city + " " + country);
        for (int i = 0; i < size; i++) { // ?
            System.out.println(books[i].getBookData());
        }
    }
}
