package Lesson2.Homework;

public class Task7 {
    public static void main(String[] args) {
//        Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

        int sum = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
