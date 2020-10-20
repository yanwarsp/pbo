package com.pboreg;

class Polos{
    String dataString;
    int dataInteger;
}

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Yanwar", "2019071024", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Slamet", "2019071200", "Informatika");
    }
}