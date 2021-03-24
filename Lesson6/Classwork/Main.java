package Lesson6.Classwork;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(0.0, 0.0);
//        point.printInformation();

        Point point2 = new Point(5.0, 1.0);

        Circle circle = new Circle(point, 8.0);
//        circle.printInformation();
//        System.out.println("Содержит точку: " + circle.containsPoint(point2) + "\n");

        Rectangle rectangle = new Rectangle(point, 8.0, 4.0);
//        rectangle.printInformation();
//        System.out.println("Содержит точку: " + rectangle.containsPoint(point2) + "\n");

        Square square = new Square(point, 10.0);
//        square.printInformation();
//        System.out.println("Содержит точку: " + square.containsPoint(point2) + "\n");

        GeometricalFigure[] geometricalFigures = new GeometricalFigure[5];
        geometricalFigures[0] = new Circle(point, 3.0);
        geometricalFigures[1] = new Rectangle(point, 5.0, 6.0);

        System.out.println("Квадрат: " + containsCircle(new Square(point, 3.0)));
        System.out.println("Круг: " + containsCircle(new Circle(point, 3.0)));
        System.out.println("Несколько фигур (квадрат, прямоугольник" + containsCircle(new Rectangle(point, 1.0, 2.0),
                new Square(point, 3.0)));
        System.out.println("Несколько фигур (круг, прямоугольник" + containsCircle(new Rectangle(point, 1.0, 2.0),
                new Circle(point, 3.0)));

        Printable printable = new Circle(point, 3.0);
        printable.printInformation();

        for (int i = 0; i < getNotRoundFigureTypes().length; i++) {
            System.out.println(getNotRoundFigureTypes()[i]);
        }
    }

    public static boolean containsCircle(GeometricalFigure... geometricalFigure) {
        for (int i = 0; i < geometricalFigure.length; i++) {
            if (geometricalFigure[i] instanceof Circle) {
                return true;
            }
        }
        return false;
    }

    public static FigureType[] getNotRoundFigureTypes() {
        int i = 0;

        for (FigureType figureType : FigureType.values()) {
            if (!figureType.isRound()) {
                i++;
            }
        }

        FigureType[] notRound = new FigureType[i];

        int j = 0;

        for (FigureType figureType : FigureType.values()) {
            if (!figureType.isRound()) {
                notRound[j] = figureType;
                j++;
            }
        }
        return notRound;
    }
}
