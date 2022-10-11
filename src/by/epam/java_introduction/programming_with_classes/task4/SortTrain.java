package by.epam.java_introduction.programming_with_classes.task4;

import java.util.Arrays;
import java.util.Comparator;

public class SortTrain {

    public static void sortByNumber(Train[] trains){
        Arrays.sort(trains, Comparator.comparing(Train::getTrainNumber));
    }

    public static void sortNameDestination(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getNameDestination).thenComparing(Train::getDepartureTime));
    }


}
