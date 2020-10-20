package com.pboreg;

class Bilangan {
    private int a = 10;
    private int b = 20;
    private int c = 30;

    // method untuk menampilkan ke luar class
    public int tampilkanA() {
        return this.a;
    }
    public int tampilkanB() {
        return this.b;
    }
    public int tampilkanC() {
        return this.c;
    }

    public void inputData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // method untuk input dari luar class
    public void inputA(int nilai) {
        this.a = nilai;
    }
    public void inputB(int nilai) {
        this.b = nilai;
    }
    public void inputC(int nilai) {
        this.c = nilai;
    }
    //method untuk pertambahan
    public int tambah() {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }

    //method untuk perkurangan
    public int kurang() {
        int hasil = this.a - this.b;
        return hasil;
    }

    //method untuk perkalian
    public int kali() {
        int hasil = this.a * this.c;
        return hasil;
    }

    //method untuk pembagian
    public double bagi() {
        double hasil = (double) this.a / this.b;
        return hasil;
    }
}