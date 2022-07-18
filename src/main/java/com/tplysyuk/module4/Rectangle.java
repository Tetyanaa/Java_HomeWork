package com.tplysyuk.module4;

public class Rectangle {
    int weight;
    int height;

    private int area() {

        return height * weight;
    }

    public static void main(String[] arg) {

        Rectangle myRect = new Rectangle();
        myRect.weight = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());

    }
}
