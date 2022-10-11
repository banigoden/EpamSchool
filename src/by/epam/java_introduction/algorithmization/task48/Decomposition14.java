package by.epam.java_introduction.algorithmization.task48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Натуральное число, в записи которого n цифр, называется числом Армстронга,
    если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
       числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
     */
public class Decomposition14 {
    private static long[][] pows;
    
    public static void main(String[] args) {

        printNumbersOfArmstrong(9);
    }

    private static void printNumbersOfArmstrong(int value) {
        long startTime = System.currentTimeMillis();
        List<Long> list = generate(value);
        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime - startTime) + " ms.");
        System.out.println(list);
    }

    private static List<Long> generate(int maxValue) {
        if(maxValue >= 20) throw new IllegalArgumentException();
        generationPows(maxValue);
        List<Long> results = new ArrayList<>();
        long limit = (long) Math.pow(10, maxValue);
        for (long i = 1; i < limit; i++) {
            if (check(i)) results.add(i);
        }
        return results;
    }

    private static void generationPows(int numbers) {
        pows = new long[10][numbers + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long i) {
        long powSum = 0;
        long x = i;
        int N = ((int) Math.log10(x)) + 1;
        do {
            int mod = (int) x % 10;
            powSum += pows[mod][N];
            x = x / 10;
        } while (x != 0);
        return powSum == i;
    }
}
