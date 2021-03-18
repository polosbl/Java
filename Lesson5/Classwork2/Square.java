package Lesson5.Classwork2;

public class Square extends Rectangle {

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String getFigureType() {
        String figureType = "Square";
        return figureType;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter () {
        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }

    @Override
    public boolean containsPoint(Point point) {
        double xMin = getCenter().getX() - width / 2.0;
        double xMax = getCenter().getX() + width / 2.0;
        double yMin = getCenter().getY() - height / 2.0;
        double yMax = getCenter().getY() + height / 2.0;

        if (point.getX() >= xMin && point.getX() <= xMax && point.getY() >= yMin && point.getY() <= yMax) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printInformation() {
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координаты центра: [" + getCenter().getX() + ", " + getCenter().getY() + "]");
        System.out.println("Сторона: " + getWidth());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: "+ getPerimeter());
        System.out.print('\n');
    }

    Square(Point center, double side) {
        super(center,side,side);
        this.width = side;
        this.height = side;
    }
}
