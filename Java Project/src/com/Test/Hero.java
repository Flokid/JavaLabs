package com.Test;


public class Hero extends DefaultStats {
    private int HeroDmg;
    private int Xp;
    Hero(String Name,int Lvl, int Hp,int Def, int APS,int HeroDmg, int Xp){
        super(Name,Lvl, Hp,Def,APS);
        this.HeroDmg=HeroDmg;
        this.Xp=Xp;
    }
    public int GetHeroDmg(){
        return HeroDmg;
    }
    public int GetXp(){
        return Xp;
    }
    public int SetDamage(int HeroWithWeapon){
        return HeroDmg=HeroWithWeapon;
    }
}
