package by.epam.java_introduction.algorithmization.task20;

import java.util.Scanner;

public class TwoDimensionalArrays10 {

    /*
    Найти положительные элементы главной диагонали квадратной матрицы.
     */

    public static void main(String[] args) {

        System.out.print("Enter the square matrix n: ");

        int n = ScannerInt();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)(Math.random() * 100) - 50;
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] > 0){
                System.out.printf("%3d", matrix[i][i]);
            }
        }

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

        return number;
    }
}
