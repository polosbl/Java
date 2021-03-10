package Lesson2.Homework;

public class Task4 {
    public static void main(String[] args) {
//        Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

        int a = 7;
        int b = 8;
        int result = 0;

        for (int i = 1; i <= b; i++) {
            result += a;
        }
        System.out.println("A * B = " + result);
    }
}
