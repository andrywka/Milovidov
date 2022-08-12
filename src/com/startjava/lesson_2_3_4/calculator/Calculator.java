package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

    public int calculate(String expression) {
        String[] partsExpression = expression.split(" ", 3);
        int a = Integer.parseInt(partsExpression[0]);
        int b = Integer.parseInt(partsExpression[2]);
        switch (partsExpression[1].charAt(0)) {
            case '+':
                return addExact(a, b);
            case '-':
                return subtractExact(a, b);
            case '*':
                return multiplyExact(a, b);
            case '/':
                return a / b;
            case '^':
                return (int) pow(Double.parseDouble(partsExpression[0]), Double.parseDouble(partsExpression[2]));
            case '%':
                return floorMod(a, b);
        }
        return 0;
    }
}