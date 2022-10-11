package by.epam.java_introduction.programming_with_classes.task13;

public class City {
    private String regionalCenters;
    private Area area;

    public City(String regionalCenters, double area) {
        this.regionalCenters = regionalCenters;
        this.area = new Area(area);
    }

    public String getRegionalCenters() {
        return regionalCenters;
    }

    public void setRegionalCenters(String regionalCenters) {
        this.regionalCenters = regionalCenters;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "regionalCenters='" + regionalCenters + '\'' +
                ", area=" + area +
                '}';
    }
}
