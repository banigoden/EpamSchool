package by.epam.java_introduction.algorithmization.task3;

import java.util.Scanner;

public class OneDemensionArray3 {
    /*
    Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
    положительных и нулевых элементов.
     */

    public static void main(String[] args) {


        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
        }

        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 ) {
                countPositive++;
            }else if (array[i] < 0 ) {
                countNegative++;
            }else {
                countNull++;
            }
        }

        System.out.println("Result of positive count: " + countPositive + ", negative count: " + countNegative + ", null count: " + countNull);
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
