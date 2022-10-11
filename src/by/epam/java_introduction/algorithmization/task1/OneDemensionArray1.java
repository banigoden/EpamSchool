package by.epam.java_introduction.algorithmization.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class OneDemensionArray1 {
    /*
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */

    public static void main(String[] args) {

        int n;
        int k;

        System.out.print("Enter a size of Array: ");
        
        n = ScannerInt();
        int [] array = new int[n];

        System.out.print("Enter K: ");
        k = ScannerInt();

        for (int i = 0; i < array.length; i++) {
            array[i] =(int) (Math.random() * 100);
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if  (array[i] % k == 0){
                sum += array[i];
            }
        }

        System.out.println("Result is: " + sum);
//        sum = Arrays.stream(array)
//                .filter(x -> x % k == 0)
//                .sum();



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
