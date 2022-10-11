package by.epam.java_introduction.basic_of_oop.task5.box;

public class Busket implements Package {
    private String name;
    private double price;

    public Busket(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
    public String toString() {
        return "Busket{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
