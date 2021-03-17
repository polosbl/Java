package Lesson4.Homework;

public class Main {
    public static void main(String[] args) {

        Computer comp1 = new Computer();
        comp1.printInformation();

        comp1.turnOn();
        System.out.println(comp1.cyclesLeft + "\n");
        comp1.turnOn();
        System.out.println(comp1.cyclesLeft + "\n");
        comp1.turnOn();
    }
}
