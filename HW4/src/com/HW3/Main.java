package com.HW3;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



public class Main {


    public static void main(String[] args) {
        ArrayList<Character> Characters = new ArrayList<>();
        int rand = ThreadLocalRandom.current().nextInt(20, 30);
        for (int i = 0; i < rand; i++) {
            Character dynamicCharacter=new Character();
            Characters.add(dynamicCharacter);
        }
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");
        for (Character creaturesInfo : Characters) {
            System.out.println(creaturesInfo.toString() + "");
        }


        System.out.println("Вывод человека с максимальным ХП");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");
        Characters.stream()
                .max(Comparator.comparingInt(Character::getHitPoint))
                .ifPresent(System.out::println);

        System.out.println("\n");

        System.out.println("Вывод человека с минимальным ХП");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");
        Characters.stream()
                .min(Comparator.comparingInt(Character::getHitPoint))
                .ifPresent(System.out::println);

        System.out.println("\n");

        System.out.println("Вывод людей с уроном меньше 100");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");

        Characters.stream()
                .filter(Character -> Character.getDamage() < 100)
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Выборка без учёта людей с уроном меньше 100 ");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");

        Characters.stream()
                .filter(Character -> Character.getDamage() > 100)
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Выборка персонажей  с одинаковой специализации  " +
                "и умножение произвольной характеристики на 2");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");

        List<Character> sortedOfSpecial= Characters.stream()
                .filter(Character -> Character.getSpecialization().equals("Глиномес"))
                .peek(Character -> Character.HitPoint *= 2)
                .toList();
        sortedOfSpecial.forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Персонаж с уроном в 1337 (Не читерил!)");
        System.out.println("Имя       ХП     Защита     Урон     " +
                "МВО     Выносливость     Специализация");

        String s ="133t";
        Optional<Character> liker = Characters.stream().filter(Character -> Character.getDamage() == 1337)
                .peek(Character -> Character.setName(s + Character.getName())).findAny();

        try{
            liker.get();
        }
        catch (NoSuchElementException e){
            //System.out.println(e);
        }
        finally {
            liker.ifPresentOrElse(System.out::println,
                    () -> System.out.println("No 133t"));
        }

        System.out.println("\n");

        System.out.println("Подсчёт для каждой специализации количества персонажей ");

        int gl = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Глиномес"))
                .count();
        int ksy = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Король сан узла"))
                .count();
        int rd = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Раб доты"))
                .count();
        int arc = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Архимаг"))
                .count();
        int gt = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Гибщик труб"))
                .count();
        int m = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Мокрушник"))
                .count();
        int hero = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Герой"))
                .count();
        int trash = (int) Characters.stream()
                .filter(Character ->  Character.getSpecialization().equals("Мусорщик*"))
                .count();

        System.out.println(gl + "\tГлиномесов\n" +
                        ksy + "\tКоролей сан узла\n" +
                rd + "\tРабов доты\n" +
                arc + "\tАрхимагов\n" +
                gt + "\tГибщиков труб\n" +
                m + "\tМокрушников\n" +
                hero + "\tГероев\n" +
                trash + "\tМусорщиков"
        );

    }
}
