package com.pboreg;

public class Person {
    String fname = "Yanwar";
    String lname = "Slamet";
    int age = 19;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
