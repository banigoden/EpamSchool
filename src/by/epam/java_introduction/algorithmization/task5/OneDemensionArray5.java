package by.epam.java_introduction.algorithmization.task5;

import java.util.Scanner;

public class OneDemensionArray5 {
    /*
    Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
     */

    public static void main(String[] args) {

        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
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
