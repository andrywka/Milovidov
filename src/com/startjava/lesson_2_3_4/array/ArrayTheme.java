package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        for (int number : intArr) {
            System.out.print(number + " ");
        }
        int len1 = intArr.length;
        System.out.println("\n");
        int[] numbers1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            numbers1[i] = intArr[len1 - 1 - i];
            System.out.print(numbers1[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numbers2 = new int[10];
        int len2 = numbers2.length;
        for (int i = 0; i < len2; i++) {
            numbers2[i] = i;
        }
        int sum = 1;
        for (int i = 1; i < len2 - 1; i++) {
            sum = sum * numbers2[i];
            String answer = numbers2[i] < len2 - 2 ? (String.valueOf(numbers2[i]) + " * ") :
                    (String.valueOf(numbers2[i]) + " = " + sum + "\n");
            System.out.print(answer);

        }
        for (int i = 0; i < len2; i++) {
            String tail = numbers2[i] == numbers2[0] || numbers2[i] == numbers2[len2 - 1] ? "\nИндекс " + i +
                    " соответствует числу " + String.valueOf(numbers2[i]) + " " : "";
            System.out.print(tail);
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] numbers3 = new double[15];
        int len3 = numbers3.length;
        for (int i = 0; i < len3; i++) {
            numbers3[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (double number : numbers3) {
            System.out.println(number + " ");
        }
        double[] newnumbers3 = Arrays.copyOf(numbers3, len3);
        int len33 = newnumbers3.length;
        double sample = newnumbers3[7];
        System.out.println("\n" + "Эталонная ячейка с индексом 7: " + sample);
        int result = 0;
        System.out.println("\n" + "Измененный массив:");
        for (int i = 0; i < len33; i++) {
            result += newnumbers3[i] >= sample ? 1 : 0;
            newnumbers3[i] = newnumbers3[i] >= sample ? 0 : newnumbers3[i];
            System.out.println(newnumbers3[i]);
        }
        System.out.println("\n" + "Количество измененных ячеек: " + result);

        System.out.println("\n" + "4. Вывод элементов массива лесенкой в обратном порядке");
        char[] chars = new char[26];
        int len4 = chars.length;
        int j = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            chars[j++] = ch;
        }
        String str = "";
        for (j = len4 - 1; j >= 0; j--) {
            str += chars[j];
            System.out.println(str);
        }

        System.out.println("\n" + "5. Генерация уникальных чисел");
        int[] numbers5 = new int[30];
        int len5 = numbers5.length;
        boolean unic;
        int newnumber;
        for (int i = 0; i < len5; i++) {
            do {
                unic = true;
                newnumber = (int) (Math.random() * 40 + 1) + 60;
                for (int k = 0; k < len5; k++) {
                    if (newnumber == numbers5[k]) {
                        unic = false;
                        break;
                    }
                }
            } while (!unic);
            numbers5[i] = newnumber;
        }
        for (int number : numbers5) {
            System.out.print(number + " ");
        }
    }
}