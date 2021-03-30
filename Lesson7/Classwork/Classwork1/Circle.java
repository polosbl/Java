package Lesson7.Classwork.Classwork1;

import java.util.Objects;

public class Circle extends GeometricalFigure {
    private double radius;

    public Circle (Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getFigureType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean containsPoint(Point point) {
        return (point.getX() - getCenter().getX())*(point.getX() - getCenter().getX()) +
                (point.getY() - getCenter().getY())*(point.getY() - getCenter().getY()) < radius * radius;
    }

    @Override
    public void printInformation() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getFigureType() + "\n"
                + "Координаты центра: [" + getCenter().getX() + ", " + getCenter().getY() + "]" + "\n"
                + "Радиус: " + getRadius() + "\n"
                + "Площадь: " + getArea() + "\n"
                + "Периметр: "+ getPerimeter() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return other.radius == radius && other.getCenter().equals(getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, getCenter());
    }
}
