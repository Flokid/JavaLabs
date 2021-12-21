package com.HW3.Creatures;

import com.HW3.Weapons.Equipment;

import java.util.ArrayList;

public class Creature {

    public static final String BLACK = "\033[1;30m";


    public String name;
    public static int hp;
    public int atk;
    ArrayList<Equipment> equipment = new ArrayList<>();

    public Creature(String name, int hp, int atk, Equipment equipment) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.equipment.add(equipment);
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String toString() {
        return BLACK + "Название существа: "  + name +
                BLACK + "; Здоровье: "  + hp +
                BLACK + "; Атака: " + atk +
                BLACK + "; Экипировка: " + equipment.toString() +
                BLACK + ";";
    }


    public String getName() {
        return name;
    }

    public int getAtk(){
        return atk;
    }

    public static int getHp(){
        return hp;
    }

    public ArrayList<Equipment> getEquipment(){
        return equipment;
    }
}
