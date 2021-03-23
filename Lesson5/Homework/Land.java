package Lesson5.Homework;

public abstract class Land extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public Land (double power, double maxSpeed, double mass, String brand, int numberOfWheels, double fuelConsumption) {
        super(power,maxSpeed,mass,brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
}
