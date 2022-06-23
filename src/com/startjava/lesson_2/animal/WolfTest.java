package com.startjava.lesson_2.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("Самец");
        wolfOne.setName("Акелла");
        wolfOne.setAge(5);
        wolfOne.setColor("Серенький");
        System.out.println("Пол - " + wolfOne.getSex());
        System.out.println("Кличка - " + wolfOne.getName());
        System.out.println("Возраст - " + wolfOne.getAge());
        System.out.println("Окрас - " + wolfOne.getColor());
        System.out.println("\n");
        System.out.println("Если " + wolfOne.getName() + " не спит, то скорее всего, он:");
        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.move();
    }
}