package by.epam.java_introduction.programming_with_classes.task7;

public class Side {

    private Point poinA, pointB;

    public Side(Point poinA, Point pointB) {
        this.poinA = poinA;
        this.pointB = pointB;
    }
    public Point getPoinA() {
        return poinA;
    }

    public Point getPointB() {
        return pointB;
    }

    public double calculateSide() {
         return Math.sqrt(Math.pow((poinA.getX() - pointB.getX()), 2) + Math.pow((poinA.getY() - pointB.getY()), 2));
    }
}
