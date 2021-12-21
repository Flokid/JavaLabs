package com.Test;



public class Creatures extends DefaultStats {
    private int DmgCreature;
    Creatures(String Name,int Lvl, int Hp,int Def, int APS,int DmgCreature){
        super(Name,Lvl,Hp,Def,APS);
        this.DmgCreature=DmgCreature;
    }
    public int GetDmgCreature(){
        return DmgCreature;
    }
    public int SetDamage(int CreatureWithWeapon) {
        return DmgCreature = CreatureWithWeapon;
    }
}
