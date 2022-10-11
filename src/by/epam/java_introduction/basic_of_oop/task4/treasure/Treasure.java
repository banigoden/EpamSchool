package by.epam.java_introduction.basic_of_oop.task4.treasure;

public class Treasure {
    private TreasureName name;
    private double price;

    public Treasure( double price) {
        this.name = TreasureName.getTreasure();
        this.price = price;
    }

    public TreasureName getName() {
        return name;
    }

    public void setName(TreasureName name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name " + name +
                ", price " + price;
    }
}
