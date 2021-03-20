package Lesson5.Homework;

public class Passenger extends Land {
    private String bodyType;
    private int numberOfPassengers;

    Passenger (double power, double maxSpeed, double mass, String brand, int numberOfWheels, double fuelConsumption,
               String bodyType, int numberOfPassengers) {
        super(power,maxSpeed,mass,brand,numberOfWheels,fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    @Override
    public void printInformation() {
        System.out.println("Мощность(в лошадиных силах): " + getPower());
        System.out.println("Максимальная скорость(км/ч): " + getMaxSpeed());
        System.out.println("Масса (кг): " + getMass());
        System.out.println("Марка: " + getBrand());
        System.out.println("Количество колёс: " + getNumberOfWheels());
        System.out.println("Расход топлива(л/100км): " + getFuelConsumption());
//        System.out.println("Тип кузова: " + getBodyType());
        System.out.println("Тип кузова: " + this.bodyType);
//        System.out.println("Кол-во пассажиров: " + getNumberOfPassengers());
        System.out.println("Кол-во пассажиров: " + this.numberOfPassengers);
        System.out.println("Мощность в киловаттах (кВ): " + getPower() * 0.74);
        System.out.print("\n");
    }

    public void calculateDistance(double time) {
        double distance = time * this.getMaxSpeed();
        double fuelConsumption = Math.ceil(distance / getFuelConsumption() * Math.pow(10, 1)) / Math.pow(10, 1);
        System.out.println("За время " + time + " ч, автомобиль " + this.getBrand() + " двигаясь с максимальной скоростью " +
                this.getMaxSpeed() + " км/ч проедет " + distance + " км и израсходует " + fuelConsumption + " литров топлива." + "\n");

    }
}
