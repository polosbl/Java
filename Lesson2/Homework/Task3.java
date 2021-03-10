package Lesson2.Homework;

public class Task3 {
    public static void main(String[] args) {
//        Вычислить: 1+2+4+8+...+256

        int i = 1;
        int sum = 0;

        while (i <= 256) {
            sum += i;
            i *= 2;
        }
        System.out.println(sum);
    }
}
