package com.pboreg;

public class Total extends Karyawan {

    double gaji, tunjangan;

    public void gajiTotal() {

        if (this.golongan == 1) {
            this.gaji = 1486500;
            this.tunjangan = 250000;
        } else if (this.golongan == 2) {
            this.gaji = 1926000;
            this.tunjangan = 300000;
        } else if (this.golongan == 3) {
            this.gaji = 2456700;
            this.tunjangan = 350000;
        } else if (this.golongan == 4) {
            this.gaji = 2899500;
            this.tunjangan = 400000;
        }

        System.out.println("Total Gaji Bersih : Rp."
        + ((this.gaji + this.tunjangan)-((this.gaji + this.tunjangan) * 0.005)+((this.jamKerja-173)*20000)));


    }
}