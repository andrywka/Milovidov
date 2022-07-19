package com.startjava.lesson_2_3_4.array;


import java.util.Arrays;

public class ArrayTheme {
    static int[] intArr = new int[1];
    private static String string;

    static void printArray(int[] intArr) {
        for (int number : intArr) {
            System.out.print(number + " ");
        }
    }

    static void printArrayS(String[] string) {
        for (String line : string) {
            System.out.print(line + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        printArray(intArr);
        int len = intArr.length;
        System.out.println("\n");
        int[] numbers1 = new int[len];
        for (int i = 0; i < len; i++) {
            numbers1[i] = intArr[len - 1 - i];
            System.out.print(numbers1[i] + " ");
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
            String answer = intArr[i] < len - 2 ? " * " : " = " + prod + "\n";
            System.out.print(intArr[i] + answer);

        }
        System.out.println("\nИндекс 0 соответсвует числу " + intArr[0]);
        System.out.println("Индекс 9 соответсвует числу " + intArr[9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (double number : doubleArr) {
            System.out.println(number + " ");
        }
//        double[] newnumbers3 = Arrays.copyOf(doubleArr, len);
//        int len1 = newnumbers3.length;
        double sample = doubleArr[7];
        System.out.println("\nЭталонная ячейка с индексом 7: " + sample);
        int result = 0;
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < len; i++) {
            result += doubleArr[i] >= sample ? 1 : 0;
            doubleArr[i] = doubleArr[i] >= sample ? 0 : doubleArr[i];
            System.out.println(doubleArr[i]);
        }
        System.out.println("\nКоличество измененных ячеек: " + result);

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
        int newnumber;
        for (int i = 0; i < len; i++) {
            do {
                unic = true;
                newnumber = (int) (Math.random() * 40 + 1) + 60;
                for (int k = 0; k < len; k++) {
                    if (newnumber == intArr[k]) {
                        unic = false;
                        break;
                    }
                }
            } while (!unic);
            intArr[i] = newnumber;
        }
        printArray(intArr);

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = stringArr.length;
        int cells = 0;
        for (int i = 0; i < len; i++) {
            cells += stringArr[i].isBlank() ? 1 : 0;
        }
        String[] newStringArr = Arrays.copyOf(stringArr, cells);
        int k=0;
        for (int i = 0; i < len; i++) {
            if (!stringArr[i].isBlank()){
                newStringArr[k] = stringArr[i];
                k++;
            }
        }
        System.out.println("Исходный массив:");
        printArrayS(stringArr);
        System.out.println("\nНовый массив:");
        printArrayS(newStringArr);

//        заполните второй массив строками из первого, используя метод System.arraycopy. При этом пустые строки в него включать не нужно
        //char[] newChars = Arrays.copyOf(chars,)
//        его длина должна соответствовать количеству непустых строк из первого массива
//        копируйте не по одной строке за раз, а сразу все подряд идущие непустые строки
//        сортировку использовать нельзя
//        отобразите оба массива

    }
}