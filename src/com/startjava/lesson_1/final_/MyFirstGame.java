package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число от 0 до 100, попробуй его угадать");
        Scanner scan = new Scanner(System.in);
        int playerNumber;
        do {
            playerNumber = scan.nextInt();
            if (playerNumber > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerNumber < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            System.out.print("\n");
        } while (playerNumber != targetNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}