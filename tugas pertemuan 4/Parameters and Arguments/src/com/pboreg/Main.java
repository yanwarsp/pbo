package com.pboreg;

public class Main {
    static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
        }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}

// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes