package Lesson3.Classwork;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
//        Добавьте число 42 после двух элементов массива, а остальные элементы сдвиньте вправо на одну позицию.
//        Последний элемент первоначального массива выбрасывается из массива.

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

        int[] newArray = new int[length];

        for (int i = 0; i < 2; i++) {
            newArray[i] = arrayInt[i];
        }

        for (int i = 2; i < arrayInt.length - 1; i++) {
            newArray[i + 1] = arrayInt[i];
        }
        newArray[2] = 42;

        // Выводим получившийся массив
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
