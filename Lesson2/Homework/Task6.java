package Lesson2.Homework;

public class Task6 {
    public static void main(String[] args) {
//        Напишите программу вывода всех четных чисел от 2 до 100 включительно

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
