package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop2 {
    public static void main(String[] args) {
//        Найти среднее арифметическое элементов с нечетными номерами.
//        Значения [0,20]

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
            arrayInt[i] = (int) (Math.random() * 21);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Считаем среднее арифметическое элементов с нечетными номерами
        int sum = 0;
        int i = 0;
        int count = 0;
        while (i < arrayInt.length) {
            if (i % 2 == 1) {
                sum += arrayInt[i];
                count++;
            }
            i++;
        }
        double average = (double) sum / count;
        System.out.println("Среднее арифметическое элементов с нечетными номерами: " + average);
    }
}
