package by.epam.java_introduction.algorithmization.task2;

import java.util.Scanner;

public class OneDemensionArray2 {
    /*
    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */

    public static void main(String[] args) {


        int n;
        int z;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();
        int[] array = new int[n];

        System.out.print("Enter K: ");
        z = ScannerInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z ) {
                array[i] = z;
                count++;
            }
        }

        System.out.println("Result is: " + count);
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
