package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ngetik, internet, game, scan, printWarna, printBW, minum;
        System.out.println("--------------- Penggunaan Komputer ----------------");
        System.out.print(" Mengetik (menit)           : ");
        ngetik = input.nextDouble();
        System.out.print(" Internet (menit)           : ");
        internet = input.nextDouble();
        System.out.print(" Game Online (menit)        : ");
        game = input.nextDouble();
        System.out.println("--------------- Penggunaan Printer -----------------");
        System.out.print(" Scan                       : ");
        scan = input.nextDouble();
        System.out.print(" Print Berwarna             : ");
        printWarna = input.nextDouble();
        System.out.print(" Print Hitam Putih          : ");
        printBW = input.nextDouble();
        System.out.println("----------------------- Minuman ---------------------");
        System.out.print(" Teh botol                  : ");
        minum = input.nextDouble();
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        Komputer kom = new Komputer();
        kom.setInput(ngetik, internet, game, scan, printWarna, printBW, minum);
        kom.biayaKetik();
        kom.biayaInet();
        kom.biayaGame();

        Printer prt = new Printer();
        prt.setInput(ngetik, internet, game, scan, printWarna, printBW, minum);
        prt.biayaScan();
        prt.biayaPrintWarna();
        prt.biayaBW();

        Minuman teh = new Minuman();
        teh.setInput(ngetik, internet, game, scan, printWarna, printBW, minum);
        teh.biayaMinuman();
        System.out.println("-----------------------------------------------------");
        Total ttl = new Total();
        ttl.setInput(ngetik, internet, game, scan, printWarna, printBW, minum);
        ttl.biayaTotal();

    }
}
