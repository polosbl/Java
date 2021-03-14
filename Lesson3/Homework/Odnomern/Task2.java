package Lesson3.Homework.Odnomern;

public class Task2 {
    public static void main(String[] args) {
//        Создайте массив из всех нечётных чисел от 1 до 99
//        выведите его на экран в строку
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке

        // Генерируем массив нужного размера и выводим на экран
        int[] arrayInt = new int[50];
        int number = 1;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = number;
            number += 2;
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Выводим в обратном порядке
        for (int i = arrayInt.length -1; i >= 0; i--) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
