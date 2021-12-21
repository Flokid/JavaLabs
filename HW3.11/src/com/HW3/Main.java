package com.HW3;

import com.HW3.CreationsController.CreatureController;
import com.HW3.Creatures.Creation;
import com.HW3.Creatures.Creature;

import java.util.ArrayList;

public class Main {

    public static final String GREEN = "\033[1;32m";
    public static final String RED = "\033[1;31m";

    static ArrayList<Creature> creatures = new ArrayList<>();
    public static char[][] gameField = new char[10][10];
    public static Creature hero;
    public static int HeroCoordinateX = 0;
    public static int HeroCoordinateY= 0;
    public static int EnemyCoordinateX = 0;
    public static int EnemyCoordinateY= 0;


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            creatures.add(Creation.createCreatures(i));
        }
        hero = Creation.createHero();
        showHero();
        showCreatures();
        gameField = Creation.createMap(creatures);
        showField();

        CreatureController creatureController = new CreatureController();
        Thread GameThread = new Thread(creatureController);
        GameThread.start();

    }

    public static void showHero() {
        System.out.println(GREEN + "Главный герой: ");
        System.out.println(hero.toString());
    }

    public static void showCreatures() {
        System.out.println(RED + "Существа и их свойства: ");
        for (Creature c : creatures) {
            System.out.println(c.toString());
        }
    }

    public static void showField() {
        char buff =  gameField[HeroCoordinateX][HeroCoordinateY];
        gameField[HeroCoordinateX][HeroCoordinateY] = '@';



        for (char[] chars : gameField) {
            for (char aChar : chars) {
                switch (aChar) {
                    case '@' -> System.out.print(GREEN + aChar + " ");
                    default -> System.out.print(aChar + " ");
                }
            }
            System.out.println(" ");
        }
        gameField[HeroCoordinateX][HeroCoordinateY] = buff;
    }
}
