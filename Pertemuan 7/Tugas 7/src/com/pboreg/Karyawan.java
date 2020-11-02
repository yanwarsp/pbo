package com.pboreg;

public class Karyawan {

    int golongan, jamKerja;

    public Karyawan() {
        this.golongan = this.jamKerja = 0;
    }

    public void setInput(int golongan, int jamKerja) {
        this.golongan = golongan;
        this.jamKerja = jamKerja;
    }

    public void tampilGol() {
        System.out.println("Karyawan Golongan : " + this.golongan);
        System.out.println("Total Jam Kerja : " + this.jamKerja + " jam");
    }

}
