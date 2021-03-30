package Lesson7.Classwork.Classwork1;

public class Square extends Rectangle {

    public Square(Point center, double side) {
        super(center,side,side);
        this.width = side;
        this.height = side;
    }

    @Override
    public String getFigureType() {
        return "Square";
    }
}
