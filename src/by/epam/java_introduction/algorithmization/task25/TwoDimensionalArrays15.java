package by.epam.java_introduction.algorithmization.task25;

import java.util.Scanner;

public class TwoDimensionalArrays15 {
    /*
    Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
     */

    public static void main(String[] args) {

        System.out.print(" Enter the square matrix: ");

        int n = ScannerInt();

        int [][] matrix = new int[n][n];

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random()* 100) * positiveNegative;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        for (int [] array : matrix) {
            for (int element : array) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }

        System.out.println(maxValue);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxValue;
                }
            }
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
