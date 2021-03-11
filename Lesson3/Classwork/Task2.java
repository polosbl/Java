package Lesson3.Classwork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Прибавьте 1 ко всем отрицательным элементам массива.

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
            arrayInt[i] = (int) (Math.random() * 41) - 20;
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Прибавляем 1 к отрицательным
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 0) {
                arrayInt[i] += 1;
            }
        }

        // Выводим получившийся массив
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
