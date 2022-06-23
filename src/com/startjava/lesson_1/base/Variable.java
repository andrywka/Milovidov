package com.startjava.lesson_1.base;

public class Variable {	
    public static void main(String[] args) {
        byte pcNumber = 1;
        short bitness = 64;
        int numberOfDiscs = 5;
        long price = 123654;
        float clockFrequency = 3.30f;
        double sdram = 2.333;
        char os = 'W';
        boolean x = true;
        System.out.println("PC number = " + pcNumber);
        System.out.println("Bitness = " + bitness);
        System.out.println("Numbers of discs = " + numberOfDiscs);
        System.out.println("Price = " + price);
        System.out.println("Clock Frequency = " + clockFrequency);
        System.out.println("SDRAM = " + sdram);
        System.out.println("OS type (W/L) : "+ os);
        System.out.println("Prosto " + x);
    }
}