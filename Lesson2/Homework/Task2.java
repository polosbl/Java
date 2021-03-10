package Lesson2.Homework;

public class Task2 {
    public static void main(String[] args) {
//        Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

        int kletka = 1;
        int i = 3;

        while (i <= 24) {
            kletka *= 2;
            i += 3;
        }
        System.out.println(kletka);
    }
}
