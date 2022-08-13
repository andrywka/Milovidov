package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply = "yes";
        do {
            Scanner scan = new Scanner(System.in);
            String expression;
            do {
                System.out.println("Введите математическое выражение");
                expression = scan.nextLine();
                Calculator.calculate(expression);
            } while (!Calculator.marker);
            System.out.println(expression + " = " + Calculator.calculate(expression));
            reply = "";
            while (!"yes".equals(reply) && !"no".equals(reply)) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                reply = scan.nextLine();
            }
        } while (reply.equals("yes"));
    }
}