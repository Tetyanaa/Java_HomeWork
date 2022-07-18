package com.tplysyuk.module4;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {

        NumberHolder testHolder = new NumberHolder();
        testHolder.anInt = 1;
        testHolder.aFloat = 1.1f;
        System.out.println(testHolder.aFloat);
        System.out.println(testHolder.anInt);
    }
}
