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

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        // akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
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
        Player player2 = new Player("Player 2",100);

        // membuat object weapon
        Weapon sniper = new Weapon("Sniper",100);
        Weapon pistol = new Weapon("Pistol",40);

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

        System.out.println("\n Battle");
        System.out.println("\n Round 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\n Round 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
