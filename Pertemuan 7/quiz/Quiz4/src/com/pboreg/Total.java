package com.pboreg;

public class Total extends Warnet {

    public void biayaTotal() {
        System.out.println(" TOTAL BIAYA                :              Rp."
                + ((this.ngetik * 2000 / 60)
                + (this.internet * 4000 / 60)
                + (this.game * 5000 / 60)
                + (this.scan * 1000)
                + (this.printWarna * 500)
                + (this.printBW * 300)
                + (this.minum * 3000)));
    }
}
