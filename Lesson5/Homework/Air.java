package Lesson5.Homework;

public abstract class Air extends Transport {
    private double wingspan;
    private double minRunwayLength;

    Air (double power, double maxSpeed, double mass, String brand, double wingspan, double minRunwayLength) {
        super(power,maxSpeed,mass,brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan() {
        return this.wingspan;
    }

    public double getMinRunwayLength() {
        return this.minRunwayLength;
    }
}
