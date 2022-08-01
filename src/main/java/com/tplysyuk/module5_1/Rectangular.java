package com.tplysyuk.module5_1;

public abstract class Rectangular implements Shape {
    int length;
    int wide;
    public double getSquare() {

        return length*wide;
    }
}
