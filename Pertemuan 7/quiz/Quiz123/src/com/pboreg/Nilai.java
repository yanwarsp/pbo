package com.pboreg;

public class Nilai {
    int a, b, c;

    public Nilai() {
        this.a = this.b = this.c = 0;
    }


    public void inputNilai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void outputNilai() {
        System.out.println("Nilai a = " + this.a);
        System.out.println("Nilai b = " + this.b);
        System.out.println("Nilai c = " + this.c);
    }
}

