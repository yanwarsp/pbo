package com.pboreg;

public class Main {

    public static void main(String[] args) {
        int y,x;
        x = 8;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        x = 25;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }

    public static int hitung(int input) {
        int hasil;
        hasil = input * input;

        return hasil;
    }
}
