package by.epam.java_introduction.basic_of_oop.task5.action;

import by.epam.java_introduction.basic_of_oop.task5.flowerArragment.ChoseYourOwnFlowers;
import by.epam.java_introduction.basic_of_oop.task5.flowerArragment.FlowerArragement;
import by.epam.java_introduction.basic_of_oop.task5.flowerArragment.OrchidPeonyFlowerArragement;
import by.epam.java_introduction.basic_of_oop.task5.flowerArragment.TylipFlowerArragment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Client {

    private static  Scanner scanner = new Scanner(System.in);

    public void chooseFlower(){

        System.out.println(" Please choose flower: \n" +
                "1 - Orchid and Piony \n" +
                "2 - Tylips \n" +
                "3 - Choose your own flowers \n");

        System.out.print("Enter Flower bucket: ");
        int bucket = checkInputOption();
        collectBucket(bucket);

    }

    private static int checkInputOption() {
        Pattern pattern = Pattern.compile("[1-3]");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)){
            scanner.nextLine();
            System.out.println("Choose between 1,2,3");
        }
        return scanner.nextInt();
    }

    private void collectBucket(int bucket){
        FlowerArragement flowerArragement;
        switch (bucket) {
            case 1 -> {
                flowerArragement = new OrchidPeonyFlowerArragement();
                flowerArragement.collect();
                flowerArragement.pack();
                flowerArragement.pay();
            }
            case 2 -> {
                flowerArragement = new TylipFlowerArragment();
                flowerArragement.collect();
                flowerArragement.pack();
                flowerArragement.pay();
            }
            case 3 -> {
                flowerArragement = new ChoseYourOwnFlowers();
                flowerArragement.collect();
                flowerArragement.pack();
                flowerArragement.pay();
            }
            default -> System.out.println(" no bucket");
        }
    }

    public void test() {

        int array[] = {12, 53, 1, 4, 7, 33, 22};
        int gap = array.length / 2;
        while (gap >= 1){
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0 ; c-=gap) {
                    if (array[c] > array[c + gap]){
                        int tmp = array[c + gap];
                        array[c + gap] = array[c];
                        array[c] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));

        int k = 0;

        int array1[] = {12, 53, 1, 4, 7, 33, 22};
        for (int left = 0; left < array1.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (;i >= 0; i--){
                if(value < array1[i]){
                    array1[i + 1] = array1[i];
                }else {
                    break;
                }
            }
            array1[i + 1] = value;
        }
        System.out.println(Arrays.toString(array1));
    }

    public int removeDuplicates(int[] nums){

        int index = 0;
        int unique = nums[index];
        for(int i = 0; i < nums.length; i++){
            if(unique != nums[i]){
                index++;
                unique = nums[i];
                nums[index] = unique;
            }else{
                nums[i] = unique;
            }
        }
        return index;
    }

//    public int binarySearch(int key, int[] array, int min, int max){
//        if (max < min){
//            return -1;
//        }else {
//            int midpoint = findMidpoint(min, max);
//
//            if(array[midpoint] < key){
//                binarySearch(key,array, midpoint + 1, max);
//            } else if (array[midpoint] > key) {
//                binarySearch(key,array, min , midpoint - 1);
//            }else{
//                return midpoint;
//            }
//        }
//    }

//    private int findMidpoint(int min, int max) {
//    }


}
 