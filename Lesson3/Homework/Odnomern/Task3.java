package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
//        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

        // Вводим размер массива (можно не 15)
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
            arrayInt[i] = (int) (Math.random() * 100);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Считаем количество четных чисел
        int ammountOfEven = 0;
        for (int i = 0; i <arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0) {
                ammountOfEven += 1;
            }
        }
        System.out.println("Количество четных: " + ammountOfEven);
    }
}
