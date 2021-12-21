package com.company;

public class GameLogic{
    public static int DPS(int damage, int speedAttack){
        return damage*speedAttack;
    }

    public static int getDamage(int hp, int damage, int defence){
        return hp- (damage - (damage/100*defence));
    }

}