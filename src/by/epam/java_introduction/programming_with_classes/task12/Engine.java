package by.epam.java_introduction.programming_with_classes.task12;

public class Engine {

    private int number;
    private double power;

    public Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine " +
                ", number " + number +
                ", power " + power + " ";
    }
}
