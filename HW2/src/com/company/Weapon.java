package com.company;

public class Weapon extends Base{
    public int lvl;
    public int damage;
    public int price;
    public int speedAttack;

    public Weapon(){
        name = "Кулаки";
        damage = 0;
        price = 0;
        lvl = 0;
        speedAttack = 0;
    }
    public Weapon(String n, int d, int p, int l, int spdAttack){
        name = n;
        damage = d;
        price = p;
        lvl = l;
        speedAttack = spdAttack;
    }
}
