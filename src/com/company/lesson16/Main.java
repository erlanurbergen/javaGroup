package com.company.lesson16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // try catch throw свои исключения
        /*
        * Задание 1.
        Создайте класс Book с параметрами:
        - int id;
        - String name;
        - String author;
        Добавьте геттеры и сеттеры
        + String toString(); ////данный метод возвращает все данные по книге
        Создайте класс Library с параметрами:
        * - String name;
        - String city;
        - Book books[] = new Book[20];
        - int index = 0;
        Добавьте геттеры и сеттеры для каждого поля кроме index и массива books.
        Создайте метод addBook(Book book) который добавляет книгу в список, и увеличивает значение index на 1.
        Создайте метод printBooks(); //// данный метод списком выводит данные по всем книгам
        В ходе разработки и запуска, есть вероятность что человек может добавить в список не инициализированный объект класса Book (т.е. Book b = null), что приводит выбросу исключения NullPointerException, если мы хотим вывести его данные с помощью метода toString().
        * Ваша задача состоит в том, чтобы метод printBooks() самостоятельно отлавливала эту ошибку и вместо выброса из цикла программы, метод должен просто вывести сообщение : "The book is empty".
        При добавлении книги в список книг при помощи метода addBook(Book book), вы должны отлавливать ошибку ArrayIndexOutOfBoundsException, которая выбрасывается при превышении размера массива. и вместо исключения, мы должны вывести на экран "The library is full".*/
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Library1", "Almaty");
        library.addBook(null);
        library.addBook(new Book(1, "Book1", "Author1"));
        library.addBook(new Book(2, "Book2", "Author2"));
        library.addBook(null);
        library.addBook(new Book(2, "Book3", "Author3"));

        try {
            library.printBooks();
        }catch (BookIsEmpty b){
            b.printStackTrace();
        }

        System.out.println("hello");

    }
    private static int getSQRT(int a) {
        if (a < 0) {
            throw new RuntimeException("Вы ввели отрицательное число");
        }
        return (int)Math.sqrt(a);
    }
}

class Book {
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
    private String name;
    private String city;
    private Book books[] = new Book[20];
    private int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    void addBook(Book book) {
        books[index] = book;
        index++;
    }

    void printBooks() {
        for (int i = 0; i < index; i++) {
            try {
                if (books[i] != null)
                    System.out.println(books[i]);
                else {
                    throw new BookIsEmpty();
                }
            }catch (BookIsEmpty b){
                b.printStackTrace();
            }

        }
    }
}
class BookIsEmpty extends NullPointerException {

    @Override
    public void printStackTrace() {
        System.out.println("Book is empty");
    }
}

class MyException extends RuntimeException {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
