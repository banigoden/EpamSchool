package by.epam.java_introduction.algorithmization.task43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
    вычисления его площади, если угол между сторонами длиной X и Y— прямой.
     */
public class Decomposition9 {

        public static void main(String[] args) {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                System.out.print("Enter the sizes of sides quadrangle: " +
                        "x = ");
                int x = Integer.parseInt(reader.readLine());
                System.out.print("y = ");
                int y = Integer.parseInt(reader.readLine());
                System.out.print("z = ");
                int z = Integer.parseInt(reader.readLine());
                System.out.print("t = ");
                int t = Integer.parseInt(reader.readLine());

                double quadrilateral = (float) calculateSquare(x, y, z, t);
                System.out.println("The area of quadrangle is: " + quadrilateral);

            }catch (IOException e){

            }
        }

        private static double calculateSquare(double x, double y, double z, double t){
           double diagonal = (x * x + y * y);
           double s1 = x * y / 2;
           double p = (z + t + diagonal) / 2;
           double s2 = Math.sqrt(p * (p - z) * (p - t) * (p - diagonal));
           return s1 + s2;
        }

}
