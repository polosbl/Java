package Lesson6.Homework.cosmodrome.spaceships;

public class Vostok implements IStart {

    public Vostok () {
    }

    @Override
    public boolean prelaunchSystemCheck() {
        return (int) (Math.random() * 11) > 3;
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
