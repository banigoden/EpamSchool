package by.epam.java_introduction.algorithmization.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrays1 {
    /*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */

    public static void main(String[] args) {

        int sizeStrings, sizeColumns;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter the size of matrix.\nEnter amount of strings: ");

            sizeStrings = Integer.valueOf(reader.readLine());

            System.out.print("Enter amount of columns: ");

            sizeColumns = Integer.valueOf(reader.readLine());

            int[][] matrix = new int[sizeStrings][sizeColumns];


            for (int i = 0; i < sizeStrings; i++) {

                for (int j = 0; j < sizeColumns; j++) {

                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) + positiveNegative;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < sizeStrings; i++) {

                for (int j = 0; j < sizeColumns; j++) {

                    if(j % 2 == 0 && matrix[0][j] > matrix[sizeStrings - 1][j]){
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }


//            int[] array1 = {5, 7, 6, 4};
//            int[] array2 = {1, 3, 1, 8};
//            int[] array3 = {9, 2, 3, 5};
//            int[] array4 = {4, 6, 2, 7};
//
//            int[][] arrays = {array1, array2, array3, array4};

//            for (int index1 = 0; index1 < arrays.length; index1++) {
//                for (int index2 = 0; index2 < arrays[index1].length; index2++) {
//                    System.out.print(arrays[index1][index2] + " ");
//                }
//                System.out.println();
//            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
