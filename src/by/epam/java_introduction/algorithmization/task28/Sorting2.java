package by.epam.java_introduction.algorithmization.task28;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sorting2 {

    /*
    Даны две последовательности a1<=a2<=a3<=aN и b1<=b2<=b3<=bM. Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in first array: ");

        int n = ScannerInt();

        int[] firstArray = new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
            System.out.print(firstArray[i] + " ");
        }

        System.out.print("\nEnter quantity an elements in second array: ");

        int m = ScannerInt();

        int[] secondArray = new int[m];

        for (int i = 0; i < secondArray.length; i++) {

            secondArray[i]= i + (i+2);
            System.out.print(secondArray[i] + " ");
        }



        System.out.println("\nThe result is: ");

//        int [] merged = IntStream.concat(IntStream.of(firstArray),IntStream.of(secondArray)).toArray();
//        Arrays.stream(merged).sorted().forEach(x -> System.out.print(x + " "));

        int [] result = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray,0, result,0, firstArray.length );
        System.arraycopy(secondArray, 0, result, firstArray.length , secondArray.length);

        for (int i = result.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }
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
