package by.epam.java_introduction.algorithmization.task50;

    /*
    Написать программу, определяющую сумму n - значных чисел, содержащих только
    нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
        решения задачи использовать декомпозицию.
     */
public class Decomposition16 {

    public static void main(String[] args) {
        int n = 6;
        int sum = findSumOddNumbers(n);

        System.out.printf("Sum %d numbers, consists even numbers: %d %n", n, sum);
        System.out.println("Even numbers: " + countEvenNumbers(sum));

    }

        private static int countEvenNumbers(int n) {

            int rest;int countEven = 0;
            while(n != 0){
                rest = n % 10;
                n = n / 10;
                if( rest % 2 == 0 && rest != 0)
                    countEven++;
            }
           return countEven;
        }

        private static int findSumOddNumbers(int n) {
            int sum = 0;
            int size = (int) Math.pow(5, n);
            int[] array = new int[size];
            int firstNumber = 1;
            for (int i = 1; i < n; i++) {
                firstNumber += (int) Math.pow(10, i);
            }
            array[0] = firstNumber;

            for (int i = 1; i < array.length; i++) {
                array[i] = nextNumber(array[i - 1], n);
            }
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }

        private static int nextNumber(int number, int n) {
            boolean isNext = false;
            while (!isNext) {
                number += 2;
                isNext = true;
                int m = n;
                while (m > 0) {
                    if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                        isNext = false;
                    }
                }
            }
            return number;
        }
    }
