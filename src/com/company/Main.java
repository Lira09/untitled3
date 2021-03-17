package com.company;

public class Main {

    public static void main(String[] args) {
       Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();
        Hero[] heroes = {warrior,magic,medic};
        String[] heroesAbilityType = { " CRITICAL DAMAGE;"," MAGICAL ABILITY;"," HEALTH ABILITY;"};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(heroesAbilityType[i]);
        }
    }
}

