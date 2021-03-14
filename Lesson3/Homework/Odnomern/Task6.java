package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Создайте массив из 4 случайных целых чисел из отрезка [0;10]
//        выведите его на экран в строку.
//        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

        // Вводим размер массива (можно не 4)
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
            arrayInt[i] = (int) (Math.random() * 11);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Подразумеваем, что массив является строго возрастающей последовательностью
        boolean strogoVozrastaet = true;

        // Проверяем так ли это
        for (int i = 0; i < arrayInt.length - 1; i++) {
            // Если текущий элемент больше либо равен следующему, то массив не является строго возрастающей последовательностью
            if (arrayInt[i] >= arrayInt[i + 1]) {
                strogoVozrastaet = false;
                break;
            }
        }

        // Выводим соответствующее сообщение
        if (strogoVozrastaet) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}
