package Lesson3.Classwork;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        6. Найдите и выведите наибольший элемент массива
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

        int maxInt = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxInt) {
                maxInt = arrayInt[i];
            }
        }
        System.out.println(maxInt);
    }
}
