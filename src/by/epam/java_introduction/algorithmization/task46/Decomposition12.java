package by.epam.java_introduction.algorithmization.task46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

    /*
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
          элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
     */

class Decomposition12 {

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter number K: ");
            int k = Integer.parseInt(read.readLine());
            System.out.print("Enter number N: ");
            int n = Integer.parseInt(read.readLine());

          int[] array = createArray(k, n);
          printArray(array);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray( int k, int n) {
        int sum = 0;
        int[] array = new int[k];
        int count = 0;
        for (int i = 0; i < array.length && k > sum; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            sum += array[i];
            count = i;
        }
        while (true) {
            if (sum > k) {
                array[count] = array[count] - (sum - k);
                break;
            }else if (sum < k){
                array[count] = array[count] + (k - sum);
                break;
            }else {
                break;
            }
        }
        return array;
    }
}
