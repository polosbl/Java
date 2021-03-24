package Lesson6.Classwork;

public enum FigureType {
    CIRCLE(true),RECTANGLE(false),SQUARE(false);

    private boolean round;

    private FigureType (boolean round) {
        this.round = round;
    }

    public boolean isRound() {
        return round;
    }
}
