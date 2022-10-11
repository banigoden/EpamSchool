package by.epam.java_introduction.algorithmization.task31;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] array = {42,2,14,4,1,55,7,88,2};
        sort(array);
    }

    private static void sort(int[] array) {

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]){
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
