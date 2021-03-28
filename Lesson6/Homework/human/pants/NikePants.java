package Lesson6.Homework.human.pants;

public class NikePants implements IPants {

    public NikePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Nike");
    }
}
