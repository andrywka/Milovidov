package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение");
            String expression = scan.nextLine();
            try {
                System.out.println(expression + " = " + Calculator.calculate(expression));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]");
                reply = scan.next();
            } while (!"yes".equals(reply) && !"no".equals(reply));
        } while (reply.equals("yes"));
    }
}