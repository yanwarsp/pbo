package com.pboreg;

import java.util.Scanner;

class Orang {
    private int _umur;
    private String _nama;
    private String golDarah;

    // constructor
    public Orang() {
        this._nama = "";
        this._umur = 0;
    }

    //method
    public void setUmur(int umur) {
        this._umur = umur;
    }

    public void setNama(String nama) {
        this._nama = nama;
    }

    public int getUmur() {
        return this._umur;
    }

    public String getNama() {
        return this._nama;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }
}

class Pegawai extends Orang {
    private String nip;
    private int golongan;
    private int gajiPokok;
    private int tunjangan;
    private int jamLembur;
    private int pajak;
    private int jamKerja;
    private int totalJamKerja;

    public int getTotalJamKerja() {
        return totalJamKerja;
    }

    public void setTotalJamKerja(int totalJamKerja) {
        this.totalJamKerja = totalJamKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getPajak() {
        return pajak;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }


    public int getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }

    public int getUpahLembur() {
        return upahLembur;
    }

    public void setUpahLembur(int upahLembur) {
        this.upahLembur = upahLembur;
    }

    private int upahLembur;

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Pegawai() {
        this.nip = "";

    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Pegawai peg = new Pegawai();
        String nama;
        int umur;
        String nip;
        String golonganDarah;
        int golongan;
        int gajiPokok;
        int tunjangan;
        int pajak;
        int jamLembur;
        int upahLembur = 20000;
        int jamKerja = 173;
        int totalJamKerja;

        System.out.println("Data Karyawan");
        System.out.print("Input NIP: ");
        nip = input.nextLine();
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        System.out.print("Input Golongan Darah: ");
        golonganDarah = input.nextLine();
        System.out.print("Input Umur: ");
        umur = input.nextInt();
        System.out.print("Input Golongan: ");
        golongan = input.nextInt();
        System.out.print("Input Total Jam Kerja: ");
        totalJamKerja = input.nextInt();

        peg.setNama(nama);
        peg.setNip(nip);
        peg.setGolDarah(golonganDarah);
        peg.setUmur(umur);
        peg.setGolongan(golongan);
        peg.setTotalJamKerja(totalJamKerja);
        peg.setJamKerja(173);
        jamLembur = totalJamKerja - jamKerja;
        upahLembur = 20000 * jamLembur;
        peg.setJamLembur(jamLembur);
        peg.setUpahLembur(upahLembur);

        System.out.println("------------------------------");
        System.out.println("Data Karyawan");
        System.out.println("NIP: " + peg.getNip());
        System.out.println("Nama: " + peg.getNama());
        System.out.println("Golongan Darah: " + peg.getGolDarah());
        System.out.println("Umur: " + peg.getUmur());
        System.out.println("Golongan: " + peg.getGolongan());
        System.out.println("Total Jam Kerja: " + peg.getTotalJamKerja() + " jam");
        System.out.println("Jam Lembur: " + peg.getJamLembur() + " jam");

        peg.setGolongan(golongan);

        if (golongan == 1) {
            gajiPokok = 1486500;
            tunjangan = 250000;
            peg.setGajiPokok(gajiPokok);
            peg.setTunjangan(tunjangan);

        } else if (golongan == 2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
            peg.setGajiPokok(gajiPokok);
            peg.setTunjangan(tunjangan);

        } else if (golongan == 3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
            peg.setGajiPokok(gajiPokok);
            peg.setTunjangan(tunjangan);

        } else if (golongan == 4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
            peg.setGajiPokok(gajiPokok);
            peg.setTunjangan(tunjangan);

        }

        peg.setPajak(pajak = 5/1000 * (peg.getGajiPokok() + peg.getTunjangan()));

        System.out.println("Gaji Pokok: Rp." + peg.getGajiPokok());
        System.out.println("Tunjangan: Rp." + peg.getTunjangan());
        System.out.println("Upah Lembur: Rp." + peg.getUpahLembur());
        System.out.println("Pajak: Rp." + peg.getPajak());

    }
}
