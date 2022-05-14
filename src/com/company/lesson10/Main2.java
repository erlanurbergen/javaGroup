package com.company.lesson10;

public class Main2 {
    public static void main(String[] args) {
       Square square = new Square(10);
       Circle circle = new Circle(5);

      Shape shapes[] = {square, circle};

        for (Shape shape : shapes) {
           shape.printArea();
        }
    }
}

// geometry

abstract class Shape {

    abstract double getArea();
    abstract double getPerimeter();

    void printArea() {
        System.out.println("Area is: " + getArea());
    }

    void printPerimeter() {
        System.out.println("Perimetr is: " + getPerimeter());
    }

}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius * radius;
    }
}

class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width * width;
    }

    @Override
    double getPerimeter() {
        return 4 * width;
    }
}
