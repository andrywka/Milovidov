package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

    private String  partsExpression;

    public String getPartsExpression() {
        return partsExpression;
    }

    public void setPartsExpression(String partsExpression) {
        this.partsExpression = partsExpression;
    }

    public int calculate() {
        Scanner scan = new Scanner(System.in);
        String[] expressions = partsExpression.split(" ", 3);
        int a = Integer.parseInt(expressions[0]);
        int b = Integer.parseInt(expressions[2]);
        switch (expressions[1].charAt(0)) {
            case '+': 
                return addExact(a, b);
            case '-':
                return subtractExact(a, b);
            case '*':
                return multiplyExact(a, b);
            case '/':
                return a / b;
            case '^':
                return (int) pow(Double.parseDouble(expressions[0]),Double.parseDouble(expressions[2]));
            case '%':
                return floorMod(a, b);
        }
        return 0;
    }
}