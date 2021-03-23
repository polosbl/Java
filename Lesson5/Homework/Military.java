package Lesson5.Homework;

public class Military extends Air {
    private boolean haveCatapultSystem;
    private int rocketsOnBoard;

    public Military (double power, double maxSpeed, double mass, String brand, double wingspan, double minRunwayLength,
           int rocketsOnBoard, boolean haveCatapultSystem) {
        super(power,maxSpeed,mass,brand,wingspan,minRunwayLength);
        this.rocketsOnBoard = rocketsOnBoard;
        this.haveCatapultSystem = haveCatapultSystem;
    }

    public boolean isHaveCatapultSystem() {
        return this.haveCatapultSystem;
    }

    public int getRocketsOnBoard() {
        return this.rocketsOnBoard;
    }

    @Override
    public void printInformation() {
        System.out.println("Мощность(в лошадиных силах): " + getPower());
        System.out.println("Максимальная скорость(км/ч): " + getMaxSpeed());
        System.out.println("Масса (кг): " + getMass());
        System.out.println("Марка: " + getBrand());
        System.out.println("Размах крыльев (м): " + getWingspan());
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinRunwayLength());
//        System.out.println("Кол-во ракет на борту: " + getRocketsOnBoard());
        System.out.println("Кол-во ракет на борту: " + this.rocketsOnBoard);
//        System.out.println("Наличие системы катапультирования: " + isHaveCatapultSystem());
        System.out.println("Наличие системы катапультирования: " + this.haveCatapultSystem);
        System.out.println("Мощность в киловаттах (кВ): " + getPower() * 0.74);
        System.out.print("\n");
    }

    public void fire() {
        int i = 1;
        if (i <= this.rocketsOnBoard) {
            System.out.println("Ракета пошла..." + "\n");
            this.rocketsOnBoard--;
        } else {
            System.out.println("Боеприпасы отсутствуют" + "\n");
        }
    }

    public void catapult() {
        if (this.haveCatapultSystem) {
            System.out.println("Катапультирование прошло успешно" + "\n");
        } else {
            System.out.println("У вас нет такой системы" + "\n");
        }
    }
}
