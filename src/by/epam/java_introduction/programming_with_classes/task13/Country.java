package by.epam.java_introduction.programming_with_classes.task13;

import javax.swing.plaf.synth.Region;
import java.util.ArrayList;

        /*
        Создать объект класса Государство, используя классы Область, Район, Город.
        Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
         */

public class Country {

    private String countryName;
    private City capital;
    private ArrayList<Regions> regions;


    public Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void printNumberOfRegions(){
        System.out.println("The quantities of regions: " + regions.size());
    }

    public void printCapital(){
        System.out.println("The capital is " + capital.getRegionalCenters());

    }
    public void printArea(){
        System.out.println("The area is " + capital.getArea().getAllArea());
    }

    public void addRegion(Regions region) {
        regions.add(region);
    }

    public void removeRegion(String regionName){
        System.out.println("Deleted region " + regionName);
        regions.removeIf(regions1 -> regions1.getRegionName().contains(regionName));
    }

    public void printRegionCenters() {
        regions.stream().forEach(region -> System.out.println("Region: " + region.getRegionName() + ", city: " + region.getRegionCenter().getRegionalCenters()));
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }

}
