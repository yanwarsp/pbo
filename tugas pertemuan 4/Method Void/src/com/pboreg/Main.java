package com.pboreg;

public class Main {

    public static void main(String[] args) {
        System.out.println(simpel());
        fungsiVoid("Semuanya");
       permisi("Ibu");
        permisi("Ayah");
    }

    private static void permisi(String nama) {
        System.out.println("Permisi " + nama);
    }

    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    private static float simpel() {
        return 10.0f;
    }
}
