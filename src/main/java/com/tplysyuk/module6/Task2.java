package com.tplysyuk.module6;

import java.util.ArrayList;
import java.util.Collection;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> collectionList = new ArrayList<Integer>();
        collectionList.add(1);
        collectionList.add(1);
        collectionList.add(2);
        collectionList.add(3);
        collectionList.add(3);

        Collection<Integer> listWithoutDuplicates = removeDuplicatesFromCollection (collectionList);
        System.out.println(listWithoutDuplicates);
    }

    public static <T> Collection<T> removeDuplicatesFromCollection (Collection<T> items) {
        Collection<T> result  = new ArrayList<T>();
        for (T i: items) {
            if(!result.contains(i) ) {
                result.add(i);
            }
        }
        return result;
    }


}
