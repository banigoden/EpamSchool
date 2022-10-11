package by.epam.java_introduction.basic_of_oop.task4.treasure;

import java.util.Random;

public enum TreasureName {
    GOLDEN("Golden"),
    JELEWERY("Jelewery"),
    DIAMOND("Diamond"),
    CROWN("Crown"),
    SWORD("Sword"),
    CROSS("Cross"),
    WEAPON("weapon"),
    VASE("vase");

    private String name;

    TreasureName(String name) {
        this.name = name;
    }

    public static TreasureName getTreasure(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
