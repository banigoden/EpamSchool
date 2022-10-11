package by.epam.java_introduction.programming_with_classes.task15;

/*
   Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
   различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Runner {
    public static void main(String[] args) {

        Tour shriLanka = new Tour("Sri Lanka","Colombo", Food.ALL_INKLUSIVE, Transport.PLANE,Vaucher.RELAXATION,14, 3240);
        Tour cruiseByMediterranean = new Tour("Italy","Rom", Food.ALL_INKLUSIVE, Transport.SHIP,Vaucher.SHOPPING,7, 5012);
        Tour mexicoBus = new Tour("Mexico","Veracruze", Food.BREAKFAST_AND_DINNER, Transport.BUS,Vaucher.HEALTHCARE,11, 2221);
        Tour mexicoPlane = new Tour("Mexico","Veracruze", Food.BREAKFAST_AND_DINNER, Transport.PLANE,Vaucher.HEALTHCARE,11, 2221);

        Client max = new Client("Max","Osher",4214452,2);
        Client luisa = new Client("Luisa","Merlin",2414451,4);

        SearchTour searchTour = new SearchTour("Domino");
        searchTour.addTour(shriLanka);
        searchTour.addTour(cruiseByMediterranean);
        searchTour.addTour(mexicoBus);
        searchTour.addTour(mexicoPlane);
        searchTour.addClient(max);
        searchTour.addClient(luisa);

        System.out.println("Sort by price");
        searchTour.sortTourByPrice();
        System.out.println("Sort by days");
        searchTour.sortTourByDays();
        System.out.println("Sort by tour");
        searchTour.sortByTour();

        System.out.println("Sort by transport, food and days");
        searchTour.sortByValues(Transport.PLANE, Food.ALL_INKLUSIVE, 14);




        
    }
}
