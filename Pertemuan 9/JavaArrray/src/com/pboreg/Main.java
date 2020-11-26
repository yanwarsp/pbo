package com.pboreg;

class ContohArray {
    private int [] angka = {10, 5, 3, 15, 12, 32};
    public void viewAllManual() {
        //sebut datanya satu satu berdasarkan indexnya
        System.out.println("View All Manual");
        System.out.println("NIlai 1 = " + this.angka[0]);
        System.out.println("NIlai 2 = " + this.angka[1]);
        System.out.println("NIlai 3 = " + this.angka[2]);
        System.out.println("NIlai 4 = " + this.angka[3]);
        System.out.println("NIlai 5 = " + this.angka[4]);
        System.out.println("NIlai 6 = " + this.angka[5]);
    }
    public void viewAllFor() {
        System.out.println("View All For");
        for(int i = 0; i < this.angka.length; i++) {
            System.out.println("NIlai " + (i+1) + " = " + this.angka[i]);
        }
    }
    public void viewAllWhile() {
        //inisialisasi
        int i = 0;
        System.out.println("View All WHile");
        while(i < this.angka.length) {
            System.out.println("NIlai " + (i+1) + " = " + this.angka[i]);
            i++;
        }
    }
    public void viewByID(int i) {
        System.out.println("VIew By Index");
        System.out.println("NIlai " + (i+1) + " = " + this.angka[i]);
    }
    public void totalData() {
        int total = 0;
        System.out.print("Total Data : ");
        for(int i = 0; i < this.angka.length; i++) {
            total = total + this.angka[i];
        }
        System.out.println(total);
    }
    public void ratarata() {
        System.out.print("Rata - Rata : ");
        int total = 0;
        double rata;
        for(int i = 0; i < this.angka.length; i++) {
            total = total + this.angka[i];
        }
        rata = (double) total / this.angka.length;
        System.out.println(String.format("%.2f",rata));
    }

}

public class Main {

    public static void main(String[] args) {

        ContohArray objArrA = new ContohArray();
        objArrA.viewAllManual();
        objArrA.viewAllFor();
        objArrA.viewAllWhile();
        objArrA.viewByID(2);
        objArrA.totalData();
        objArrA.ratarata();
    }
}
