package by.epam.java_introduction.algorithmization.task15;

import java.util.Scanner;

public class TwoDimensionalArrays5 {

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
       1   1   1  ... 1   1   1
       2   2   2  ... 2   2   0
       3   3   3  ... 3   0   0
       .   .   .  ... .   .   .
      n-1 n-1  0  ... 0   0   0
       n   0   0  ... 0   0   0
     */

    public static void main(String[] args) {

        System.out.print(" Enter the square matrix, n has to be even: ");

        int n = ScannerInt();

        int [][] matrix = new int[n][n];


        int count = 1;
        int nullDecr = n;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( j >= nullDecr){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(count + " ");
                }
            }
            count++;
            nullDecr--;
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
