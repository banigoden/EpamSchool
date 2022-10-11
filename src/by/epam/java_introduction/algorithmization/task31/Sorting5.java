package by.epam.java_introduction.algorithmization.task31;

import javax.swing.text.Element;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting5 {

    /*
    Сортировка вставками. Дана последовательность чисел a1,a2,a3,a4...aN.
    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
    Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.
    Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей.
    Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
    Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
     */
    public static void main(String[] args) {

        System.out.print("Enter quantity an elements in array: ");

        int n = ScannerInt();

        int[] insertionSort = new int[n];

        for (int i = 0; i < insertionSort.length; i++) {
            insertionSort[i] = (int) (Math.random() * 50);
            System.out.print(insertionSort[i] + " ");
        }

        sortingByInsert(insertionSort);
        System.out.println("\n" + Arrays.toString(insertionSort));

    }

    private static void sortingByInsert(int[] array){
        int value = 0;
        for (int left = 1; left < array.length - 1; left++) {

            if(array[left] > array[left + 1]){
                value = array[left + 1];
                int j = binarySearch(array, left, array[left + 1]);
                for (int k = left + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[left] = value;
            }
        }
    }

    private static int binarySearch(int[] array,int last, int element ){
        int mid = last;
        int first = 0;
        while(first <= last){
            mid = (first + last) / 2;
            if (array[mid] < element){
                first = mid + 1;
            }else if (array[mid] == element){
                return mid;
            }else if( array[mid] > element && mid != 0 && !(array[mid - 1] < element)){
                last = mid - 1;
            }else {
                break;
            }
        }
        return mid;
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
