package Lesson6.Homework.human.jackets;

public class NikeJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Nike");
    }
}
