package com.pboreg;

import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Yanwar");
        Player player2 = new Player("Slamet");
        Player player3 = new Player("Priadi");
        player1.show();
        player2.show();
        player3.show();

        Console.log("test");
        Console.log("test");
    }
}
