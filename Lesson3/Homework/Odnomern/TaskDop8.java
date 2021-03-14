package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop8 {
    public static void main(String[] args) {
//        Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.

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
            arrayInt[i] = (int) (Math.random() * 1001);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");


        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                secondMax = max;
                max = arrayInt[i];
            } else if (arrayInt[i] > secondMax && arrayInt[i] < max){
                secondMax = arrayInt[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Второе по величине значение: " + secondMax);
    }
}
