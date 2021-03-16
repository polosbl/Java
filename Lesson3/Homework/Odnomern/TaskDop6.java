package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop6 {
    public static void main(String[] args) {
//        Проверить, различны ли все элементы массива.

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
            arrayInt1[i] = (int) (Math.random() * 11);
            System.out.print(arrayInt1[i] + " ");
        }
        System.out.println("\n");

        OUTER: for (int i = 0; i < arrayInt1.length; i++) {
            int j = i + 1;
            while (j < arrayInt1.length) {
                if (arrayInt1[j] == arrayInt1[i]) {
                    System.out.println("Есть повторяющиеся");
                    break OUTER;
                }
                j++;
            }


//            for (int j = i + 1; j < arrayInt1.length; j++) {
//                if (arrayInt1[j] == arrayInt1[i]) {
//                    System.out.println("Есть повторяющиеся");
//                    break;
//                }
//            }
        }
    }
}
