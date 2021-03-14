package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop9 {
    public static void main(String[] args) {
//        Найти наименьший элемент среди элементов с четными индексами массива

        // Вводим размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        while (length <= 0) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            length = scanner.nextInt();
        }

        // Генерируем массив нужного размера и выводим на экран
        int[] arrayInt = new int[length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 1001);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        if (length <= 2) {
            System.out.println("В массиве нет четных индексов (2 и более)");
        } else {
            int min = Integer.MAX_VALUE;
            int i = 2;
            // Ищем наименьший элемент с четным индексом
            while (i < arrayInt.length) {
                if (arrayInt[i] < min) {
                    min = arrayInt[i];
                }
                i += 2;
            }
            System.out.println("Наименьший элемент с четным индексом массива: " + min);
        }

    }
}
