package com.HW3;

public class Slave {

    int number;
    String firstName;
    String lastName;
    int age;
    int salary;
    int yearsOfWorkBySlave;
    String cat;

    public Slave(int number, String firstName, String lastName, int age, int salary, int yearsOfWork, String cat) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.yearsOfWorkBySlave = yearsOfWork;
        this.cat = cat;
    }

    public String toString() {
        return "№: " + number + "; ФИО: " + firstName + " " + lastName + "; Возраст: " + age + "; Зарплата: " + salary
                + "; Годы служения: " + yearsOfWorkBySlave + ";" + " Кот: " + cat + ";";
    }

    public String getCat() {
        return cat;
    }

    public int getSalary() {
        return salary;
    }
}
