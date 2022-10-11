package by.epam.java_introduction.programming_with_classes.task15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
/*
   Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
   различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class SearchTour implements TourSearchAction{

    private String nameOfTourOperator;
    private ArrayList<Tour> tours;
    private ArrayList<Client> clients;

    public SearchTour(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
        this.tours = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getNameOfTourOperator() {
        return nameOfTourOperator;
    }

    public void setNameOfTourOperator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void addTour(Tour tour){
        tours.add(tour);
    }

    public void addClient(Client client){
        clients.add(client);
    }

    @Override
    public void sortTourByPrice(){
        tours.stream().sorted(Comparator.comparing(Tour::getPrice)).forEach(System.out::println);
    }

    @Override
    public void sortTourByDays(){
        tours.stream().sorted(Comparator.comparing(Tour::getQuauntityOfDays)).forEach(System.out::println);
    }

    @Override
    public void sortByTour(){
        tours.stream().sorted(Comparator.comparing(Tour::getVauchers)).forEach(System.out::println);
    }

    @Override
    public void sortByVaucher(Vaucher vaucher){
        tours.stream()
                .filter(tour -> tour.getVauchers().equals(vaucher))
                .forEach(System.out::println);
    }

    @Override
    public void sortByVaucherAndTransport(Vaucher vaucher, Transport transport){
        tours.stream()
                .filter(tour -> tour.getVauchers().equals(vaucher))
                .filter(tour -> tour.getTransport().equals(transport))
                .forEach(System.out::println);
    }

    @Override
    public void sortByValues(Transport transport,Food food, int days){
        tours.stream()
                .filter(tour -> tour.getTransport().equals(transport))
                .filter(tour -> tour.getFoodtype().equals(food))
                .filter(tour -> tour.getQuauntityOfDays() == days)
                .forEach(System.out::println);
    }
}
