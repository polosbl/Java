package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Создайте массив из 12 случайных целых чисел из отрезка [0;15].
//        Определите какой элемент является в этом массиве максимальным
//        сообщите индекс его последнего вхождения в массив

        // Вводим размер массива (можно не 12)
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
            arrayInt[i] = (int) (Math.random() * 16);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Задаем начальные значения для максимального числа
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;

        // Проверяем каждый элемент. Если он больше максимального, то перезаписываем значение и индекс
        for (int i = 0; i < arrayInt.length; i++) {
            if (maxNumber < arrayInt[i]) {
                maxIndex = i;
                maxNumber = arrayInt[i];
            }
        }

        // Выводим на экран
        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Его индекс: " + maxIndex);
    }
}
