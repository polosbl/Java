package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class TaskDop7 {
    public static void main(String[] args) {
//        Подсчитать, сколько раз встречается элемент с заданным значением.

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

        // Вводим число С
        System.out.println("Введите целое число от 0 до 20: ");
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == number) {
                count++;
            }
        }
        System.out.println("Введенное число встречается " + count + " раз(а)");
    }
}
