package com.pboreg;

abstract class Luas {
    protected double s1;
    protected double s2;
    public Luas() {
        this.s1 = 0;
        this.s2 = 0;
    }

    public void setSisi(double s1) {
        this.s1 = s1;

    }
    public void setSisi(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public abstract double getLuas();
}

class Segitiga extends Luas {
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class Lingkaran extends Luas {
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return  luas;
    }
}

public class Main {

    public static void main(String[] args) {
        Segitiga lsSegitiga = new Segitiga();
        lsSegitiga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                lsSegitiga.getS1() + " x " +
                lsSegitiga.getS2() + " = " + lsSegitiga.getLuas());

        Lingkaran lsLing = new Lingkaran();
        lsLing.setSisi(10);
        System.out.println("Luas Lingkaran = " + lsLing.getLuas());


    }
}
