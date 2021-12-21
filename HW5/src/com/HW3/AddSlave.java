package com.HW3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddSlave {

    static Scanner sc = new Scanner(System.in);

    //Ввод и проверка на правильность Имени Работника:
    public static String getFirstName(int number) {
        String firstName = "";
        System.out.print("Дайте имя вашему рабу № " + number + ": ");

        try {
            firstName = sc.next();
        } catch (InputMismatchException exception) {
            System.out.println("ОШИБКА!");
            sc.next();
            getFirstName(number);
        }

        return firstName;
    }

    //Ввод и проверка на правильность Фамилии Работника:
    public static String getLastName(int number) {
        String lastName = "";
        System.out.print("Дайте фамилию вашему рабу № " + number + ": ");

        try {
            lastName = sc.next();
        } catch (InputMismatchException exception) {
            System.out.println("ОШИБКА!");
            sc.next();
            getLastName(number);
        }

        return lastName;
    }

    //Ввод и проверка на правильность Возраста Работника:
    public static Integer getAge(int number) {
        int age = 0;
        System.out.print("Введите возраст раба № " + number + ": ");

        try {
            age = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ОШИБКА!");
            sc.next();
            getAge(number);
        }
        return age;
    }

    //Ввод и проверка на правильность Зарплаты Работника:
    public static Integer getSalary(int number) {
        int salary = 0;
        System.out.print("Какую зарплатурр вы будете платить своему рабу №" + number + "?: ");

        try {
            salary = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ОШИБКА!");
            sc.next();
            getSalary(number);
        }

        return salary;
    }

    //Ввод и проверка на правильность количетсва лет работы в компании Работника:
    public static Integer getYearsOfWorkBySlave(int number) {
        int yearsOfWork = 0;
        System.out.print("Сколько по времени вам служит раб под  №" + number + "?: ");

        try {
            yearsOfWork = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ОШИБКА!");
            sc.next();
            getYearsOfWorkBySlave(number);
        }

        return yearsOfWork;
    }

    public static String getCat(int number) {
        String cat = "";
        int isCat;
        System.out.print("Если у раба № " + number + " есть кот - введите 1, если нет - введите 2: ");
        isCat = sc.nextInt();
        if (isCat == 2) {
            return "Бездушный человек, не имеющий КОТА!";
        } else {
            System.out.print("Введите имя кота: ");
            return sc.next();
        }
    }
}
