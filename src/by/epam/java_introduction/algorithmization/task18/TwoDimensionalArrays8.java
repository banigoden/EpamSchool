package by.epam.java_introduction.algorithmization.task18;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArrays8 {

    /*
    В числовой матрице поменять местами два столбца любых столбца,
    т. е. все элементы одного столбца поставить на соответствующие
    им позиции другого, а его элементы второго переместить в первый.
    Номера столбцов вводит пользователь с клавиатуры.
     */
    public static void main(String[] args) {

        int swap;

        System.out.print("Enter the square matrix n: ");

        int n = ScannerInt();
        int[][] matrix = new int[n][n];

        System.out.print("Enter column 1 which would you like to change: ");
        int column1 = ScannerInt() - 1;
        System.out.print("Enter column 2 which would you like to change: ");
        int column2 = ScannerInt() - 1;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 50);
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < matrix.length; i++) {

            swap = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = swap;
        }

        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
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
