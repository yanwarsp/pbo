package com.pboreg;

import java.util.Scanner;

class Array {
    private int[] data;

    public Array(int jmlhData) {
        data = new int[jmlhData];
    }

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");

        System.out.println("Masukan Data");
        for (int i = 0; i < 10; i++) {
            System.out.print("Data ke " + (i + 1) + " = ");
            this.data[i] = input.nextInt();
        }
    }

    public void viewData() {
        System.out.println("--------------------------------");
        System.out.println("Daftar Data yang telah dimasukan");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + this.data[i]);
        }
    }

    public void cariData() {
        int cari;
        boolean found = false;

        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------");
        System.out.print("Cari Data : ");
        cari = input.nextInt();
        for (int i = 0; i < 10; i++) {
            if (this.data[i] == cari) {
                found = true;
                System.out.println("Data ditemukan : " + this.data[i]
                        + "\nPada Index ke  : " + i);
            }
        }

        if (found == false) {
            System.out.println("Data tidak ditemukan");
        }

    }


}


public class Main {

    public static void main(String[] args) {

        Array objArray = new Array(10);
        objArray.setData();
        objArray.viewData();
        objArray.cariData();
    }
}
