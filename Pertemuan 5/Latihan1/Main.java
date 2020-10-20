package com.pboreg;

class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Main{

    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Player 1",100);
        Player player2 = new Player("Player 2",50);

        // membuat object weapon
        Weapon sniper = new Weapon("Sniper",100);
        Weapon pistol = new Weapon("Pistol",30);

        // membuat object armor
        Armor level3 = new Armor("lvl3",100);
        Armor level1 = new Armor("lvl1",25);

        // player 1
        player1.equipWeapon(sniper);
        player1.equipArmor(level3);
        player1.display();

        // player 2
        player2.equipWeapon(pistol);
        player2.equipArmor(level1);
        player2.display();
    }
}