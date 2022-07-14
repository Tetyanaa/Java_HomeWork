package com.tplysyuk.module3;

public class Task2 {


    public static void main(String[] args) {

        Operators operators =  new Operators();

        System.out.println();

        System.out.println(operators.addition((operators.multiplication(8,6)),-5));
        System.out.println(operators.mod((operators.addition(55,9)),9));
        System.out.println(operators.addition(20, operators.multidiv(-3,5,8)));
        System.out.println(operators.addition((operators.subtraction((operators.divmulti(15,3,2)),(operators.mod(8,3)))),5));

    }
}
