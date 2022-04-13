package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(task1());
        task2(task1());
        task3();
    }
    static String task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        return fullName;
    }
    static void task2(String fullName) {;
        System.out.println(fullName.toUpperCase());
    }
    static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'e');
        System.out.println(fullName);
    }
}
