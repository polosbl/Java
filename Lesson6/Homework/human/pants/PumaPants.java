package Lesson6.Homework.human.pants;

public class PumaPants implements IPants {

    public PumaPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Puma");
    }
}
