package com.pboreg;

public class Main {

    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(10,5);
        System.out.println(z);
    }
}

// output 15 (10 + 5)