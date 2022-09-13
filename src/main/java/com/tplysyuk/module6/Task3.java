package com.tplysyuk.module6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<String> orders = Arrays.asList("Socks", "T-Shirts", "Socks", "Dress", "Hat", "Dress");
        HashSet<String> hashSet = new HashSet<>(orders);
        TreeSet<String> treeSet = new TreeSet<>(orders);

        System.out.println(hashSet);
        System.out.println(treeSet);

    }
}
