package Lesson6.Homework.robot.src.by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void step() {
        System.out.println("Шаг Toshiba");
    }
}
