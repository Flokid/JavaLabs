package com.HW3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Slave> masSlaves = new ArrayList<>(3);
    static SlavesInformation slavesInfo = new SlavesInformation(masSlaves);

    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Введите рабов, которые вам служат: ");
        createSlaves();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Штат рабов: ");
        showSlaves();

        SlavesInformation.getSlave();
        SlavesInformation.getSlaveWithCat();
        SlavesInformation.getSalary();

    }

    public static void createSlaves() {
        for (int i = 0; i < 5; i++) {
            String firstName = AddSlave.getFirstName(i);
            String lastName = AddSlave.getLastName(i);
            int age = AddSlave.getAge(i);
            int salary = AddSlave.getSalary(i);
            int yearsOfWorkBySlave = AddSlave.getYearsOfWorkBySlave(i);
            String cat = AddSlave.getCat(i);

            Slave new_slaver = new Slave(i, firstName, lastName, age, salary, yearsOfWorkBySlave, cat);
            masSlaves.add(new_slaver);
        }
    }

    public static void showSlaves() {
        for (Slave w : masSlaves) {
            System.out.println(w.toString());
        }
    }
}
