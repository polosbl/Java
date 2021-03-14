package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
//        Создайте два массива из 10 целых случайных чисел из отрезка [0;9]
//        и третий массив из 10 действительных чисел.
//        Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
//        к элементу из второго массива с i-ым индексом.
//        Вывести все три массива на экран (каждый на отдельной строке),
//        затем вывести количество целых элементов в третьем массиве.

        // Вводим размер массива (можно не 10)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        while (length <= 0) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            length = scanner.nextInt();
        }

        // Генерируем массив 1 нужного размера и выводим на экран
        System.out.println("Массив 1:");
        int[] arrayInt1 = new int[length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayInt1[i] = (int) (Math.random() * 11);
            System.out.print(arrayInt1[i] + " ");
        }
        System.out.println("\n");

        // Генерируем массив 2 нужного размера и выводим на экран
        System.out.println("Массив 2:");
        int[] arrayInt2 = new int[length];
        for (int i = 0; i < arrayInt2.length; i++) {
            arrayInt2[i] = (int) (Math.random() * 11);
            System.out.print(arrayInt2[i] + " ");
        }
        System.out.println("\n");

        // Создаем третий массив действительных чисел
        double[] arrayDouble = new double[length];

        // Заполняем массив 3 действительными числами
        System.out.println("Массив 3:");
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = (double) arrayInt1[i] / arrayInt2[i];
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println("\n");

        // Считаем количество целых элементов
        int amountOfInt = 0;

        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] % 1 == 0) {
                amountOfInt++;
            }
        }
        System.out.println("Количество целых чисел в третьем массиве: " + amountOfInt);
    }
}
