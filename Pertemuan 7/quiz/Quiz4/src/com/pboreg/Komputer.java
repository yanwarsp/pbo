package com.pboreg;

public class Komputer extends Warnet {

    public void biayaKetik() {
        System.out.println(" Biaya Mengetik             : " + (int) this.ngetik + " menit" + "      Rp." + (this.ngetik * 2000 / 60));
    }

    public void biayaInet() {
        System.out.println(" Biaya Internet             : " + (int) this.internet + " menit" + "      Rp." + (this.internet * 4000 / 60));
    }

    public void biayaGame() {
        System.out.println(" Biaya Game Online          : "+ (int) this.game + " menit" + "      Rp." + (this.game * 5000 / 60));
    }

}
