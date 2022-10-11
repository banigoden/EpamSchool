package by.epam.java_introduction.programming_with_classes.task15;

public interface TourSearchAction {

    void sortTourByDays();
    void sortTourByPrice();
    void sortByTour();
    void sortByVaucher(Vaucher vaucher);
    void sortByValues(Transport transport,Food food, int days);
    void sortByVaucherAndTransport(Vaucher vaucher,Transport transport);
}
