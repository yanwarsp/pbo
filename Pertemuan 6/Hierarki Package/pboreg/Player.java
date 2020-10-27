package com.pboreg;

import com.terminal.Console;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void show() {

        Console.log("Ini Menggunakan Console");
        Console.log("Player name : " + this.name);
    }
}