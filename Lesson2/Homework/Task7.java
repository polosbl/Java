package Lesson2.Homework;

public class Task7 {
    public static void main(String[] args) {
//        Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

        int sum = 0;
        int i = 1;

        while (i < 100) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
