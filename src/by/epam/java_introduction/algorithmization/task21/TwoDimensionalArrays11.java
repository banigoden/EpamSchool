package by.epam.java_introduction.algorithmization.task21;

public class TwoDimensionalArrays11 {

    /*
    Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз
     */
    public static void main(String[] args) {

        int[][] matrix = new int[10][20];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)(Math.random() * 15);
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        int count;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                if( matrix[i][j] == 5){
                    count ++;
                }
            }
            if (count >= 3){
                System.out.printf("%nThe resuls is : %d ", i + 1);
            }
        }
    }
}
