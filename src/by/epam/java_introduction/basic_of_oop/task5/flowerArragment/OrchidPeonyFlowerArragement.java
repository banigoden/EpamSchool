package by.epam.java_introduction.basic_of_oop.task5.flowerArragment;

import by.epam.java_introduction.basic_of_oop.task5.box.BoxFactory;
import by.epam.java_introduction.basic_of_oop.task5.box.Package;
import by.epam.java_introduction.basic_of_oop.task5.box.PackageType;
import by.epam.java_introduction.basic_of_oop.task5.flower.Flower;
import by.epam.java_introduction.basic_of_oop.task5.flower.FlowerFactory;
import by.epam.java_introduction.basic_of_oop.task5.flower.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class OrchidPeonyFlowerArragement extends FlowerArragement{
    private String name;
    private Package box;
    private int price;
    private List<Flower> flowers = new ArrayList<>();

    public OrchidPeonyFlowerArragement() {
        name = "Orchid and Piony";
        price = 40;
    }

    @Override
    public void collect() {
        FlowerFactory flowerFactory = new FlowerFactory();
        flowers.add(flowerFactory.createFlower(FlowerType.ORCHID, FlowerType.ORCHID.getName(), FlowerType.ORCHID.getPrice()));
        flowers.add(flowerFactory.createFlower(FlowerType.PEONY, FlowerType.PEONY.getName(), FlowerType.PEONY.getPrice()));
        pack();
    }

    @Override
    public void pack() {
        BoxFactory boxFactory = new BoxFactory();
        box = boxFactory.createPackage(PackageType.PAPER, PackageType.PAPER.getName(), PackageType.PAPER.getPrice());

    }

    @Override
    public void pay() {
        double flowerPrice = flowers.stream().mapToDouble(price -> price.getPrice()).sum();
        System.out.println("Bucket of :");
        flowers.stream().forEach(flower -> System.out.println(flower.getName().toUpperCase()));
        System.out.println( "Flower price: " + flowerPrice + " , box price: "  + box.getPrice());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", wrapped='" + box.getName() + '\'' +
                ", price=" + price;
    }
}
