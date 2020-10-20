package com.pboreg;

public class Main {

    public static void main(String[] args) {

        Bilangan bil = new Bilangan();
        System.out.println("Nilai A = " + bil.tampilkanA());
        System.out.println("Nilai B = " + bil.tampilkanB());
        System.out.println("Nilai C = " + bil.tampilkanC());

        // nilai diinput
        bil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + bil.tampilkanA());
        bil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + bil.tampilkanB());
        bil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + bil.tampilkanC());

        System.out.println("Hasil Pertambahan = " + bil.tambah());
        System.out.println("Hasil Pengurangan = " + bil.kurang());
        System.out.println("Hasil Perkalian = " + bil.kali());
        System.out.println("Hasil Pembagian = " + bil.bagi());

        bil.inputData(3, 5, 10);
        System.out.println("Hasil Pertambahan = " + bil.tambah());
    }
}
