package by.epam.java_introduction.programming_with_classes.task10;

import by.epam.java_introduction.programming_with_classes.task9.Book;

import java.time.LocalDateTime;
import java.util.ArrayList;

/*
          Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
          и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
          методами. Задать критерии выбора данных и вывести эти данные на консоль.
             Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
             Найти и вывести:
             a) список рейсов для заданного пункта назначения;
             b) список рейсов для заданного дня недели;
             c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
         */
public class AirlineStorage {
        private ArrayList <Airline> airlines;

        public AirlineStorage(ArrayList<Airline> airlines) {
                this.airlines = airlines;
        }


        public void addAirline(Airline airline) {
                airlines.add(airline);
        }

        public void listOfAirlinesByDestination(String destination){
                airlines.stream().filter(airline -> airline.getDestination().equalsIgnoreCase(destination)).forEach(System.out::println);
        }

        public void listOfAirlinesByWeekDay(DayOfWeek dayOfWeek){
                airlines.stream().filter(airline -> airline.getDayOfWeek().equals(dayOfWeek)).forEach(System.out::println);
        }

        public void listByWeekDayAndTime(LocalDateTime timeDeparture){
                airlines.stream().filter(airline -> airline.getDepartureTime().isAfter(timeDeparture)).forEach(System.out::println);
        }


}
