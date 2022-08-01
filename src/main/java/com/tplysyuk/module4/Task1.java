package com.tplysyuk.module4;

public class Task1 {
    static String stringConcatenation(String str1, String str2) {
        String result = str1.concat(str2).replace("P", "").replace("p", "");
       return result;
    }

    public static void main(String[] args) {
        String string1 = "PHP Exercises and ";
        String string2 = "Python Exercises";
        System.out.println(stringConcatenation(string1, string2));
    }
}
