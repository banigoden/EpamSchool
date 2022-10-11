package by.epam.java_introduction.algorithmization.task14;

import java.util.Scanner;

public class TwoDimensionalArrays4 {

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное);
     */

    public static void main(String[] args) {

        System.out.print(" Enter the square matrix, n has to be even: ");

        int n = ScannerInt();

        int [][] matrix = new int[n][n];


        for (int i = 0; i < matrix.length; i++) {
            int countInc = matrix.length;
            int countDecr = 1;
            for (int j = 0; j < matrix[i].length; j++) {

                if(i % 2 != 0){
                    System.out.print(countInc + " ");
                    countInc--;
                }else {
                    System.out.print(countDecr + " ");
                    countDecr ++;
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
