package by.epam.java_introduction.algorithmization.task45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
     */
public class Decomposition11 {

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the size of array: ");
            int a = Integer.parseInt(read.readLine());
            System.out.print("Enter number N: ");
            int b = Integer.parseInt(read.readLine());

            System.out.print(moreDigits(a, b));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String moreDigits(int a, int b) {
        int firstCount = (int)(Math.log10(Math.abs(a)) + 1);
        int secondCount = (int)(Math.log10(Math.abs(b)) + 1);

        if(firstCount == secondCount){
            return "The quantity of digits is equal";
        }else {
            return firstCount > secondCount ? ("A consists more") : ("B consists more");
        }
    }
}
