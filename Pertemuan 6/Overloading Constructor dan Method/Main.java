package com.pboreg;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Yanwar");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Slamet");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading methods

        int a = Matematika.tambah(5, 19);
        System.out.println(a);
        double b = Matematika.tambah(3, 0.50);
        System.out.println(b);
    }
}