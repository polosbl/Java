package Lesson6.Homework.human.shoes;

public class PumaShoes implements IShoes {

    public PumaShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надета обувь Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята обувь Puma");
    }
}
