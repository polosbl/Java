package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop5 {
    public static void main(String[] args) {
//        «Сожмите» массив, выбросив из него каждый второй элемент.
//        «Освободившиеся» места массива заполните нулями.

        // Вводим размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        while (length <= 0) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            length = scanner.nextInt();
        }

        // Генерируем массив нужного размера и выводим на экран
        int[] arrayInt1 = new int[length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayInt1[i] = (int) (Math.random() * 21);
            System.out.print(arrayInt1[i] + " ");
        }
        System.out.println("\n");

        int[] arrayInt2 = new int[length];

        for (int i = 0, j = 0; i < arrayInt1.length; i++) {
            if (i % 2 == 0) {
                arrayInt2[j] = arrayInt1[i];
                j++;
            }
        }

        // Выводим на экран второй массив
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.print(arrayInt2[i] + " ");
        }
        System.out.println("\n");

    }
}
