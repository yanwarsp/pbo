package com.pboreg;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Yanwar";
        mahasiswa1.NIM = "2019071024";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 3.7;
        mahasiswa1.umur = 19;
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Slamet";
        mahasiswa2.NIM = "2019071300";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 20;
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}