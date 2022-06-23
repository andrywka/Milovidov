package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public static  void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        System.out.println("Введите знак действия");
        char mathSign = scan.next().charAt(0);
        System.out.println("Введите второе число");
        int secondNum = scan.nextInt();
        int result = 0;
        if (mathSign == '+') {
            result = firstNum + secondNum;
        } else if (mathSign == '-') {
            result = firstNum - secondNum;
        } else if (mathSign == '*') {
            result = firstNum * secondNum;
        } else if (mathSign == '/') {
            result = firstNum / secondNum;
        } else if (mathSign == '^') {
            result = 1;
            for (int i = secondNum; i >= 1; i--) {
                result *= firstNum;
            }
        } else if (mathSign == '%') {
            result = firstNum % secondNum;
        }
        System.out.println(firstNum + " " + mathSign + " " + secondNum + " = " + result);
    }
}