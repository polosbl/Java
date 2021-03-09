package Lesson2.Homework;

public class Task4 {
    public static void main(String[] args) {
//        Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

        int A = 7;
        int B = 8;
        int res = 0;

        for (int i = 1; i <= B; i++) {
            res += A;
        }
        System.out.println(res);
    }
}
