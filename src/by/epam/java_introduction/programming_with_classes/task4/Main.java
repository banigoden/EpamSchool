package by.epam.java_introduction.programming_with_classes.task4;


import java.time.LocalTime;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Train [] trains = new Train[5];
        trains[0] = new Train("Saint-Petersburg", 456, LocalTime.of(02,24));
        trains[1] = new Train("Moskow", 454, LocalTime.of(11,44));
        trains[2] = new Train("Moskow", 455, LocalTime.of(11, 12));
        trains[3] = new Train("Berlin", 448, LocalTime.of(17, 41));
        trains[4] = new Train("Minsk", 446, LocalTime.of(12 ,00));

        SortTrain.sortByNumber(trains);
        System.out.println(Arrays.toString(trains));
        SortTrain.sortNameDestination(trains);
        System.out.println(Arrays.toString(trains));
        int number = 456;
        Train.getInfoByNumber(trains, number);

    }
}
