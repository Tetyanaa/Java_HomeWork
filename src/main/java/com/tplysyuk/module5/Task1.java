package com.tplysyuk.module5;

public class Task1 {
    public static void main(String[] args) {

        double a = 10;
        double b = 10;
        double c  = 10;
        Vector vector  = new Vector(a,b,c);

        System.out.println(vector.vectorLength());

        Vector vector1  = new Vector(1,2,3);
        vector.scalarMultiplication(vector1);

    }
}
