package Lesson6.Homework.robot.src.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void step() {
        System.out.println("Шаг Sony");
    }
}
