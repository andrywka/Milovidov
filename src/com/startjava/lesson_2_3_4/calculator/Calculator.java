package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

    public static int calculate(String expression) {
        int a = 0;
        int b = 0;
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length == 3) {
            try {
                a = Integer.parseInt(partsExpression[0]);
                b = Integer.parseInt(partsExpression[2]);
            } catch (IllegalArgumentException e) {
                System.out.println("Введено некорректное число. Используйте целые положительные числа");
            }
        } else {
            throw new NumberFormatException("Введено некорректное выражение");
        }
        if (a > 0 && b > 0) {
            return switch (partsExpression[1].charAt(0)) {
                case '+':
                    yield addExact(a, b);
                case '-':
                    yield subtractExact(a, b);
                case '*':
                    yield multiplyExact(a, b);
                case '/':
                    yield a / b;
                case '^':
                    yield(int) pow(Double.parseDouble(partsExpression[0]), Double.parseDouble(partsExpression[2]));
                case '%':
                    yield floorMod(a, b);
                default:
                    throw new IllegalArgumentException("Введен некорректный знак");
            };
        } else {
            throw new IllegalArgumentException("Используйте для вычислений целые положительные числа");
        }
    }
}