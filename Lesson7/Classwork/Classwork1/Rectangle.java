package Lesson7.Classwork.Classwork1;

public class Rectangle extends GeometricalFigure {
    protected double width;
    protected double height;

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String getFigureType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter () {
        return 2 * width + 2 * height;
    }

    @Override
    public boolean containsPoint(Point point) {
        double xMin = getCenter().getX() - width / 2;
        double xMax = getCenter().getX() + width / 2;
        double yMin = getCenter().getY() - height / 2;
        double yMax = getCenter().getY() + height / 2;

        return point.getX() >= xMin && point.getX() <= xMax && point.getY() >= yMin && point.getY() <= yMax;
    }

    @Override
    public void printInformation() {
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координаты центра: [" + getCenter().getX() + ", " + getCenter().getY() + "]");
        System.out.println("Ширина: " + getWidth());
        System.out.println("Высота: " + getHeight());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: "+ getPerimeter());
        System.out.print('\n');
    }
}
