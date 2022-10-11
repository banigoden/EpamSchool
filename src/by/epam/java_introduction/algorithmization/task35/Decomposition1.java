package by.epam.java_introduction.algorithmization.task35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Decomposition1 {
    /*
    Написать метод(методы) для нахождения наибольшего общего делителя и
    наименьшего общего кратного двух натуральных чисел:
    НОК(А,В) = A*B / НОД(A,B)
     */

    public static void main(String[] args) {
        int a, b;
        int gcd, lcm;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Please enter a: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Please enter b: ");
            b = Integer.parseInt(reader.readLine());

            gcd = findGcd(a, b);
            System.out.println("Largest Common Factor: " + gcd);

            lcm = findLcm(a, b);
            System.out.println("Least Common Multiple : " + lcm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        }else
            return b == 0 ? a : findGcd(b, a % b);
    }

    private static int findLcm(int a, int b){
        return Math.abs(a * b / findGcd(a, b));
    }
}
