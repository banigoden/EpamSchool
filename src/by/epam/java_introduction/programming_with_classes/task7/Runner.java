package by.epam.java_introduction.programming_with_classes.task7;

import java.util.Locale;

public class Runner {

    public static void main(String[] args) {

        Point A = new Point(-3,4);
        Point B = new Point(2,6);
        Point C = new Point(3,1);

        System.out.printf(" A(%.1f,%.1f); B(%.1f,%.1f); C(%.1f,%.1f).%n",
                A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());

        Triangle triangle = Triangle.createTriangle(A, B, C);

        System.out.printf("Perimetr: %.1f%n", triangle.calculatePerimeter());
        System.out.printf("Area: %.1f%n", triangle.calculateArea());
        System.out.printf("Merediana: X %.1f Y %1f",  triangle.pointOfMeridian().getX(), triangle.pointOfMeridian().getY());

    }
}
