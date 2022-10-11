package by.epam.java_introduction.algorithmization.task4;

import java.util.Arrays;
import java.util.Scanner;

public class OneDemensionArray4 {
    /*
    Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
     */

    public static void main(String[] args) {

        int n, min, max, swap;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }

        min = Arrays.stream(array).min().getAsInt();
        max = Arrays.stream(array).max().getAsInt();

        System.out.println( "min is " + min + ", max is " + max);

        min = 0;
        max = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[max] > array[i])
                max = i;
            if (array[min] < array[i])
                min = i;
        }

        swap = array[max];
        array[max] = array[min];
        array[min] = swap;

        System.out.println(Arrays.toString(array));
    }

    private static int ScannerInt(){

        Scanner init = new Scanner(System.in);
        int number;
        while (!init.hasNextInt()){
            init.next();
            System.out.print("Not valid value. Please enter new:");
        }
        number = init.nextInt();
        if (number == 0 || number < 0 ){

            System.out.print("Please enter above 0 : ");
            number = ScannerInt();
        }
        return number;
    }
}
