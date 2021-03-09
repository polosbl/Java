package Lesson2.Classwork;

public class while2 {
    public static void main(String[] args) {
        // Вычислите сумму всех чисел от 1 до 100
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
