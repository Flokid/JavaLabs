package com.HW3.CreationsController;

import com.HW3.GameLogic;

import java.util.concurrent.TimeUnit;

import static com.HW3.Main.*;


public class CreatureController implements Runnable {


    public static final String BLACK = "\033[1;30m";
    public static final String GREEN = "\033[1;32m";

    @Override
    public void run() {
        System.out.println(GREEN + "Начало игры через 3 секунд!" );
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 10; i++){

        }

        for (int i = 0; i < 10; i++) {
            HeroCoordinateX = i;
            HeroCoordinateY = 0;
            for (int j = 0; j < 10; j++) {
                HeroCoordinateY = j;
                showField();
                System.out.println(GREEN + "Состояние игрока: " + hero.toString());
                System.out.println(GREEN + "Координаты игрока: " +
                        BLACK + HeroCoordinateX + ":" + HeroCoordinateY );

                if (gameField[HeroCoordinateX][HeroCoordinateY] != '*'){
                    char buff = GameLogic.startBattle(gameField[HeroCoordinateX][HeroCoordinateY]);
                    gameField[HeroCoordinateX][HeroCoordinateY] =buff;
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        GameLogic.gameOver();
    }
}

