package by.epam.java_introduction.algorithmization.task24;

import java.util.Scanner;

public class TwoDimensionalArrays14 {
    /*
    Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
    причем в каждом столбце число единиц равно номеру столбца.
     */

    public static void main(String[] args) {

        int n,m
;
        System.out.print("Enter amount of strings: ");

        m = ScannerInt();

        System.out.print("Enter amount of columns: ");

        n = ScannerInt();

        int[][] matrix = new int[m][n];

        int count;
        for (int i = 0; i < matrix[0].length; i++) {
            count = 0;
            for (int j = 0; j < matrix.length; j++) {

                if (i > count){
                    matrix[j][i] = 0;
                    count++;
                }else {
                    matrix[j][i] = 1;
                }
                System.out.printf("%3d", matrix[j][i]);
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
