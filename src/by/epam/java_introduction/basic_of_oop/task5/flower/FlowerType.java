package by.epam.java_introduction.basic_of_oop.task5.flower;

public enum FlowerType {
    ROSA("rosa", 5),
    TULIP("tulip", 6),
    ORCHID("orchid", 7),
    LILY("lily", 4),
    PEONY("peony",8);

    private String name;
    private double price;

    FlowerType(String name, double price) {
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
