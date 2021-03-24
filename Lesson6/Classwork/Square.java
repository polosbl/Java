package Lesson6.Classwork;

public class Square extends Rectangle {

    public Square(Point center, double side) {
        super(center,side,side);
        this.width = side;
        this.height = side;
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.SQUARE;
    }
}
