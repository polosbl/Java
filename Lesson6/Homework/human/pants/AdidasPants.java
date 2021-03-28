package Lesson6.Homework.human.pants;

public class AdidasPants implements IPants {

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Adidas");
    }
}
