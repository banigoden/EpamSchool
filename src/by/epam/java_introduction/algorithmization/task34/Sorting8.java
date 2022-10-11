package by.epam.java_introduction.algorithmization.task34;

import java.util.Arrays;

public class Sorting8 {
    /*
    Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
    которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.
     */

    public static void main(String[] args) {

        Fraction[] array = {new Fraction(9,3), new Fraction(21,18),
                new Fraction(3,15), new Fraction(16,15), new Fraction(15,9)};
        System.out.println(Arrays.toString(array));
        getCommonDenominator(array);
        sort(array);


        System.out.println(Arrays.toString(array));
    }

    private static void getCommonDenominator(Fraction[] array){

        int commonDenominator = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                int max = findLcm(array[i].denom, array[j].denom);
                if (commonDenominator < max) {
                    commonDenominator = max;
                }
            }
        }

        for (Fraction element : array) {
            element.numer *= (double) commonDenominator / element.denom;
            element.denom = commonDenominator;
        }

        System.out.println( "Denom is : " + commonDenominator );
    }

    private static int findGcd(int a, int b){
         return b == 0 ? a : findGcd(b, a % b);
    }

    private static int findLcm(int a, int b){
        return a / findGcd(a, b) * b;
    }

    private static void sort( Fraction[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j].numer > array[j + 1].numer ){
                    Fraction temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
