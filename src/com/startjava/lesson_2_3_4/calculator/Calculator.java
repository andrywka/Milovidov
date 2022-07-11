package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char mathSign;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void calculate() {
        int result = 1;
        switch (mathSign) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '^':
                for (int i = secondNum; i >= 1; i--) {
                    result *= firstNum;
                }
                break;
            case '%':
                result = firstNum % secondNum;
                break;
        }
        System.out.println(result);
    }
}