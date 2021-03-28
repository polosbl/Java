package Lesson6.Homework.human.jackets;

public class PumaJacket implements IJacket {

    public PumaJacket () {
    }

    @Override
    public void putOn() {
        System.out.println("Надета куртка Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Puma");
    }
}
