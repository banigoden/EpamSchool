package by.epam.java_introduction.basic_of_oop.task5.box;

public class BoxFactory {

    public Package createPackage(PackageType type, String name, double price){
        switch (type) {
            case PAPER -> {
                return new Paper(name, price);
            }
            case PLASTIC ->  {
                return new Plastic(name, price);
            }
            case BOX -> {
                return new Box(name, price);
            }
            case BASKET ->  {
                return new Busket(name, price);
            }
            default -> {
                return null;
            }
        }
    }
}
