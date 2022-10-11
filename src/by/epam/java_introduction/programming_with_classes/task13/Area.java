package by.epam.java_introduction.programming_with_classes.task13;

        /*
        Создать объект класса Государство, используя классы Область, Район, Город.
        Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
         */

public class Area {
    private double allArea;

    public Area(double allArea) {
        this.allArea = allArea;

    }

    public double getAllArea() {
        return allArea;
    }

    public void setAllArea(double allArea) {
        this.allArea = allArea;
    }


    @Override
    public String toString() {
        return "Area{" +
                "allArea=" + allArea +
                '}';
    }
}
