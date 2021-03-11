package Lesson3.Classwork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Создайте массив boolean такого же размера и заполните его значениями true если число больше 9 и false если не больше
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

        boolean[] arrayBoolean = new boolean[length];
        for (int i = 0; i < arrayBoolean.length; i++) {
            if (arrayInt[i] > 9) {
                arrayBoolean[i] = true;
            } else {
                arrayBoolean[i] = false;
            }
        }

        // Выводим получившийся boolean массив
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(arrayBoolean[i] + " ");
        }
    }
}
