package Lesson5.Classwork2;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(0.0,0.0);
        point.printInformation();

        Point point2 = new Point(5.0,1.0);

        Circle circle = new Circle(point, 8.0);
        circle.printInformation();
        System.out.println("Содержит точку: " + circle.containsPoint(point2) + "\n");

        Rectangle rectangle = new Rectangle(point, 8.0, 4.0);
        rectangle.printInformation();
        System.out.println("Содержит точку: " + rectangle.containsPoint(point2) + "\n");

        Square square = new Square(point, 10.0);
        square.printInformation();
        System.out.println("Содержит точку: " + square.containsPoint(point2) + "\n");
    }
}
