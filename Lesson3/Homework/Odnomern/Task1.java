package Lesson3.Homework.Odnomern;

public class Task1 {
    public static void main(String[] args) {
//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
//        сначала в строку, отделяя один элемент от другого пробелом
//        затем в столбик (отделяя один элемент от другого началом новой строки)

        // Генерируем массив нужного размера и выводим на экран в одну строку через пробел
        int[] arrayInt = new int[10];
        int number = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            number += 2;
            arrayInt[i] = number;
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n");

        // Выводим на экран в столбик
        number = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            number +=  2;
            arrayInt[i] = number;
            System.out.println(arrayInt[i]);
        }
    }
}
