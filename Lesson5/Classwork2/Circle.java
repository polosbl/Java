package Lesson5.Classwork2;

public class Circle extends GeometricalFigure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public String getFigureType() {
        String figureType = "Circle";
        return figureType;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter () {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public boolean containsPoint(Point point) {
        if ((point.getX() - getCenter().getX())*(point.getX() - getCenter().getX()) + (point.getY() - getCenter().getY())*(point.getY() - getCenter().getY()) < radius * radius) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void printInformation() {
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координаты центра: [" + getCenter().getX() + ", " + getCenter().getY() + "]");
        System.out.println("Радиус: " + getRadius());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: "+ getPerimeter());
        System.out.print('\n');
    }

    Circle (Point center, double radius) {
        super(center);
        this.radius = radius;
    }
}
