package Lesson6.Homework.robot.src.by.teachmeskills.robot.hands;

import Lesson6.Homework.robot.src.by.teachmeskills.robot.heads.IHead;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand (int price) {
        this.price = price;
    }

    public SamsungHand () {
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднята");
    }
}
