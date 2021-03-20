package Lesson5.Homework;

public class Civil extends Air {
    private int numberOfPassengers;
    private boolean haveBusinessClass;

    Civil (double power, double maxSpeed, double mass, String brand, double wingspan, double minRunwayLength,
           int numberOfPassengers, boolean haveBusinessClass) {
        super(power,maxSpeed,mass,brand,wingspan,minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.haveBusinessClass = haveBusinessClass;
    }

    public int getNumberOfPassengers() {
        return this.getNumberOfPassengers();
    }

    public boolean isHaveBusinessClass() {
        return this.haveBusinessClass;
    }

    @Override
    public void printInformation() {
        System.out.println("Мощность(в лошадиных силах): " + getPower());
        System.out.println("Максимальная скорость(км/ч): " + getMaxSpeed());
        System.out.println("Масса (кг): " + getMass());
        System.out.println("Марка: " + getBrand());
        System.out.println("Размах крыльев (м): " + getWingspan());
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinRunwayLength());
//        System.out.println("Кол-во пассажиров: " + getNumberOfPassengers());
        System.out.println("Кол-во пассажиров: " + this.numberOfPassengers);
//        System.out.println("Наличие бизнес класса: " + isHaveBusinessClass());
        System.out.println("Наличие бизнес класса: " + this.haveBusinessClass);
        System.out.println("Мощность в киловаттах (кВ): " + getPower() * 0.74);
        System.out.print("\n");
    }

    public void load(double numberOfPassengers) {
        System.out.println("Проверяем, сможем ли вместить пассажиров:");
        if (numberOfPassengers <= this.numberOfPassengers) {
            System.out.println("Пассажиры разместились" + "\n");
        } else {
            System.out.println("Вам нужен самолет побольше" + "\n");
        }
    }
}
