package com.tplysyuk.module5_1;

public class Task2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        System.out.println(shape1.getSquare());
        Shape shape2 = new Oval(10, 5);
        System.out.println(shape2.getSquare());
        Shape shape3 = new Square(10, 12);
        System.out.println(shape3.getSquare());
        Shape shape4 = new Rectangle(5, 6);
        System.out.println(shape4.getSquare());

    }
}
