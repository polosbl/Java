package Lesson3.Classwork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Попросите пользователя ввести с клавиатуры размер массива.
//        Если введено неположительное число - попросите ввести ещё раз.
//        После этого сгенерируйте массив заданного размера из чисел от -20 до 20 включительно и выведите его на экран через пробел.

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
    }
}
