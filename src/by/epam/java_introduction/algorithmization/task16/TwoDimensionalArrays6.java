package by.epam.java_introduction.algorithmization.task16;

import java.util.Scanner;

public class TwoDimensionalArrays6 {

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
       1   1   1  ... 1   1   1
       0   1   1  ... 1   1   0
       0   0   1  ... 1   0   0
       .   .   .  ... .   .   .
       0   1   1  ... 1   1   0
       1   1   1  ... 1   1   1
     */

    public static void main(String[] args) {

        System.out.print(" Enter the square matrix, n has to be even: ");

        int n = ScannerInt();

        int [][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
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
