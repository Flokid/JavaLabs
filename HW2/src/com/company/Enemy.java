package com.company;

import java.util.ArrayList;

public class Enemy extends Creature{
    public Enemy(String nme, int HP, int dmg, int dfnc){
        name = nme;
        hp = HP;
        damage = dmg;
        defence = dfnc;
    }
}
