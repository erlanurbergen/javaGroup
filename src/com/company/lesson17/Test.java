package com.company.lesson17;
import java.io.*;

public class Test {
    public static void main(String[] args){
        Book book = new Book("book1", "123", 323);
        LiteratureBook l1 = new LiteratureBook("author1"
                , 1990);
        ScientificBook s1 = new ScientificBook(12000, "pb1");

        Library library = new Library("lib1", "almaty", "KZ");
        library.addBook(book);
        library.addBook(l1);
        library.addBook(s1);

        library.printData();


    }
}


class Book {
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", pages=" + pages +
                '}';
    }
}

class ScientificBook extends Book {
    private int price;
    private String publisher;


    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    public ScientificBook(int price, String publisher) {
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
    public String toString() {
        return "ScientificBook{" +
                "price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

class LiteratureBook extends Book {
    private String author;
    private int year;

    public LiteratureBook(String name, String code, int pages, String author, int year) {
        super(name, code, pages);
        this.author = author;
        this.year = year;
    }

    public LiteratureBook(String author, int year) {
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LiteratureBook{" +
                "author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

class Library {

    private String name;
    private String city;
    private String country;
    private Book books[] = new Book[1000];
    private int size = 0;


    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    void addBook(Book book) {
        books[size] = book; // size++
        size++;
    }

    void printData() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].toString());
        }
    }


}