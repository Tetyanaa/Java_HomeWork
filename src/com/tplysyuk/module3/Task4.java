package com.tplysyuk.module3;

public class Task4 {

    public static void main(String[] args) {


        //4.	Write a Java program to sum values of an array.


        int[] array = {5, 6, 7, 12, -5, 32, 43};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println(sum);
    }
}
