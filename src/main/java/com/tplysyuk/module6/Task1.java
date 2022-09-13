package com.tplysyuk.module6;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {


         System.out.println(getDictionary("text"));

    }

    public static HashMap<Character, Integer> getDictionary(String text) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (char i : text.toCharArray()) {
            if (result.containsKey(i)) {
                int currentCount = result.get(i);
                result.put(i, currentCount+1);
            }
            else {
                result.put(i, 1);
            }
        }
        return result;
    }
}
