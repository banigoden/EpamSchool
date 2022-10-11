package by.epam.java_introduction.programming_with_classes.task12;

public class Wheel {
    public enum Type { Winter, Summer }

    private double diameter;
    private String brand;
    private Type type;

    public Wheel(double diameter, String brand, Type type) {
        this.diameter = diameter;
        this.brand = brand;
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheel " +
                "diameter " + diameter +
                ", brand " + brand +
                ", type " + type +
                " ";
    }
}
