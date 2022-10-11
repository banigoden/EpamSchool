package by.epam.java_introduction.algorithmization.task23;

public class TwoDimensionalArrays13 {
    /*
    Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
     */

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)(Math.random() * 15);
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Sorting by ascending");

        int swap = 0;
        boolean isSort = false;
        for (int j = 0; j < matrix[0].length; j++) {
            while (!isSort) {
                isSort = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        isSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = swap;
                    }
                }
            }
            isSort = false;
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Sorting by descending");


        isSort = false;
        for (int j = 0; j < matrix[0].length; j++) {
            while (!isSort) {
                isSort = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        isSort = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = swap;
                    }
                }
            }
            isSort = false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
