package by.epam.java_introduction.algorithmization.task42;

import java.util.Scanner;

public class Decomposition {
    /*
    Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m.
     */

    public static void main(String[] args) {

        System.out.print("Enter more then 6 elements in array: ");

        int m = ScannerInt();

        if (m < 6 ){
            System.out.print("You entered less then 6 elements: ");
            m = ScannerInt();
        }
        System.out.print("Beetwen k and m have to be at least 6 elements! Enter k: ");

        int k = ScannerInt();

        if(m - k != 6){
            System.out.println("Have to be at least 6 elements! Enter k:");
            k = ScannerInt();
        }

        int[] array = new int[m];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        calculate(array, k);
        calculate(array, k + 2);
        calculate(array, k + 3);
    }

    private static void calculate(int [] calculate, int k){

        int sum = 0;

        for (int i = k - 1; i < k+2 ; i++) {
            sum += calculate[i];
        }

        System.out.println(sum);
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
