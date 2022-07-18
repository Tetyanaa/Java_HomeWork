package com.tplysyuk.module4;

public class Concat {
    static String myConcat(String str1, String str2) {
        String result = str1.concat(str2);
        result = result.replace("P", "").replace("p", "");
        return result;
    }

    public static void main(String[] args) {
        String string1 = "PHP Exercises and ";
        String string2 = "Python Exercises";
        String result = myConcat(string1, string2);
        System.out.println(result);
    }
}
