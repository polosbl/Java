package Lesson7.Classwork.Classwork1;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(3.0,4.0);
        System.out.println("hasCode point: " + point.hashCode());
//        point.printInformation();

        Point point2 = new Point(5.0,1.0);
        System.out.println("hasCode point2: " + point2.hashCode());

        Circle circle1 = new Circle(point, 8.0);
        circle1.printInformation();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(point2, 8.0);
        Circle circle3 = new Circle(point, 8.0);


        System.out.println("Круг1 и Круг2 равны: " + circle1.equals(circle2));
        System.out.println("Круг1 и Круг3 равны: " + circle1.equals(circle3));

        System.out.println("hasCode1: " + circle1.hashCode());
        System.out.println("hasCode2: " + circle2.hashCode());
        System.out.println("hasCode3: " + circle3.hashCode());

//        System.out.println("Содержит точку: " + circle.containsPoint(point2) + "\n");
//
//        Rectangle rectangle = new Rectangle(point, 8.0, 4.0);
//        rectangle.printInformation();
//        System.out.println("Содержит точку: " + rectangle.containsPoint(point2) + "\n");
//
//        Square square = new Square(point, 10.0);
//        square.printInformation();
//        System.out.println("Содержит точку: " + square.containsPoint(point2) + "\n");
    }
}
