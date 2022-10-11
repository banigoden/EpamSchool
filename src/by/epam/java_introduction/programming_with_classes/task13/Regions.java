package by.epam.java_introduction.programming_with_classes.task13;

import java.util.ArrayList;

/*
        Создать объект класса Государство, используя классы Область, Район, Город.
        Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
         */
public class Regions {

    private String regionName;
    private City regionCenter;
    private ArrayList<Regions> regions;

    public Regions(String regionName, City regionCenter) {
        this.regionName = regionName;
        this.regionCenter = regionCenter;

    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public ArrayList<Regions> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Regions> regions) {
        this.regions = regions;
    }
}
