package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    private int attempt;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Компьютер загадал число от 0 до 100, попробуйте его угадать" +
                "\nУ каждого игрока по 10 попыток");
        int targetNumber = (int)(Math.random() * 100) + 1;
        int playerAnswer = 0;
        Scanner scan = new Scanner(System.in);

        while (player1.getAttempt() != 10 || player2.getAttempt() != 10) {
            System.out.println("\nОчередь" + " " + player1 + "\n");
            playerAnswer = scan.nextInt();
            player1.setNumbers(playerAnswer);
            if (playerAnswer > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerAnswer < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nИгрок " + player1 + " угадал число " + targetNumber +
                        " с " + player1.getAttempt() + " попытки");
                break;
            }
            if (player1.getAttempt() == 10) {
                System.out.println("\nУ " + player1 + " закончились попытки");
            }

            System.out.println("\nОчередь" + " " + player2 + "\n");
            playerAnswer = scan.nextInt();
            player2.setNumbers(playerAnswer);
            if (playerAnswer > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerAnswer < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nИгрок " + player1 + " угадал число " + targetNumber +
                        " с " + player1.getAttempt() + " попытки");
                break;
            }
            if (player2.getAttempt() == 10) {
                System.out.println("\nУ " + player1 + " закончились попытки");
            }
        }
        System.out.println("\nВсе числа, названные игроками:");
        printNumbers(player1);
        printNumbers(player2);
    }
    private void printNumbers(Player player) {
        System.out.println("\n" + player.getName());
        for (int i = 0; i < player.getAttempt(); i++) {
            System.out.print(" " + player.getNumbers()[i]);
        }
    }
}