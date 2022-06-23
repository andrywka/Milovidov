package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply = "yes";
        do {
            Scanner scan = new Scanner(System.in);
            Calculator resOne = new Calculator();
            System.out.println("Введите первое число");
            resOne.setFirstNum(scan.nextInt());
            System.out.println("Введите знак действия");
            resOne.setMathSign(scan.next().charAt(0));
            System.out.println("Введите второе число");
            resOne.setSecondNum(scan.nextInt());
            System.out.print(resOne.getFirstNum() + " " + resOne.getMathSign() + " " + resOne.getSecondNum() + " = ");
            resOne.calculate();
            reply = scan.nextLine();
            while (!"yes".equals(reply) && !"no".equals(reply)) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                reply = scan.nextLine();
            }
        } while (reply.equals("yes"));
    }
}