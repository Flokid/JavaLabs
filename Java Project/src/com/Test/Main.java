package com.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Hero one=new Hero("DeadInside",10,100,5,2,2,0);
        String[] Creature = new String[]{"Alfa","Beta","Gamma","Otta","Qutro","2Pac","69","Nine","Bob","Lu kan"};
        String[] WeaponN = new String[]{"Dagger","Blade","Staff","long-Blade","Charm","Bayonet","Bat","Club","Axe","Pickaxe"};
        ArrayList<Creatures> enemyArrayList = new ArrayList<>();
        ArrayList<Weapon> weaponArrayList = new ArrayList<>();
        System.out.println("Противники:");
        for(int i=0;i<Creature.length;i++)
        {
            double rand = 0+ Math.random()* Creature.length;
            String name = Creature[(int)rand];
            double Hp = 50+ Math.random()* 90;
            double Dmg = 1+ Math.random()* 5;
            double Def = 1+ Math.random()* 5;
            double Lvl=1+ Math.random()* 5;
            double Aps=1+ Math.random()* 3;
            Creatures DynamicCreature = new Creatures(name,(int)Lvl,(int)Hp,
                    (int)Def,(int)Aps,(int)Dmg);
            enemyArrayList.add(DynamicCreature);
        }
        for (Creatures item:
                enemyArrayList) {
            System.out.println("Имя:" + item.GetName() + " " +"Уровень:" + item.GetLvl() + " " + "Здоровье:" + item.GetHp() +
                         " " +  "Защита:" + item.GetDef() + " " + "Ударов в секунду:" + item.  GetAPS() + " " +"Урон:" + item.GetDmgCreature() + " " );
        }
        System.out.println();
        System.out.println("Снаряжние:");
        for(int i=0;i<WeaponN.length;i++)
        {
            double rand = 0+ Math.random()* WeaponN.length;
            String name = WeaponN[(int)rand];
            double Dmg = 3+ Math.random()* 5;
            double Cost = 50+ Math.random()* 90;
            double Lv = 1+ Math.random()* 5;
            String opis="Oh Shit ";
            Weapon DynamicWeapon = new Weapon(name,(int)Lv,(int)Cost,opis,(int)Dmg);
            weaponArrayList.add(DynamicWeapon);
        }
        for (Weapon item:
                weaponArrayList) {
            System.out.println("Название:" + item.getName() + " " + "Урон:" + item.getDmgWeapon() + " "
                    + "Стоимость:" + item.getCost() + " " + "Требуемый уровень для экипирования:" + item.getLvl());
        }
        Weapon WeaponForHero =weaponArrayList.get((int)(0+ Math.random()* 10));
        GameLogic Versus=new GameLogic();
        int DamageHeroWithWeapon=Versus.EquipHero(one.GetHeroDmg(), WeaponForHero.getDmgWeapon(), one.GetLvl(), WeaponForHero.getLvl());
        one.SetDamage(DamageHeroWithWeapon);
        Weapon WeaponForCreature =weaponArrayList.get((int)(0+ Math.random()* 10));
        Creatures CreatureToFight=enemyArrayList.get((int)(0+ Math.random()* 10));
        int DamageCreatureWithWeapon=Versus.EquipCreatures(CreatureToFight.GetDmgCreature(),WeaponForCreature.getDmgWeapon(),CreatureToFight.GetLvl(),WeaponForCreature.getLvl());
        CreatureToFight.SetDamage(DamageCreatureWithWeapon);
        int DpsHero=Versus.HeroDPS(one.GetAPS(), one.GetHeroDmg());
        int DpsCreature=Versus.CreatureDPS(CreatureToFight.GetAPS(),CreatureToFight.GetDmgCreature());
        System.out.println();
        System.out.println("Герой:"+ " " +"Урон:"+DpsHero+ " " +"Защита:"+ one.GetDef() );
        System.out.println("Монстр:"+" "+"Урон:"+DpsCreature + " " + "Защита:"+ CreatureToFight.GetDef());
        try {
            Versus.PvP(DpsHero,one.GetHp(), one.GetDef(),DpsCreature,CreatureToFight.GetHp(),CreatureToFight.GetDef());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
