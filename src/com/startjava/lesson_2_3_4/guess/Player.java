package com.startjava.com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format(name);
    }
}