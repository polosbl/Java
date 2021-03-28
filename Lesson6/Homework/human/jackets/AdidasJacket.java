package Lesson6.Homework.human.jackets;

public class AdidasJacket implements IJacket {

    public AdidasJacket () {
    }

    @Override
    public void putOn() {
        System.out.println("Надета куртка Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Adidas");
    }
}
