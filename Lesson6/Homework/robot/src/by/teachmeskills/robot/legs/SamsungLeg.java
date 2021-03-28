package Lesson6.Homework.robot.src.by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void step() {
        System.out.println("Шаг Samsung");
    }
}
