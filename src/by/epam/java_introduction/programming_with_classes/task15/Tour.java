package by.epam.java_introduction.programming_with_classes.task15;
/*
   Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
    различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
    Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/

public class Tour {

    private String country;
    private String city;
    private Food foodtype;
    private Transport transport;
    private Vaucher vauchers;
    private int quauntityOfDays;
    private double price;

    public Tour(String country, String city, Food foodtype, Transport transport, Vaucher vauchers, int quauntityOfDays, double price) {
        this.country = country;
        this.city = city;
        this.foodtype = foodtype;
        this.transport = transport;
        this.vauchers = vauchers;
        this.quauntityOfDays = quauntityOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Food getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(Food foodtype) {
        this.foodtype = foodtype;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Vaucher getVauchers() {
        return vauchers;
    }

    public void setVauchers(Vaucher vauchers) {
        this.vauchers = vauchers;
    }

    public int getQuauntityOfDays() {
        return quauntityOfDays;
    }

    public void setQuauntityOfDays(int quauntityOfDays) {
        this.quauntityOfDays = quauntityOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour" +
                "country " + country +
                ", city " + city +
                ", foodtype " + foodtype +
                ", transport " + transport +
                ", vauchers " + vauchers +
                ", quauntityOfDays " + quauntityOfDays +
                ", price " + price;
    }
}
