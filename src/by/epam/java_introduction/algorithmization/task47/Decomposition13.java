package by.epam.java_introduction.algorithmization.task47;

import java.util.Arrays;

/*
    Два простых числа называются «близнецами», если они отличаются друг от друга
        на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
        n,2n], где n - заданное натуральное число больше 2. Для решения задачи
        использовать декомпозицию.
     */
public class Decomposition13 {

    public static void main(String[] args) {
        int n = 50;
        int[][] twinsNumbers = findTwins(n);
        printArray(twinsNumbers);
    }

    private static int[][] findTwins(int n) {
        int[][] array = new int[n - 1][2];
        for (int i = 0; i < array.length; i++) {
           array[i][0] = n + i;
           array[i][1] = array[i][0] + 2;
        }
        return array;
    }
    private static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}


