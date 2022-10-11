package by.epam.java_introduction.algorithmization.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TwoDimensionalArrays3 {
    /*
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы
     */

    public static void main(String[] args) {
        int sizeStrings, sizeColumns, k, r;



            System.out.print("Enter the size of matrix.\nEnter amount of strings: ");

            sizeStrings = ScannerInt();

            System.out.print("Enter amount of columns: ");

            sizeColumns = ScannerInt();

            System.out.print("Enter k of columns: ");

            k = ScannerInt();

            if (!(k <= sizeStrings)) {
                System.out.print("Quantity of strings don't exist. Enter right quantity: ");
                k = ScannerInt();
            }

            System.out.print("Enter r of columns: ");

            r = ScannerInt();

            if (!(r <= sizeColumns)) {
                System.out.print("Quantity of columns don't exist. Enter right quantity: ");
                r = ScannerInt();
            }

            int[][] matrix = new int[sizeStrings][sizeColumns];

            for (int i = 0; i < sizeStrings; i++) {

                for (int j = 0; j < sizeColumns; j++) {

                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d", matrix[i][j]);
                }
                System.out.println();
            }



            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("  ");

                    if( (i == k - 1) || (j == r - 1) ){
                        System.out.print(matrix[i][j]);

                    }
                }
                System.out.println();
            }
    }

    private static int ScannerInt(){

        Scanner init = new Scanner(System.in);
        int number;
        while (!init.hasNextInt()){
            init.next();
            System.out.print("Not valid value. Please enter new:");
        }
        number = init.nextInt();
        if (number == 0 || number < 0 ){

            System.out.print("Please enter above 0 : ");
            number = ScannerInt();
        }
        return number;
    }
}
