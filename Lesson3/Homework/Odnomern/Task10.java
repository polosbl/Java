package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        */

        // Вводим размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();

        while (n <= 3) {
            System.out.println("Введено некорректное значение. Введите размер массива ещё раз: ");
            n = scanner.nextInt();
        }

        // Генерируем массив 1 нужного размера и выводим на экран
        int[] arrayInt1 = new int[n];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayInt1[i] = (int) (Math.random() * (n + 1));
            System.out.print(arrayInt1[i] + " ");
        }
        System.out.println("\n");

        // Посчитать количество четных элементов массиве 1
        int amountOfEven = 0;

        for (int i = 0; i < arrayInt1.length; i++) {
            if (arrayInt1[i] % 2 == 0 && arrayInt1[i] != 0) {
                amountOfEven++;
            }
        }

        // Если есть четные числа,
        if(amountOfEven > 0) {
            // то создаем массив 2 нужного размера
            int[] arrayInt2 = new int[amountOfEven];

            for (int i = 0,j = 0;i < arrayInt1.length; i++){
                // если i-й элемент первого массива четный, то он становится j-м элементом второго массива
                if (arrayInt1[i] % 2 == 0 && arrayInt1[i] != 0) {
                    arrayInt2[j] = arrayInt1[i];
                    j++;
                }
            }

            // Выводим на экран второй массив
            for (int i = 0; i < arrayInt2.length; i++) {
                System.out.print(arrayInt2[i] + " ");
            }
            System.out.println("\n");
        }
    }
}
