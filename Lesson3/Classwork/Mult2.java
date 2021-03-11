package Lesson3.Classwork;

import java.util.Scanner;

public class Mult2 {
    public static void main(String[] args) {
//        Определите номер столбца и строки, на пересечении которых расположен минимальный элемент.

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
        int min = arrayInt[0][0];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (arrayInt[i][j] < min) {
                    min = arrayInt[i][j];
                }
            }

        }
        System.out.println("Минимальное значение:" + min);
    }
}
