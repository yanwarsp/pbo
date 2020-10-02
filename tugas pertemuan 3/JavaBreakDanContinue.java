package com.pboreg;

public class JavaBreakDanContinue {

    public static void main(String[] args) {

        // break
        System.out.println("Pwnggunaan break");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nPenggunaan continue");
        // continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
