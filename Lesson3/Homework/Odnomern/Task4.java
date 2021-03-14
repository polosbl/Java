package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Создайте массив из 20 случайных целых чисел из отрезка [0;20].
//        Выведите массив на экран в строку.
//        Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

        // Вводим размер массива (можно не 20)
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

        // Заменяем числа с нечетными индексами на 0
        int index = 1;
        while (index < arrayInt.length) {
            arrayInt[index] = 0;
            index += 2;
        }

        // Выводим получившийся массив
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
