package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        Nilai objNilai = new Nilai();
        JumlahRata objJml = new JumlahRata();
        MaxMin objMaxMin = new MaxMin();

        System.out.print("Input Nilai a : ");
        a = input.nextInt();
        System.out.print("Input Nilai b : ");
        b = input.nextInt();
        System.out.print("Input Nilai c : ");
        c = input.nextInt();

        objNilai.inputNilai(a,b,c);
        objNilai.outputNilai();

        objJml.inputNilai(a,b,c);
        objJml.jumlah();
        objJml.ratarata();

        objMaxMin.inputNilai(a,b,c);
        objMaxMin.nilaiMax();
        objMaxMin.nilaiMin();
    }
}
