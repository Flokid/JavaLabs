package com.HW3;

import java.util.concurrent.ThreadLocalRandom;

public class Character {


    String[] names = new String[]{
            "Хлебушек", "Дед Инсайд", "Крипочек", "Идиот",
            "Хочу Пицци", "Бумыч", "Токийский **й", "Чо Пацаны Анимэ",
            "ПКудж", "Пошли в КС))", "Папич", "Работяга",
            "Майнкрафт моя жизнь!!!", "Hey bro nice c**k", "Пепячник"
    };

    String[] Special = new String[]{
            "Глиномес", "Король сан узла", "Раб доты", "Архимаг",
            "Гибщик труб", "Мокрушник", "Герой", "Мусорщик*"
    };

    int randNamesOfMas = ThreadLocalRandom.current().nextInt(0, names.length);
    int randSpecialOfMas = ThreadLocalRandom.current().nextInt(0, Special.length);


    public String Name;
    public int HitPoint;
    public int Damage;
    public int Defense;
    public int Chaos;
    public int Stamina;
    public String Specialization;

    public void setName(String name) {
        Name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public String getName() {
        return Name;
    }

    public int getHitPoint() {
        return HitPoint;
    }

    public int getDamage() {
        return Damage;
    }

    public int getDefense() {
        return Defense;
    }

    public int getChaos() {
        return Chaos;
    }

    public int getStamina() {
        return Stamina;
    }

    public Character() {
        this.Name=names[randNamesOfMas];
        this.Specialization=Special[randSpecialOfMas];
        HitPoint =ThreadLocalRandom.current().nextInt(100, 200);
        Damage = ThreadLocalRandom.current().nextInt(1, 1500);
        Defense = ThreadLocalRandom.current().nextInt(1, 500);
        Chaos = ThreadLocalRandom.current().nextInt(100, 2000);
        Stamina = ThreadLocalRandom.current().nextInt(100, 300);
        /*
        if(this.Specialization=="Глиномес"){
            this.Name=names[randNamesOfMas];
            this.Specialization=Special[randSpecialOfMas];
            HitPoint =ThreadLocalRandom.current().nextInt(100, 200);
            Damage = ThreadLocalRandom.current().nextInt(1, 1500);
            Defense = ThreadLocalRandom.current().nextInt(1, 500);
            Chaos = ThreadLocalRandom.current().nextInt(100, 2000);
            Stamina = ThreadLocalRandom.current().nextInt(100, 300);
            CriticalChance = 100;
        }
        */

    }


    @Override
    public String toString() {
        return "".concat(getName())
                .concat("\t")
                .concat("" + getHitPoint())
                .concat("\t\t")
                .concat("" + getDefense())
                .concat("\t\t")
                .concat("" + getDamage())
                .concat("\t\t")
                .concat("" + getChaos())
                .concat("\t\t")
                .concat("" + getStamina())
                .concat("\t\t")
                .concat("" + getSpecialization());


    }



}
