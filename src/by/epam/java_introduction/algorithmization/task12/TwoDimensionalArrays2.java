package by.epam.java_introduction.algorithmization.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrays2 {
    /*
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
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

                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d", matrix[i][j]);
                }
                System.out.println();
            }

            int counStrings = 0;
            int counColumns = 0;

            for (int i = 0; i < sizeStrings; i++) {

                for (int j = 0; j < sizeColumns; j++) {

                    System.out.print("  ");
                    if(matrix[i][j] == matrix[counStrings][counColumns]){

                        System.out.print(matrix[i][j]);
                        counStrings ++;
                        counColumns ++;
                    }
                }
                System.out.println();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
