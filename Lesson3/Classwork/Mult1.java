package Lesson3.Classwork;

import java.util.Scanner;

public class Mult1 {
    public static void main(String[] args) {
//        Сгенерируйте двумерный массив 5x5, состоящий из целых чисел от -20 до 20 включительно.
//        Выведите его на экран.

        // Вводим размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        while (length <= 0) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            length = scanner.nextInt();
        }
        // Генерируем массив нужного размера и выводим на экран
        int[][] arrayInt = new int[length][length];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int) (Math.random() * 41) - 20;
                System.out.print(arrayInt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
