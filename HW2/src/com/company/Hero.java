package com.company;

public class Hero extends Creature{
    public int exp;
    public int speedAttack;


    public Hero(String nme, int HP, int dmge, int def, int lvlPers) {
        name = nme;
        hp = HP;
        damage = dmge;
        defence = def;
        lvl = lvlPers;
    }

}
