package com.startjava.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру!");
        System.out.println("\nВведите имя первого игрока");
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());
        String reply = "yes";
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            System.out.println("Компьютер загадал число от 0 до 100, попробуйте его угадать");
            game.start();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]");
                reply = scan.nextLine();
            } while (!"yes".equals(reply) && !"no".equals(reply));
        } while (reply.equals("yes"));
    }
}