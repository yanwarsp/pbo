package com.pboreg;

abstract class Person {
    public String fname = "Yanwar";
    public int age = 22;
    public abstract void study();
}

class Student extends Person {
    public int graduationYear = 2023;
    public void study() {
        System.out.println("Studying all day long");
    }
}
