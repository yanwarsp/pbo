package com.pboreg;

public class Printer extends Warnet {

    public void biayaScan() {
        System.out.println(" Biaya Scan                 : "+ (int) this.scan + " file" + "        Rp." + this.scan * 1000);
    }

    public void biayaPrintWarna() {
        System.out.println(" Biaya Print Berwarna       : " + (int) this.printWarna + " lembar" + "      Rp." + this.printWarna * 500);
    }

    public void biayaBW() {
        System.out.println(" Biaya Print Hitam Putih    : " + (int) this.printBW + " lembar" + "      Rp." + this.printBW * 300);
    }

}