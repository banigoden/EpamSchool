package by.epam.java_introduction.basic_of_oop.task5.flowerArragment;

import by.epam.java_introduction.basic_of_oop.task5.box.BoxFactory;
import by.epam.java_introduction.basic_of_oop.task5.box.Package;
import by.epam.java_introduction.basic_of_oop.task5.box.PackageType;
import by.epam.java_introduction.basic_of_oop.task5.flower.Flower;
import by.epam.java_introduction.basic_of_oop.task5.flower.FlowerFactory;
import by.epam.java_introduction.basic_of_oop.task5.flower.FlowerType;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChoseYourOwnFlowers extends FlowerArragement {

    private  Scanner scanner = new Scanner(System.in);
    private List<Flower> flowers = new ArrayList<>();
    private  Package box;


    @Override
    public void collect() {
         FlowerFactory flowerFactory = new FlowerFactory();
        System.out.print("Please choose flowers: \n" +
                "1 - Rosa \n" +
                "2 - Lily \n" +
                "3 - Orchid \n" +
                "4 - Peony \n" +
                "5 - Tulip \n" +
                 "Enter: ");

        int result = checkInputOption("[1-5]");

        switch (result) {
            case 1 -> flowers.add(flowerFactory.createFlower(FlowerType.ROSA, FlowerType.ROSA.getName(), FlowerType.ROSA.getPrice()));
            case 2 -> flowers.add(flowerFactory.createFlower(FlowerType.LILY, FlowerType.LILY.getName(), FlowerType.LILY.getPrice()));
            case 3 -> flowers.add(flowerFactory.createFlower(FlowerType.ORCHID, FlowerType.ORCHID.getName(), FlowerType.ORCHID.getPrice()));
            case 4 -> flowers.add(flowerFactory.createFlower(FlowerType.PEONY, FlowerType.PEONY.getName(), FlowerType.PEONY.getPrice()));
            case 5 -> flowers.add(flowerFactory.createFlower(FlowerType.TULIP, FlowerType.TULIP.getName(), FlowerType.TULIP.getPrice()));
            default -> flowers.add(flowerFactory.createFlower(FlowerType.ROSA, FlowerType.ROSA.getName(), FlowerType.ROSA.getPrice()));
        }
        String answer;
        while(scanner.hasNextLine()){

            System.out.print("Would you like add more? yes / no. Enter: ");
            answer = scanner.next();
            if(answer.toLowerCase().equals("yes")){
                collect();
            }else if (answer.toLowerCase().equals("no")){
                break;
            }
        }
    }

    @Override
    public void pack() {

        BoxFactory boxFactory = new BoxFactory();
        System.out.print("Please choose Package:" +
                "1 - Paper \n" +
                "2 - Plastic \n" +
                "3 - Box \n" +
                "4 - Busket \n" +
                "Enter: ");
            int result = checkInputOption("[1-4]");

        switch (result) {
            case 1 -> box = boxFactory.createPackage(PackageType.PAPER, PackageType.PAPER.getName(),PackageType.PAPER.getPrice());
            case 2 -> box = boxFactory.createPackage(PackageType.PLASTIC, PackageType.PLASTIC.getName(),PackageType.PLASTIC.getPrice());
            case 3 -> box = boxFactory.createPackage(PackageType.BOX, PackageType.BOX.getName(),PackageType.BOX.getPrice());
            case 4 -> box = boxFactory.createPackage(PackageType.BASKET, PackageType.BASKET.getName(),PackageType.BASKET.getPrice());
        }
    }

    @Override
    public void pay() {
       double flowerPrice = flowers.stream().mapToDouble(price -> price.getPrice()).sum();
       System.out.println("Bucket of :");
       flowers.stream().forEach(flower -> System.out.println(flower.getName().toUpperCase()));
       System.out.println( "Flower price: " + flowerPrice + " , box price: "  + box.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int checkInputOption(String pat){
        Pattern pattern = Pattern.compile(pat);
        while (!scanner.hasNext(pattern)){
            scanner.nextLine();
            System.out.println("Invalid input");
        }
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return "ChoseYourOwnFlowers{" +
                "scanner=" + scanner +
                ", flowers=" + flowers +
                ", box=" + box +
                '}';
    }
}
