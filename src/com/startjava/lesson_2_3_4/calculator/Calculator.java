package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    protected int result;

    protected String fullResult;

    protected String partsExpression;

    private String[] expressions;

    public void calculate() {
        Scanner scan = new Scanner(System.in);
        partsExpression = scan.nextLine();
        String[] expressions = partsExpression.split(" ", 3);
        int a = Integer.parseInt(expressions[0]);
        int b = Integer.parseInt(expressions[2]);
        switch (expressions[1].charAt(0)) {
            case '+':
                result = addExact(a, b);
                break;
            case '-':
                result = subtractExact(a, b);
                break;
            case '*':
                result = multiplyExact(a, b);
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = (int) pow(Double.parseDouble(expressions[0]),Double.parseDouble(expressions[2]));
                break;
            case '%':
                result = floorMod(a, b);
                break;
        }
        fullResult = partsExpression + " = " + result;
    }
}