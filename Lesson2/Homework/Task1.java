package Lesson2.Homework;

public class Task1 {
    public static void main(String[] args) {
//        Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//        Какой суммарный путь пробежит спортсмен за 7 дней?

        double daily = 10.0;
        double dist = daily;

        for (int i = 1; i <= 7; i++) {
            daily = daily + (daily * 10 / 100);
            dist += daily;
        }
        System.out.println(dist);
    }
}
