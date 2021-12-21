package com.HW3.Weapons;

public class Equipment {

    public static final String BLACK = "\033[1;30m";

    int armor;
    int weapon;
    int potion;

    public Equipment(int armor, int weapon) {
        this.armor = armor;
        this.weapon = weapon;
    }

    public String toString() {
        return BLACK + "Броня: " + armor +
                BLACK + "; Оружие: "+ weapon +
                BLACK + ";";
    }

    public int getWeapon(){
        return weapon;
    }
}
