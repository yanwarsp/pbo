package com.pboreg;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Yanwar";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Randi";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Larry";
        hero3.display();
    }
}