package Lesson6.Homework.cosmodrome.spaceships;

public class Vostok implements IStart {

    public Vostok () {
    }

    @Override
    public boolean prelaunchSystemCheck() {
        int number = (int) (Math.random() * 11);

        if (number > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели ракеты запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт ракеты." + "\n");
    }
}
