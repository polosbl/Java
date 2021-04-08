package Lesson9.Classwork;

import java.util.function.Function;

public class Divide {
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void submethod(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        System.out.println(a / b);
    }

    public static void method() {
        try {
            submethod(65,0);
        } catch (Exception e) {
            System.out.println("на ноль делить нельзя!");
        }

        try {
            submethod(65,7);
        } catch (Exception e) {
            System.out.println("на ноль делить нельзя!");
        }
    }
}
