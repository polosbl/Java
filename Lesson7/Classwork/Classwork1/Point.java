package Lesson7.Classwork.Classwork1;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point other = (Point) obj;
        return other.x == x && other.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x + y);
    }
}
