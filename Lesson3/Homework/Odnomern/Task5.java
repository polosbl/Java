package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива
//        сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

        // Вводим размер массива (можно не 5)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        while (length <= 0) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            length = scanner.nextInt();
        }

        // Генерируем массив 1 нужного размера и выводим на экран
        System.out.println("Массив 1:");
        int[] arrayInt1 = new int[length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayInt1[i] = (int) (Math.random() * 16);
            System.out.print(arrayInt1[i] + " ");
        }
        System.out.println("\n");

        // Генерируем массив 2 нужного размера и выводим на экран
        System.out.println("Массив 2:");
        int[] arrayInt2 = new int[length];
        for (int i = 0; i < arrayInt2.length; i++) {
            arrayInt2[i] = (int) (Math.random() * 16);
            System.out.print(arrayInt2[i] + " ");
        }
        System.out.println("\n");

        // Считаем среднее арифметическое для массива 1
        int sum1 = 0;
        for (int i = 0; i < arrayInt1.length; i++) {
            sum1 += arrayInt1[i];
        }
        double average1 = (double) sum1 / arrayInt1.length;
        System.out.println("Среднее арифметическое для массива 1: " + average1);

        // Считаем среднее арифметическое для массива 2
        int sum2 = 0;
        for (int i = 0; i < arrayInt2.length; i++) {
            sum2 += arrayInt2[i];
        }
        double average2 = (double) sum2 / arrayInt2.length;
        System.out.println("Среднее арифметическое для массива 2: " + average2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое у массива 1 больше, чем у массива 2");
        } else if (average2 > average1) {
            System.out.println("Среднее арифметическое у массива 2 больше, чем у массива 1");
        } else {
            System.out.println("Средние арифметические равны");
        }
    }
}
