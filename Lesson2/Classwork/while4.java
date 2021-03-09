package Lesson2.Classwork;

public class while4 {
    public static void main(String[] args) {
        // Объявите целочисленную переменную m и присвойте ей положительное значение. Выведите на экран это число наоборот:
        // 12345678 => 87654321
        // 12321 => 12321
        // 100 => 001

        int m = 10000;

        while (m > 0) {
            System.out.print(m % 10);
            m = m / 10;
        }
    }
}
