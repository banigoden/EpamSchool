package by.epam.java_introduction.algorithmization.task10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OneDemensionArray10 {

    /*
    Дан целочисленный массив с количеством элементов п.
    Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями)
    Примечание. Дополнительный массив не использовать.
     */

    public static void main(String[] args) {
        int n;

        System.out.print("Enter a size of Array: ");

        n = ScannerInt();

        int [] array = new  int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        if (array.length < 2) {
            System.out.println(Arrays.toString(array));
        }else {
            if (array.length < 2){
                System.out.println(Arrays.toString(array));
            }else {
                int count = 1;

                for (int i = 2; i < array.length; i += 2) {
                    array[count] = array[i];
                    count++;
                }

                if (array.length % 2 == 0){
                    array = Arrays.copyOf(array, (array.length / 2));
                }else{
                    array = Arrays.copyOf(array, (array.length / 2) + 1);
                }
            }
            System.out.println(Arrays.toString(array));
        }
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
