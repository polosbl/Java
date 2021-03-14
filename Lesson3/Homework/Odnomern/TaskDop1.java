package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop1 {
    public static void main(String[] args) {
//        Найти произведение элементов, кратных 3.
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

        // Считаем среднее арифметическое элементов, кратных 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 3 == 0) {
                sum += arrayInt[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Среднее арифметическое элементов, кратных 3: " + average);

    }
}
