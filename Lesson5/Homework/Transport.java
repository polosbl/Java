package Lesson5.Homework;

public abstract class Transport {
    private double power;
    private double maxSpeed;
    private double mass;
    private String brand;

    Transport(double power, double maxSpeed, double mass, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    public double getPower() {
        return this.power;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getMass() {
        return this.mass;
    }

    public String getBrand() {
        return this.brand;
    }


    public abstract void printInformation();
}
