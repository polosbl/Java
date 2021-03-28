package Lesson6.Homework.human.shoes;

public class NikeShoes implements IShoes {

    public NikeShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надета обувь Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята обувь Nike");
    }
}
