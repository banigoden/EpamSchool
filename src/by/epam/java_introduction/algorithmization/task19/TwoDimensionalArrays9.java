package by.epam.java_introduction.algorithmization.task19;

import java.util.Scanner;

public class TwoDimensionalArrays9 {

    /*
    Задана матрица неотрицательных чисел.
    Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.
     */

    public static void main(String[] args) {

        System.out.print("Enter the square matrix n: ");

        int n = ScannerInt();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                  matrix[i][j] = (int)(Math.random() * 100);
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        int maxSum = 0;
        int sum = 0;
        int columnMaxSum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                sum += matrix[j][i];
            }
            System.out.printf("%nThe sum elements in column №%d is %d", i + 1, sum);
            if(sum > maxSum){
                maxSum = sum;
                columnMaxSum = i + 1;
            }
            sum = 0;
        }

        System.out.printf("\nColumn №%d consist max sum.", columnMaxSum);

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
