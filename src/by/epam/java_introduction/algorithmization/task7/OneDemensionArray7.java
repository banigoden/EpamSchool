package by.epam.java_introduction.algorithmization.task7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OneDemensionArray7 {
    /*
    Даны действительные числа а1, а2, ..., аn. Найти max(a1 + a2n, a2 + a2n-1, ..., аn + an+1)
     */

    public static void main(String[] args) {

        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();

        while (true){
            if (n % 2 != 0) {
                System.out.print("Array has to be even. Enter again: ");
                n = ScannerInt();
            } else {
                break;
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) ;
        }

        System.out.println(Arrays.toString(array));

        System.out.println();
        int max = array[0] + array[array.length - 1];

        for (int i = 1; i < array.length / 2 ; i++) {
            if ((array[i] + array[array.length - i -1]) > max){
                max = array[i] + array[array.length - i - 1];
            }
        }

        System.out.println("Result is: " + max);
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
