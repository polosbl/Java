package Lesson2.Homework;

public class Task2 {
    public static void main(String[] args) {
//        Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

        int klet = 1;

        for (int i = 3; i <= 24; i++) {
            if (i % 3 == 0){
                klet *= 2;
            }
        }
        System.out.println(klet);
    }
}
