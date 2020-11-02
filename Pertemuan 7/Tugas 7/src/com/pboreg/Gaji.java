package com.pboreg;

public class Gaji extends Karyawan {

    double gaji, tunjangan;

    public void gajiAwal() {
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
        System.out.println("Gaji : Rp." + this.gaji);
        System.out.println("Tunjangan : Rp." + this.tunjangan);
    }


}
