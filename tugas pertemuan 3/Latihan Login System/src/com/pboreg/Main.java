package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username;
        String pwd;
        boolean kondisi = true;
        int ulang = 3;

        Scanner inputUser = new Scanner(System.in);

            do {
                ulang--;
                System.out.println("Silahkan anda login");
                System.out.print("Username :  ");
                username = inputUser.next();
                System.out.print("Password :  ");
                pwd = inputUser.next();

                if (username.equals("yanwar") & pwd.equals("yanwar" )) {
                    kondisi = false;
                    System.out.println("Anda berhasil login");
                } else {
                    kondisi = true;
                    System.out.println("Username atau Password yang anda masukan salah");
                    System.out.println("Sisa Percobaan " + ulang + "x lagi");
                }

                if (ulang == 0) {
                    kondisi = false;
                    System.out.println("Sisa Percobaan habis, Maaf akun anda terblokir");
                }

            } while (kondisi);

    }
}
