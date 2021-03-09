package Lesson2.Homework;

public class Task5 {
    public static void main(String[] args) {
//        Напишите программу печати таблицы перевода расстояний из дюймов в
//        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

        System.out.println("Дюймы" + "\t" + "Сантиметры");
        for (int in = 1; in <= 20; in++) {
            double cm = in * 2.54;
            System.out.println(in + "\t" + cm);
        }
    }
}
