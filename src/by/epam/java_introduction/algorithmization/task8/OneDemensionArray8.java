package by.epam.java_introduction.algorithmization.task8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OneDemensionArray8 {
    /*
    Дана последовательность целых чисел a 1 , a 2 ,  , a n .
    Образовать новую последовательность, выбросив из исходной те члены,
     которые равны min( a 1 , a 2 ,  , a n ).
     */

    public static void main(String[] args) {
        int min, n, count;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();

        int [] firstArray =  new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 50);
        }

         min = Integer.MAX_VALUE;
         count = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] < min){
                min = firstArray[i];
                count = 1;
            }else if (firstArray[i] == min){
                count++;
            }
        }

        System.out.println(Arrays.toString(firstArray));

        int j = 0;
        int [] secondArray = new int[firstArray.length - count];
        for (int i : firstArray) {
            if (i > min){
                secondArray[j++] = i;
            }
        }
        System.out.println("Result is " + Arrays.toString(secondArray));
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
