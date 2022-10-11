package by.epam.java_introduction.programming_with_classes.task15;

public enum Transport {

    PLANE, BUS, TAXI, TRAIN, CAR, SHIP;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
