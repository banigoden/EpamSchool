package by.epam.java_introduction.basic_of_oop.task5.flower;

public class Lily implements Flower {
    private String name;
    public double price;

    public Lily(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
