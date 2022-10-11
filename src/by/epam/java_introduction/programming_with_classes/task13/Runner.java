package by.epam.java_introduction.programming_with_classes.task13;

        /*
        Создать объект класса Государство, используя классы Область, Район, Город.
        Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
         */
public class Runner {

    public static void main(String[] args) {

        City saintPetersburg = new City("Saint Petersburg", 2_000_100);
        Country russia = new Country("Russia", saintPetersburg);

        russia.addRegion(new Regions("Primorskyay region", saintPetersburg));
        Regions krasnoe = new Regions("Krasnoe region", new City("Krasnoe", 54_144));
        russia.addRegion(new Regions("Krasnoe region", new City("Krasnoe", 54_144)));
        russia.addRegion(new Regions("Gatchina region", new City("Gatchina", 52_744)));
        russia.addRegion(new Regions("Pushkin region", new City("Pushkin", 96_654)));
        russia.addRegion(new Regions("Zelenogorsk region", new City("Zelenogorsk", 132_213)));
        russia.addRegion(new Regions("Sestroresk region", new City("Sestroresk", 120_431)));

        russia.printCapital();
        russia.printNumberOfRegions();
        russia.printArea();
        russia.printRegionCenters();
        russia.removeRegion("Krasnoe region");
        russia.printRegionCenters();

    }
}
