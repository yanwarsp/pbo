package com.pboreg;
import java.util.Scanner;

class ContohArray2 {
    private int [] angka;
    public ContohArray2(int jmlData) {
        angka = new int[10];
    }
    public void viewAllFor() {
        System.out.println("View All For");
        for(int i = 0; i < this.angka.length; i++) {
            System.out.println("Nilai " + (i+1) + " = " + this.angka[i]);
        }
    }
    public void setAngka() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Data");
        for(int i = 0; i < 10; i++) {
            System.out.print("Nilai " + (i+1) + " = ");
            this.angka[i] = input.nextInt();
        }
    }
}

public class Main2 {

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
      //  System.out.print("Masukan Jumlah Bilangan : ");
     //   int jmlBil = 10;
        ContohArray2 arrA = new ContohArray2(10);
        arrA.setAngka();
        arrA.viewAllFor();
    }
}
