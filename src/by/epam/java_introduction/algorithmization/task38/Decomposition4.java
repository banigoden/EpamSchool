package by.epam.java_introduction.algorithmization.task38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition4 {
    /*
    На плоскости заданы своими координатами n точек.
    Написать метод(методы), определяющие, между какими из пар точек
    самое большое расстояние. Указание. Координаты точек занести в массив.
     */

    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter quality of strings: ");
            int n = Integer.parseInt(read.readLine());
            System.out.print("Enter quality of columns: ");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int posNeg = Math.random() < 0.5 ? 1 : -1;
                    matrix[i][j] = (int) (Math.random() * 101) * posNeg;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            findDistanceBetweenPoints(matrix);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static double countDistance(int [][] matrix){
        return Math.sqrt(Math.pow(matrix[0][0] - matrix[1][0],2) +
                (Math.pow(matrix[0][1] - matrix[1][1],2)));
    }

    private static void findDistanceBetweenPoints(int [][] array){
       int[] result  = new int[2];
       double distance;
       double maxDistance = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int[][] currentPoints = {{array[i][0],array[i][1]},{array[j][0],array[j][1]}};
                distance = countDistance(currentPoints);
                if(distance > maxDistance){
                    maxDistance = distance;
                    result [0] = i + 1;
                    result [1] = j + 1;
                }
            }
        }
        output(result, maxDistance);
    }

    private static void output(int[] result, double maxDistance){
        System.out.printf("Maximum distance beetwen points %d and %d  is  %.2f ",
                result[0], result[1], maxDistance);
    }
}