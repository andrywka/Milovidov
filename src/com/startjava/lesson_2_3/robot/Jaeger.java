package com.startjava.lesson_2.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strenght;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, float height, float weight, int strenght, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strenght = strenght;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("moving");
    }

    public void run() {
        System.out.println("running");
    }

    @Override
    public String toString() {
        return String.format("Модель: %s \nПоколение: %s \nВысота: %f \nВес: %f \nСила: %d \nБроня: %d",
            modelName, mark, height, weight, strenght, armor);
    }
}