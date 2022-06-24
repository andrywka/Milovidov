package com.startjava.lesson_2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Romeo Blue");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setHeight(77.72f);
        jaegerOne.setWeight(7.775f);
        jaegerOne.setStrenght(7);
        jaegerOne.setArmor(6);

        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", 85.34f, 2.312f, 7, 4);

        Jaeger jaegerThree = new Jaeger();

        System.out.println(jaegerOne);
        System.out.println();
        System.out.println(jaegerTwo);
        System.out.println();
        System.out.println(jaegerThree);
    }
}