package Lesson6.Homework.cosmodrome;

import Lesson6.Homework.cosmodrome.spaceships.IStart;

public class Cosmodrome {
    public Cosmodrome () {
    }

    public void launch(IStart object) {
        if (object.prelaunchSystemCheck()) {
            object.startEngine();
            System.out.println("Обратный отсчет:");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            object.start();
        } else {
            System.out.println("Предстартовая проверка провалена!" + "\n");
        }
    }
}
