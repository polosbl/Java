package Lesson6.Homework.robot.src.by.teachmeskills.robot;

import Lesson6.Homework.robot.src.by.teachmeskills.robot.hands.SamsungHand;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.hands.SonyHand;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.hands.ToshibaHand;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.heads.SamsungHead;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.heads.SonyHead;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.heads.ToshibaHead;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.legs.SamsungLeg;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.legs.SonyLeg;
import Lesson6.Homework.robot.src.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHand sonyHand = new SonyHand(33);
        SonyHead sonyHead = new SonyHead(58);
        SonyLeg sonyLeg = new SonyLeg(47);

        ToshibaHand toshibaHand = new ToshibaHand(36);
        ToshibaHead toshibaHead = new ToshibaHead(63);
        ToshibaLeg toshibaLeg = new ToshibaLeg(44);

        SamsungHand samsungHand = new SamsungHand(41);
        SamsungHead samsungHead = new SamsungHead(71);
        SamsungLeg samsungLeg = new SamsungLeg(51);

        Robot robot1 = new Robot(sonyHead,toshibaHand,samsungLeg);
        Robot robot2 = new Robot(toshibaHead,samsungHand,sonyLeg);
        Robot robot3 = new Robot(samsungHead,sonyHand,toshibaLeg);

        System.out.println("Цена робота 1: " + robot1.getPrice());
        System.out.println("Цена робота 2: " + robot2.getPrice());
        System.out.println("Цена робота 3: " + robot3.getPrice());

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 1" + "\n");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 2" + "\n");
        } else if (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()) {
            System.out.println("Самый дорогой робот 3" + "\n");
        }

        robot1.action();
        robot2.action();
        robot3.action();
    }
}
