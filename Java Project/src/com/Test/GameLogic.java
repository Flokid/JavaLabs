package com.Test;

public class GameLogic {
    public int CreatureDPS(int APS,int CreatureDmg){return  APS*CreatureDmg;}
    public int HeroDPS(int APS,int HeroDmg){return  APS*HeroDmg;}
    public int EquipHero(int HeroDmg,int WeaponDmg,int HeroLvl, int  WeaponLvl) {
        if(HeroLvl>=WeaponLvl){
            return HeroDmg+WeaponDmg;
        }
        else{
            return  HeroDmg;
        }
    }
    public int EquipCreatures(int CreatureDmg,int WeaponDmg,int CreatureLvl, int  WeaponLvl) {
        if(CreatureLvl>=WeaponLvl){
            return CreatureDmg+WeaponDmg;
        }
        else{
            return  CreatureDmg;
        }
    }
    public String PvP(int HeroDps,int HeroHp,int HeroDef,int CreatureDps,int CreatureHp,int CreatureDef) throws InterruptedException {
        while((HeroHp!=0)&&(CreatureHp!=0))
        {
            Thread.sleep(500);
            if(HeroDef>CreatureDps) {
                continue;
            }
            else{
                HeroHp=HeroHp+(HeroDef-CreatureDps);
                System.out.println("Hp Hero=: " + HeroHp);
            }
            if(CreatureDef>HeroDps) {
                continue;
            }
            else{
                CreatureHp=CreatureHp+(CreatureDef-HeroDps);
                System.out.println("Hp Creature=: " + CreatureHp);
            }
            if(HeroHp<=0)
            {
                System.out.println("Герой мёртв");
                System.out.println("Монстр победил");
                break;
            }
            if(CreatureHp<=0) {
                System.out.println("Монстр мёртв");
                System.out.println("Герой победил");
                break;
            }
        }
        return "Бой Завершён!";
    }
}
