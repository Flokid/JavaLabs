package com.company;

public class Creature extends Base{
    public Integer hp;
    public int damage;
    public int defence;
    public int lvl;
    public Weapon weapon;
    public int DPS;

    public void takeWeapon(Weapon wpn){
        if (lvl >= wpn.lvl) {
            weapon = wpn;
            damage += weapon.damage;
        }
        else weapon = new Weapon();

    }

    public void printInformation(){

        System.out.printf("---»»»   %s   «««---\nHP: %d\nDamage: %d\n Defence: %d\n LVL: %d\n⁕⁕⁕ Weapon: %s ⁕⁕⁕\n\n",
                name, hp, damage, defence, lvl, weapon.name);
    }
}
