package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    public static boolean marker = true;

    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ", 3);
        try {
            int a = Integer.parseInt(partsExpression[0]);
            int b = Integer.parseInt(partsExpression[2]);
            marker = (a * b) > 0;
            if (!marker) {
                System.out.println("¬ведено некорректное число, используйте дл€ вычислений целые положительные числа");
            }
            switch (partsExpression[1].charAt(0)) {
                case '+' -> {
                    return addExact(a, b);
                }
                case '-' -> {
                    return subtractExact(a, b);
                }
                case '*' -> {
                    return multiplyExact(a, b);
                }
                case '/' -> {
                    return a / b;
                }
                case '^' -> {
                    return (int) pow(Double.parseDouble(partsExpression[0]), Double.parseDouble(partsExpression[2]));
                }
                case '%' -> {
                    return floorMod(a, b);
                }
            }
        } catch (NumberFormatException e) {
            marker = false;
        }
        return 0;
    }
}