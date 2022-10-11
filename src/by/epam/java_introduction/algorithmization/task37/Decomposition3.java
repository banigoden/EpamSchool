package by.epam.java_introduction.algorithmization.task37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition3 {
    /*
    Вычислить площадь правильного шестиугольника
    со стороной а, используя метод вычисления площади треугольника.
     */

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the side of hexagon: ");
            double a = Double.parseDouble(reader.readLine());
            System.out.printf("The area of hexagon: " + "%.1f", countOfSquare(a));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static double countOfSquare(double a) {
        return (3 * Math.sqrt(3) * Math.pow(a,2)) / 2;
    }
}
