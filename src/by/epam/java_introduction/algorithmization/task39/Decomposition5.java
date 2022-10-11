package by.epam.java_introduction.algorithmization.task39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition5 {
    /*
    Составить программу, которая в массиве A[N] находит второе по величине число
    (вывести на печать число,которое меньше максимального элемента массива, но больше
    всех других элементов).
     */

    public static void main(String[] args) {
        int[] array = enterArray();
        findSecondBigElemetn(array);

    }
    private static int[] enterArray(){
        int[] array = new int[0];
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter array: ");
            int number = Integer.parseInt(reader.readLine());
            array = new int[number];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 123);
            }
            return array;
        }catch (IOException e){
            e.printStackTrace();
        }
        return array;
    }

    private static void findSecondBigElemetn(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("The second big number : " +  array[array.length - 2]);
    }
}
