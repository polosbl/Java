package Lesson6.Homework.cosmodrome.spaceships;

public class Shuttle implements IStart {

    public Shuttle () {
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
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла." + "\n");
    }
}
