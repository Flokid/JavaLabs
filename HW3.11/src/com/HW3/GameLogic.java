package com.HW3;

import com.HW3.Creatures.Creature;
import com.HW3.Weapons.Equipment;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static com.HW3.Main.creatures;
import static com.HW3.Main.hero;

public class GameLogic {

    public static final String BLACK = "\033[1;30m";
    public static final String GREEN = "\033[1;32m";
    public static final String RED = "\033[1;31m";

    public static char startBattle(char creature) {
        System.out.println(RED + "Идет Битва!");
        int idOfCreatures;
        switch (creature) {
            case 'А' -> idOfCreatures = 0;
            case 'Б' -> idOfCreatures = 1;
            case 'В' -> idOfCreatures = 2;
            case 'Г' -> idOfCreatures = 3;
            case 'Д' -> idOfCreatures = 4;
            case 'Е' -> idOfCreatures = 5;
            case 'Ж' -> idOfCreatures = 6;
            case 'З' -> idOfCreatures = 7;
            case 'И' -> idOfCreatures = 8;
            case 'К' -> idOfCreatures = 9;
            default -> idOfCreatures = -1;
        }
        int heroDPS = getHeroDPS();
        int creatureDPS = getCreatureDPS(idOfCreatures);
        int heroHP = getHeroHP();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        battle(heroDPS, creatureDPS, heroHP, idOfCreatures);
        if(Creature.getHp()<=0){
            return '*';
        }
        else{
            return creature;
        }
    }

    public static void battle(int heroDPS, int creatureDPS, int heroHP, int idOfCreatures) {
        if (heroDPS > creatureDPS) {
            System.out.println(GREEN + "Победа!");
            System.out.println(GREEN + "Игрок" + " победил существо " +
                    BLACK + "\"" + creatures.get(idOfCreatures).getName() + "\"" + "!");
            int newHeroHP = heroHP - creatureDPS;
            System.out.println(RED + "Потерянно " + (heroHP - newHeroHP) + " HP!");
            hero.setHp(newHeroHP);
        } else {
            System.out.println(RED + "Проигрыш!");
            System.out.println(RED + "Игрока убило существо "+ BLACK + "\"" +
                    creatures.get(idOfCreatures).getName() + "\"" + ".");
            System.exit(0);
        }
    }

    public static void gameOver(){
        System.out.println(GREEN + "ИГРА ОКОНЧЕННА!");
    }

    public static int getHeroHP(){
        return hero.getHp();
    }

    public static int getHeroDPS() {
        int atk = hero.getAtk();
        ArrayList<Equipment> equipment = hero.getEquipment();
        int weapon = equipment.get(0).getWeapon();

        return weapon * atk;
    }


    public static int getCreatureDPS(int i) {
        int atk = creatures.get(i).getAtk();
        ArrayList<Equipment> equipment = creatures.get(i).getEquipment();
        int weapon = equipment.get(0).getWeapon();

        return weapon * atk;
    }

}
