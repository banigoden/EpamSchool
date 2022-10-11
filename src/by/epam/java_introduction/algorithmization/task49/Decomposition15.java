package by.epam.java_introduction.algorithmization.task49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
    /*
    Найти все натуральные n-значные числа, цифры в которых образуют строго
     (например, 1234, 5789). Для решения задачи
    использовать декомпозицию.
     */
public class Decomposition15 {

    public static void main(String[] args) {

        findGrowingNumbers(3569);
        findGrowingNumbers(35698);
    }

        private static void findGrowingNumbers(int n) {
            char[] digitsAsChars = String.valueOf(n).toCharArray();
            int count = 1;
            for (int i = 0; i < digitsAsChars.length - 1; i++) {
                if (Character.getNumericValue(digitsAsChars[i]) < Character.getNumericValue(digitsAsChars[i + 1])){
                    count++;
                }
            }
            if(count == digitsAsChars.length){
                System.out.print(n);
            }else {
                System.out.println("Not growing numbers");
            }
        }
    }
