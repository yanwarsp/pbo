package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int golongan, jamKerja;


        System.out.println("---Perhitungan Gaji Bersih Karyawan---");
        System.out.print("Masukan Golongan : ");
        golongan = input.nextInt();
        System.out.print("Masukan Total Jam Kerja : ");
        jamKerja = input.nextInt();
        System.out.println("--------------------------------------");


        Karyawan karywn = new Karyawan();
        karywn.setInput(golongan, jamKerja);
        karywn.tampilGol();

        Gaji iniGaji = new Gaji();
        iniGaji.setInput(golongan, jamKerja);
        iniGaji.gajiAwal();

        Lembur lmbr = new Lembur();
        lmbr.setInput(golongan, jamKerja);
        lmbr.upahLembur();

        Pajak pjk = new Pajak();
        pjk.setInput(golongan, jamKerja);
        pjk.pajak();

        Total ttl = new Total();
        ttl.setInput(golongan, jamKerja);
        ttl.gajiTotal();


    }
}
