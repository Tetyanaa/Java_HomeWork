package com.tplysyuk.Module8;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLasName (String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge (int newAge){
        this.age =newAge;
    }
}
