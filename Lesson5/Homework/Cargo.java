package Lesson5.Homework;

public class Cargo extends Land {
    private double liftingCapacity;

    Cargo (double power, double maxSpeed, double mass, String brand, int numberOfWheels, double fuelConsumption,
               double liftingCapacity) {
        super(power,maxSpeed,mass,brand,numberOfWheels,fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return this.liftingCapacity;
    }

    @Override
    public void printInformation() {
        System.out.println("Мощность(в лошадиных силах): " + getPower());
        System.out.println("Максимальная скорость(км/ч): " + getMaxSpeed());
        System.out.println("Масса (кг): " + getMass());
        System.out.println("Марка: " + getBrand());
        System.out.println("Количество колёс: " + getNumberOfWheels());
        System.out.println("Расход топлива(л/100км): " + getFuelConsumption());
//        System.out.println("Грузоподъемность (т): " + getLiftingCapacity());
        System.out.println("Грузоподъемность (т): " + this.liftingCapacity);
        System.out.println("Мощность в киловаттах (кВ): " + getPower() * 0.74);
        System.out.println("\n");
    }

    public void load(double mass) {
        System.out.println("Проверяем, сможем ли загрузиться:");
        if (mass <= this.liftingCapacity) {
            System.out.println("Грузовик загружен" + "\n");
        } else {
            System.out.println("Вам нужен грузовик побольше" + "\n");
        }
    }


}
