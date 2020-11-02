package com.pboreg;

public class Lembur extends Karyawan {

    public void upahLembur() {
        System.out.println("Jam Lembur : " + (this.jamKerja - 173) + " jam");
        System.out.println("Upah Lembur : Rp." + ((this.jamKerja - 173) * 20000));
    }
}
