package by.epam.java_introduction.algorithmization.task27;

import java.util.Scanner;

public class Sorting1 {
    /*
    Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in first array: ");

        int n = ScannerInt();

        int[] firstArray = new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100);
            System.out.print(firstArray[i] + " ");
        }

        System.out.print("\nEnter quantity an elements in second array: ");

        int m = ScannerInt();

        int[] secondArray = new int[m];

        for (int i = 0; i < secondArray.length; i++) {

            secondArray[i]= (int) (Math.random() * 100);

            System.out.print(secondArray[i] + " ");
        }

        System.out.print("\nChose the number from first array: ");

        int k = ScannerInt();

        System.out.print(" Joining first array  to second one: ");
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
            
            if (k == firstArray[i] && count == 0){
                for (int j = 0; j < secondArray.length; j++) {
                    System.out.print(secondArray[j] + " ");
                }
                count++;
            }
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

        if (number == 0 && number < 0 ){

            System.out.print("Please enter above 0 : ");
            number = ScannerInt();
        }

        return number;
    }

}
