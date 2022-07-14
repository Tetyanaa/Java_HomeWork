package com.tplysyuk.module3;

public class Task3 {


    public static void main(String[] args) {
        int firstNum = 125;
        int secNum = 24;
        Operators operators = new Operators();
        System.out.println(operators.addition(firstNum, secNum));
        System.out.println(operators.subtraction(firstNum, secNum));
        System.out.println(operators.multiplication(firstNum, secNum));
        System.out.println(operators.divisions(firstNum, secNum));
        System.out.println(operators.mod(firstNum, secNum));


    }
}
