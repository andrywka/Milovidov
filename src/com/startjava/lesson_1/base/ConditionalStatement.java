package com.startjava.lesson_1.base;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Введите Ваш возраст");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age > 20) {
            System.out.println("Вы старше 20");
        }
        System.out.println("\n");

        System.out.println("Если Ваш пол - мужской, нажмите '1', если женский - любую клавишу");
        int sex = scan.nextInt();
        if (sex == 1) {
            System.out.println("Здравствуйте, сэр");
        }
        if (sex != 1) {
            System.out.println("Здравствуйте, мисс");
        }
        System.out.println("\n");

        System.out.println("Введите свой рост");
        double height = scan.nextDouble();
        if (height < 1.80) {
            System.out.println("Ваш рост среднестатистический");
        } else {
            System.out.println("Вы высокий");
        }
        System.out.println("\n");

        System.out.println("Введите свое имя на английском языке");
        String name = scan.next();
        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Здравствуйте, Misha");
        } else if (firstLetter == 'I') {
            System.out.println("Добрый день, Irina");
        } else {
            System.out.println("Будем знакомы");
        }
    }
}