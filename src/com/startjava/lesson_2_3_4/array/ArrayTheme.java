package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("До модификации:");
        printArray(intArr);
        System.out.println("\nПосле модификации:");
        int len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = intArr[len - 1 - i];
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int prod = 1;
        for (int i = 2; i < len - 1; i++) {
            prod *= intArr[i];
            System.out.print(intArr[i] + (intArr[i] < len - 2 ? " * " : " = " + prod));

        }
        System.out.println("\n\nИндекс 0 соответствует числу " + intArr[0]);
        System.out.println("Индекс 9 соответствует числу " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (double number : doubleArr) {
            System.out.println(number + " ");
        }
        double sample = doubleArr[(len / 2)];
        System.out.println("\nЭталонная ячейка с индексом " + (len / 2) + ": "  + sample);
        int count = 0;
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] >= sample) {
                doubleArr[i] = 0.0;
            } else {
                count++;
            }
            System.out.println(doubleArr[i]);
        }
        System.out.println("\nКоличество измененных ячеек: " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] chars = new char[26];
        len = chars.length;
        int j = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            chars[j++] = ch;
        }
        String line = "";
        for (j = len - 1; j >= 0; j--) {
            System.out.println(line += chars[j]);
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        boolean unic;
        int newNumber;
        for (int i = 0; i < len; i++) {
            do {
                unic = true;
                newNumber = (int) (Math.random() * 40 + 1) + 60;
                for (int k = 0; k < len; k++) {
                    if (newNumber == intArr[k]) {
                        unic = false;
                        break;
                    }
                }
            } while (!unic);
            intArr[i] = newNumber;
        }
        Arrays.sort(intArr);
        printArray(intArr);

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = stringArr.length;
        int newLen = 0;
        for (int i = 0; i < len; i++) {
            if(stringArr[i].isBlank()){
                newLen++;
            }
        }
        String[] newStringArr = new String[newLen];
        int k=0;
        for (int i = 0; i < len; i++) {
            if (!stringArr[i].isBlank()) {
                newStringArr[k] = stringArr[i];
                k++;
            }
        }
        System.out.println("Исходный массив:");
        printArray(stringArr);
        System.out.println("\nНовый массив:");
        printArray(newStringArr);
    }

    private static void printArray(int[] intArr) {
        for (int number : intArr) {
            System.out.print(number + " ");
        }
    }

    private static void printArray(String[] string) {
        for (String line : string) {
            System.out.print(line + " ");
        }
    }
}