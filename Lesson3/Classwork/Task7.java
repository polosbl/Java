package Lesson3.Classwork;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Найдите и выведите среднее арифметическое всех элементов массива (сумма элементов, разделенная на их кол-во)

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

        double average = 0.0;
        int sum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        average = (double) sum / arrayInt.length;
        System.out.println(average);
    }
}
