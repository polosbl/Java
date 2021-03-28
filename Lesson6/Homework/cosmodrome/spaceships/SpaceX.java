package Lesson6.Homework.cosmodrome.spaceships;

public class SpaceX implements IStart {

    public SpaceX () {
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
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX." + "\n");
    }
}
