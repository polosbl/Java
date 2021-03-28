package Lesson6.Homework.human.shoes;

public class AdidasShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Надета обувь Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята обувь Adidas");
    }
}
