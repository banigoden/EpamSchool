package by.epam.java_introduction.algorithmization.task36;

import java.io.*;

public class Decomposition2 {
    /*
    Написать метод(методы) для нахождения наибольшего общего
    делителя четырех натуральных чисел.
     */

    public static void main(String[] args) {

        System.out.println("Enter  4 natural value ");

        int[] array = fillArray(4);
        System.out.println("GCD value is : " + findGcd(array));

    }
    private static int[] fillArray(int value){
        int[] array = new int[value];;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < array.length; i++) {
                System.out.print("Number a"+ (i + 1) +": ");
                array[i] = Integer.parseInt(reader.readLine());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return array;
    }

    private static int findGcd(int[] array) {
        int a = Math.abs(array[0]);
        for (int element : array) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }
}
