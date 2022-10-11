package by.epam.java_introduction.algorithmization.task9;

import java.util.Scanner;


public class OneDemensionArray9 {
    /*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
         *   число. Если таких чисел несколько, то определить наименьшее из них.
     */

    public static void main(String[] args) {
        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();

        int [] array = new  int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int left = 0; left < array.length; left++) {

            int value = array[left];
            int i = left -1;

            for (; i >= 0 ; i--) {

                if (value < array[i]){
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = array[i];
        }
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
