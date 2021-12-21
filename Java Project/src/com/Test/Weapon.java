package com.Test;

public class Weapon {
    public int getLvl() {
        return Lvl;
    }

    public int getCost() {
        return Cost;
    }

    public String getName() {
        return Name;
    }

    public String getOpis() {
        return Opis;
    }

    public int getDmgWeapon() {
        return Dmg;
    }
    private int Lvl;
    private int Dmg;
    private int Cost;
    private String Name;

    public Weapon(String name,int lvl,  int cost,  String opis, int dmg) {
        Lvl = lvl;
        Dmg = dmg;
        Cost = cost;
        Name = name;
        Opis = opis;
    }

    private String Opis;


}
