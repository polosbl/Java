package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop3 {
    public static void main(String[] args) {
//        Найти средне арифметическое элементов массива, превосходящих некоторое число С.

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
            arrayInt[i] = (int) (Math.random() * 1_001);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Вводим число С
        System.out.println("Введите число от 0 до 1000: ");
        double number = scanner.nextDouble();

        // Считаем среднее арифметическое элементов, превосходящих число С
        int sum = 0;
        int i = 0;
        int count = 0;
        while (i < arrayInt.length) {
            if (arrayInt[i] > number) {
                sum += arrayInt[i];
                count++;
            }
            i++;
        }
        double average = (double) sum / count;
        System.out.println("Среднее арифметическое элементов, превосходящих число С: " + average);


    }
}
