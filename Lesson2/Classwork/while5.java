package Lesson2.Classwork;

public class while5 {
    public static void main(String[] args) {
        // Выведите на экран последовательность всех чисел Фибоначчи, которые меньше 100:
        // 0 1 1 2 3 5 8 13 21 34 55 89 (начинается с 0, 1 и каждое последующее - сумма двух предыдущих)

        int pred = 0;
        int i = 1;
        int sled = 0;

        do {
            System.out.print(sled + "\t");
            sled = pred + i;
            i = pred;
            pred = sled;
        } while (sled < 100);

        while (i < 100) {
            sled = pred + i;
            System.out.print(i + "\t");
            pred = i;
            i = sled;
        }
    }
}
