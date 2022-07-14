package com.tplysyuk.module3;

public class Task5 {
    public static void main(String[] args) {


        //5.Write a Java program to find the duplicate values of an array of integer values.

        int[] array = {5, 6, 7, 12, -5, 32, 43, 6, 12};

        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array.length; y++) {
                if (array[i] == array[y]) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
