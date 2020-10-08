package com.pboreg;

public class Main {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static String plusMethod (String x, String y) {
        String hasil = x + " " + y;

        return hasil;
    }

    static String plusMethod (String x, int y) {
        String hasil = "Nama " + x + ", umur " + y + " tahun";

        return hasil;
    }

    public static void main(String[] args) {
        String nilai = plusMethod("Yanwar", "Slamet");
        int myNum1 = plusMethod(8, 10);
        double myNum2 = plusMethod(4.90, 6.26);
        String nilai2 = plusMethod("Yanwar", 19);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("Nilai String: " + nilai);
        System.out.println("Keterangan: " + nilai2);
    }
}
