package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Bob", "David", "Steve", "Ivan (ZOMBIE)", "Mark", "Anton"};
        String[] weaponNames = {"Bazooka", "Pistol", "AK-47", "AWP", "USP-S", "Stone"};

        ArrayList<Enemy> crowdZombie = new ArrayList<>();
        ArrayList<Weapon> weaponStorage = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            crowdZombie.add(new Enemy(
                    names[random.nextInt(names.length)],
                    random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100)
            ));
        }
        for (int i = 0; i < 5; i++) {
            weaponStorage.add(new Weapon(
                    weaponNames[random.nextInt(weaponNames.length)],
                    random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100)
            ));
        }

        for (Enemy zombie:crowdZombie) {
            zombie.takeWeapon(weaponStorage.get(random.nextInt(weaponStorage.size())));
            zombie.DPS = GameLogic.DPS(zombie.damage, zombie.weapon.speedAttack);
        }

        Hero IVAN = new Hero("Ivan", 100, 2, 4, 15);
        Weapon AK47 = new Weapon("AK-47", 5, 250, 15, 7);
        IVAN.takeWeapon(AK47);
        IVAN.DPS = GameLogic.DPS(IVAN.damage, IVAN.weapon.speedAttack);




        for (Enemy zombie:crowdZombie) {
            System.out.println("----------------------");
            System.out.printf("Enemy %s\nHP -> %d\nDamage -> %d\nDefence -> %d\n", zombie.name, zombie.hp, zombie.damage,
                    zombie.defence);
        }
        for (Weapon weapon:weaponStorage) {
            System.out.println("----------------------");
            System.out.printf("Weapon %s\nDamage -> %d\nPrice -> %d\nLVL Unlock -> %d\n", weapon.name, weapon.damage,
                    weapon.price, weapon.lvl);
        }



        System.out.println("\n\n------------------------\n");

        ElementGun<Fire> fireGun = new ElementGun<>("Fire gun 2000", new Fire());
        ElementGun<Water> waterGun = new ElementGun<>("Water gun Crystal", new Water());
        ElementGun<Air> airGub = new ElementGun<>("Super Air gun", new Air());
        ElementGun<Efir> soilGun = new ElementGun<>("Just Efir gun", new Efir());
        ElementGun<Freeze> freezeGun = new ElementGun<>("Long Freeze gun", new Freeze());
        ElementGun<Ether> etherGun = new ElementGun<>("Big Ether gun", new Ether());
        MagicSlots<?,?,?> magicItems = new MagicSlots<>(fireGun, airGub, etherGun);
        magicItems.fireByMainGun();
        magicItems.fireByExtendGun();
        magicItems.cdAllGuns();



        System.out.print("---------------START GAME----------------------\n");
        System.out.printf("Персонаж %s  HP %d Damage %d Defence %d LVL %d\n\n", IVAN.name, IVAN.hp, IVAN.damage, IVAN.defence, IVAN.lvl);

        for (Enemy zombie:crowdZombie) {
            zombie.hp -= GameLogic.getDamage(zombie.hp, IVAN.DPS, zombie.defence);
            zombie.printInformation();

            IVAN.hp -= GameLogic.getDamage(IVAN.hp, zombie.DPS, IVAN.defence);
            IVAN.printInformation();
            if(IVAN.hp.intValue() <= 0){
                System.out.print("Ваш герой умер\n");
                System.exit(0);
            }
            if (zombie.hp <= 0){
                System.out.printf("%s has been died\n", zombie.name);
            }

        }

    }
}
