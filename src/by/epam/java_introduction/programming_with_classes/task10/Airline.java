package by.epam.java_introduction.programming_with_classes.task10;


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

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Airline {
    private String destination;
    private int flightNumber;
    private AircraftType flightType;
    private LocalDateTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, AircraftType flightType, LocalDateTime departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getFlightType() {
        return flightType;
    }

    public void setFlightType(AircraftType flightType) {
        this.flightType = flightType;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline" +
                "destination " + destination +
                ", flightNumber " + flightNumber +
                ", flightType " + flightType +
                ", departureTime " + departureTime +
                ", dayOfWeek " + dayOfWeek;
    }
}
