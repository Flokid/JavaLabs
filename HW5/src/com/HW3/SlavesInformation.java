package com.HW3;

import java.util.ArrayList;
import java.util.Scanner;

public class SlavesInformation {

    static ArrayList<Slave> masWorkers;
    static Scanner sc = new Scanner(System.in);

    public SlavesInformation(ArrayList<Slave> masWorkers) {
        SlavesInformation.masWorkers = masWorkers;
    }

    public static void getSlave() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Введите № аба, информацию о котором хотите посмотреть: ");
        int id = sc.nextInt();
        try {
            System.out.println(masWorkers.get(id));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("ОШИБКА! РАБА С ТАКИМ НОМЕРОМ НЕ СУЩЕСТВУЕТ!");
            getSlave();
        }
    }

    public static void getSlaveWithCat() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Введите № раба, имя кота которого хотите узнать: ");
        int id = sc.nextInt();
        try {
            System.out.println(masWorkers.get(id).getCat());
        } catch (NullPointerException exception) {
            System.out.println("ОШИБКА! У ДАННОГО РАБА НЕТ КОТА! ALARM! ALARM! ALARM!");
            getSlaveWithCat();
        }
    }

    public static void getSalary() {
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.print("Введите № Раба, чью зарплату хотите разделить на какое-то число: ");
        int id = sc.nextInt();
        System.out.print("Введите число, на которое Вы бы хотели разделить зарплату Раба № " + id + ": ");
        int numberDivide = sc.nextInt();
        try {
            int newSalary = masWorkers.get(id).getSalary() / numberDivide;
            System.out.println("Новая зарплата раба № " + id + " равна: " + newSalary);
        } catch (ArithmeticException exception) {
            System.out.println("ОШИБКА! ПРОИЗОШЛА АРИФМЕТИЧЕСКАЯ ОШИБКА! ");
            getSalary();
        }
    }

}
