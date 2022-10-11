package by.epam.java_introduction.programming_with_classes.task7;
    /*
    Описать класс, представляющий треугольник.
    Предусмотреть методы для создания объектов,
    вычисления площади, периметра и точки пересечения медиан.
     */

public class Triangle {

    private Side a, b, c;

    public Triangle(Side a, Side b, Side c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static Triangle createTriangle(Point a, Point b, Point c){
        Side sideA = new Side(a,b);
        Side sideB = new Side(b,c);
        Side sideC = new Side(c,a);
        return new Triangle(sideA, sideB, sideC);
    }

    public double calculatePerimeter(){
        return a.calculateSide() + b.calculateSide() + c.calculateSide();
    }

    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a.calculateSide()) * (p - b.calculateSide()) * (p - c.calculateSide()));
    }

    public Point pointOfMeridian(){
        double x = (a.getPoinA().getX() + a.getPointB().getX() + a.getPointB().getX()) / 3;
        double y = (a.getPoinA().getY() + a.getPointB().getY() + b.getPointB().getY()) / 3;
        return new Point(x, y);
    }
}
