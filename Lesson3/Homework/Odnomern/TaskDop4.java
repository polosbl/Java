package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop4 {
    public static void main(String[] args) {
//        Найти наименьший нечетный элемент.

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

        int minOdd = Integer.MAX_VALUE;

        // Ищем наименьший нечетный элемент
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 1 && arrayInt[i] < minOdd) {
                minOdd = arrayInt[i];
            }
        }
        System.out.println("Наименьший нечетный элемент: " + minOdd);
    }
}
