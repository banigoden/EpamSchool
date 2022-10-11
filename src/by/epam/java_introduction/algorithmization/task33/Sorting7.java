package by.epam.java_introduction.algorithmization.task33;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting7 {
    /*
    Пусть даны две неубывающие последовательности действительных чисел
    a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
    которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
    первую последовательность так, чтобы новая последовательность оставалась возрастающей.
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity of the first array: ");
        int first = ScannerInt();
        
        int[] firstArray = new int[first];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100);
            System.out.print(firstArray[i] + " ");
        }

        System.out.print("\n" +"Enter quantity of the second array: ");
        int second = ScannerInt();

        int[] secondArray = new int[second];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = 40 + (int) (Math.random() * 20);
            System.out.print(secondArray[i] + " ");
        }

        System.out.println();
        insertionSort(firstArray);
        insertionSort(secondArray);
        SecondInsertInfirst(firstArray, secondArray);



    }

    private static void SecondInsertInfirst(int[] firstArray, int[] secondArray) {

        int[] newArray = firstArray;
        for (int array2 = 0; array2 < secondArray.length; array2++) {
            int position = GetPosition(newArray, secondArray[array2]);
            int[] tempArray = new int [newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if(position > i){
                    tempArray[i] = newArray[i];
                }else if(position == i){
                    tempArray[i] = secondArray[array2];
                    tempArray[i + 1] = newArray[i];
                }else{
                    tempArray[i + 1] = newArray[i];
                }
            }
            newArray = tempArray;
            System.out.printf("%nPosition of insert %d: i = %d", secondArray[array2],position);
            System.out.println("\n" + Arrays.toString(tempArray));
        }

    }

    private static int GetPosition(int[] array, int element) {
        int value = 0;
        for (int i = 0; i < array.length ; i++) {
              if (array[i] > element && array[i - 1] < element || array[i] == element){
                  value = i;
              }
        }
        return value;
    }


    private static void insertionSort(int[] array) {

        for (int left = 0; left < array.length; left++) {

            int value = array[left];
            int i = left - 1;

            for (; i >= 0; i --){
                if (value < array[i]){
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
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
