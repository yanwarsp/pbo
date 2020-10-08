package com.pboreg;

public class Main {

    // membuat method checkAge dengan variabel integer bernama age
    static void checkAge(int age) {
        // jika age kurang dari 18 maka cetak access denied
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
            // jika age lebih dari 18 maka cetak access granted
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
