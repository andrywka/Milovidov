package com.startjava.com.startjava.lesson_2_3_4.person;

public class Person {
    String name = "Jake";
    String sex = "man";
    float height = 1.77f;
    float weight = 92.3f;
    int age = 25;

    void move() {
        System.out.println("В движении");
    }

    boolean sit() {
        System.out.println("Сидит");
        return true;
    }

    boolean run() {
        System.out.println("Бежит");
        return true;
    }

    void learnJava() {
        System.out.println("Учит Java");
    }
}
