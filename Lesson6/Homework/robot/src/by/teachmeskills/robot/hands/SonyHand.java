package Lesson6.Homework.robot.src.by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand (int price) {
        this.price = price;
    }

    public SonyHand () {
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята");
    }
}
