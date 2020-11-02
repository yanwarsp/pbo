package com.pboreg;

public class JumlahRata extends Nilai {

    public JumlahRata (){
       super();
    }

     public void jumlah() {
         System.out.println("Hasil Penjumlahan = " + (this.a + this.b + this.c));
    }

    public void ratarata() {
         System.out.println("Hasil Rata-Rata = " + ((this.a + this.b + this.c)/3));
    }
}
