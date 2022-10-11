package by.epam.java_introduction.algorithmization.task32;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting6 {
    /*
    Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
    его по возрастанию. Делается это следующим образом: сравниваются два соседних
    элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
    элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаются
    на один элемент назад. Составить алгоритм этой сортировки.
     */

    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in array: ");

        int n = ScannerInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }

        int gap = array.length / 2;

        while (gap >= 1){

            for (int right = 0; right < array.length; right++) {

                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]){
                        int swap = array[c];
                        array[c] = array[c + gap ];
                        array[c + gap] = swap;
                    }
                }
            }
            gap = gap / 2;
        }

        System.out.println("\n" + Arrays.toString(array));

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
