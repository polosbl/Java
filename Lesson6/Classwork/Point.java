package Lesson6.Classwork;

public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void printInformation() {
        System.out.println("Координаты: [" + this.x + ", " + this.y + "]" + " \n");
    }
}
