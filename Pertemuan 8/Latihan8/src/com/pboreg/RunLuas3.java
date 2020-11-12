package com.pboreg;

interface HitungLuas3 {
    public void setSisi(double...sisi);
    public double getLuas();
    }


class Segitiga3 implements HitungLuas3 {
    private double alas;
    private double tinggi;
    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }
    public double getLuas() {
        double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }
}


public class RunLuas3 {

    public static void main(String[] args) {
        Segitiga3 lsSegitiga = new Segitiga3();
        lsSegitiga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                lsSegitiga.getAlas() + " x " +
                lsSegitiga.getTinggi() + " = " + lsSegitiga.getLuas());



    }


}
