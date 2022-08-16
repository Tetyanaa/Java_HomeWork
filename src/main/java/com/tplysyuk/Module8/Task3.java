package com.tplysyuk.Module8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        Set <String> uniqueWords = personList
                .stream().filter(person->person !=null && person.getAge()>18).map(person ->person.getFirstName()).map(name->name.trim()).filter(name->name.length()>0).map(name->name.toUpperCase())
                .collect(Collectors.toSet());

        System.out.println(uniqueWords);

    }
}
