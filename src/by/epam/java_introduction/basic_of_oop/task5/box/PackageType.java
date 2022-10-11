package by.epam.java_introduction.basic_of_oop.task5.box;

public enum PackageType {
    PAPER("paper", 0),
    PLASTIC("plastic", 1),
    BOX("box", 2.1),
    BASKET("basket", 1.4);

    private String name;
    private double price;

    PackageType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
