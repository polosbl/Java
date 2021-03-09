package Lesson2.Classwork;

public class For2 {
    public static void main(String[] args) {
        //Вычислите сумму всех чисел от 1 до 100

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
