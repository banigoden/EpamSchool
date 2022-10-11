package by.epam.java_introduction.algorithmization.task30;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting4 {
    /*
    Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=aN.Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1. Если a i > a i + 1, то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in array: ");

        int n = ScannerInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                    count++;
                }
            }
        }

        System.out.println("\n" + Arrays.toString(array) + "  count is " + count);
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
