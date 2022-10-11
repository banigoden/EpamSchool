package by.epam.java_introduction.algorithmization.task29;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting3 {
    /*
    Cортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором.
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in array: ");

        int n = ScannerInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + i * 2;
            System.out.print(array[i] + " ");
        }

        for (int left = 0; left < array.length; left++) {
            int max = left;
            for ( int i = left ;i < array.length; i++) {
                if (array[i] > array[max]){
                    max = i;
                }
            }
            int tmp = array[left];
            array[left] = array[max];
            array[max] = tmp;
        }
        System.out.println("\n" + Arrays.toString(array));

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
