package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private String expression;

    private String[] expressions;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void calculate() {
        String[] expressions = expression.split(" ", 3);
        int result = 1;
        switch (expressions[1].charAt(0)) {
            case '+':
                result = addExact(Integer.parseInt(expressions[0]),Integer.parseInt(expressions[2]));
                break;
            case '-':
                result = subtractExact(Integer.parseInt(expressions[0]), Integer.parseInt(expressions[2]));
                break;
            case '*':
                result = multiplyExact(Integer.parseInt(expressions[0]), Integer.parseInt(expressions[2]));
                break;
            case '/':
                result = Integer.parseInt(expressions[0]) / Integer.parseInt(expressions[2]);
                break;
            case '^':
                result = (int) Math.pow(Double.parseDouble(expressions[0]),Double.parseDouble(expressions[2]));
                break;
            case '%':
                result = floorMod(Integer.parseInt(expressions[0]), Integer.parseInt(expressions[2]));
                break;
        }
        System.out.println(result);
    }
}