package com.startjava.lesson_2_3_4.guess;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void setNumbers(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
    @Override
    public String toString() {
        return String.format(name);
    }
}