package com.pboreg;

//class Abstract
abstract class Hewan {
    //abstract method (tidak memiliki body)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz...");
    }
}

//Subclass (turunan dari Class Hewan)
class Ayam extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kuukuuruyuuuukkk...");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Meeeooooowww...");
    }
}

public class Main {

    public static void main(String[] args) {

        Ayam ayamku = new Ayam(); //membuat object ayam
        ayamku.suaraHewan();
        ayamku.tidur();

        Kucing kucingku = new Kucing(); //membuat object kucing
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
