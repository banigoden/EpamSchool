package by.epam.java_introduction.algorithmization.task17;

import java.util.Scanner;

public class TwoDimensionalArrays7 {

    /*
    Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin((I^2 - J^2) / N)
    и подсчитать количество положительных элементов в ней.
     */

    public static void main(String[] args) {

        System.out.print("Enter the square matrix with even number n: ");

        int n = ScannerInt();
        double[][] matrix = new double[n][n];

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2)) / n);
                System.out.printf("%10f", matrix[i][j]);
                if (matrix[i][j] > 0){
                    count++;
                }
            }
            System.out.println();
        }

        System.out.printf("%n Amount of positive numbers: %d", count);

    }

    private static int ScannerInt(){

        Scanner init = new Scanner(System.in);
        int number;
        while (!init.hasNextInt()){
            init.next();
            System.out.print("Not valid value. Please enter new: ");
        }

        number = init.nextInt();

        if (number == 0 || number < 0 ){

            System.out.print("Please enter above 0 : ");
            number = ScannerInt();
        }

        if (number % 2 != 0){

            System.out.print("Please enter even value: ");
            number = ScannerInt();
        }
        return number;
    }
}
