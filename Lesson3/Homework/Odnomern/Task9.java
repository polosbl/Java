package Lesson3.Homework.Odnomern;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
//        Пользователь должен указать с клавиатуры положительное число,
//        а программа должна создать массив указанного размера из случайных целых чисел из [0;15]
//        и вывести его на экран в строку.
//        После этого программа должна определить и сообщить пользователю о том, сумма какой половины массива больше: левой или правой,
//        либо сообщить, что эти суммы модулей равны.
//        Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

        // Вводим размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();

        // Чтобы можно было разделить массив на две части, его размер должен делиться на 2 без остатка
        while (length <= 0 || length % 2 > 0) {
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

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        // Сумма первой половины массива
        for (int i = 0; i < arrayInt.length / 2; i++) {
            firstHalfSum += arrayInt[i];
        }

        // Сумма второй половины массива
        for (int i = arrayInt.length / 2; i < arrayInt.length; i++) {
            secondHalfSum += arrayInt[i];
        }

        System.out.println("Сумма первой половины массива: " + firstHalfSum);
        System.out.println("Сумма первой половины массива: " + secondHalfSum);

        // Сравниваем суммы
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма чисел в первой половине массива больше, чем во второй половине");
        } else if (firstHalfSum < secondHalfSum) {
            System.out.println("Сумма чисел во второй половине массива больше, чем в первой половине");
        } else {
            System.out.println("Суммы чисел в половинах массива равны");
        }
    }
}
