package by.epam.java_introduction.algorithmization.task44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Дано натуральное число N. Написать метод(методы) для формирования массива,
    элементами которого являются цифры числа N
     */
public class Decomposition10 {
        public static void main(String[] args) {

            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Enter the size of array: ");
                int m = Integer.parseInt(read.readLine());
                System.out.print("Enter number N: ");
                int n = Integer.parseInt(read.readLine());

                createArray (m, n);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    private static void createArray(int m, int n) {
            int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            System.out.printf("%d ", array[i]);
        }
    }
}
