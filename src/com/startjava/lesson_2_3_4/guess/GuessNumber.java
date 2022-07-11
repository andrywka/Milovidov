package com.startjava.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int playerAnswer = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n" + "Очередь" + " " + player1 + "\n");
            playerAnswer = scan.nextInt();
            if (playerAnswer > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerAnswer < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\n" + "Поздравляем, " + player1 + ", Вы угадали!");
                break;
            }

            System.out.println("\n" + "Очередь" + " " + player2 + "\n");
            playerAnswer = scan.nextInt();
            if (playerAnswer > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerAnswer < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\n" + "Поздравляем, " + player2 + ", Вы угадали!");
                break;
            }
        } while (true);
    }
}