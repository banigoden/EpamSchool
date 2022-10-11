package by.epam.java_introduction.algorithmization.task6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OneDemensionArray6 {

    /*
    Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.
     */

    public static void main(String[] args) {

        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (IsPrime(array[i])){
                sum += array[i];
            }
        }

        System.out.println("Result is: " + sum);

    }

    private static boolean IsPrime(int n){
        if (n == 2 || n == 3)
            return true;

        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6){

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
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
