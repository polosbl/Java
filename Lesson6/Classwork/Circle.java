package Lesson6.Classwork;

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
    public FigureType getFigureType() {
        return FigureType.CIRCLE;
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
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координаты центра: [" + getCenter().getX() + ", " + getCenter().getY() + "]");
        System.out.println("Радиус: " + getRadius());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: "+ getPerimeter());
        System.out.print('\n');
    }
}
