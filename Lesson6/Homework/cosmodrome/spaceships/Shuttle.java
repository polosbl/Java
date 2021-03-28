package Lesson6.Homework.cosmodrome.spaceships;

public class Shuttle implements IStart {

    public Shuttle() {
    }

    @Override
    public boolean prelaunchSystemCheck() {
        return (int) (Math.random() * 11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла." + "\n");
    }
}
