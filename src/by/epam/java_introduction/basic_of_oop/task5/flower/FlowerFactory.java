package by.epam.java_introduction.basic_of_oop.task5.flower;

public class FlowerFactory {

    public Flower createFlower(FlowerType type, String name, double price) {
        switch (type) {
            case ROSA -> {
            return new Rosa(name, price);}
            case TULIP -> {
            return new Tulip(name, price);}
            case ORCHID -> {
            return new Orchid(name, price);}
            case LILY -> {
            return new Lily(name, price);}
            case PEONY ->{
            return new Peony(name, price);}
            default -> {
                System.out.println("Error");
                return null;
            }
        }
    }
}
