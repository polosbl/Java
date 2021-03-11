package Lesson3.Classwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Создайте массив такого же размера, в котором элементы расположены в обратном порядке

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

        int[] newArrayInt = new int[length];
        for (int i = 0; i < newArrayInt.length; i++) {
            newArrayInt[newArrayInt.length - i -1] = arrayInt [i];
        }

        // Выводим получившийся boolean массив
        for (int i = 0; i < newArrayInt.length; i++) {
            System.out.print(newArrayInt[i] + " ");
        }
    }
}
