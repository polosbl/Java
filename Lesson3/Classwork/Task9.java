package Lesson3.Classwork;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
//        Удалите все отрицательные числа из массива,
//        сдвиньте оставшиеся элементы влево, заполняя образовавшиеся пробелы.
//        Образовавшиеся в результате пробелы справа заполните нулями.

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

        for (int i = 0; i < newArray.length - 1; i++) {
            if (arrayInt[i] >= 0) {
                newArray[i] = arrayInt[i];
            } else {
                newArray[i] = arrayInt[i + 1];
            }
        }
        // Выводим получившийся массив
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
