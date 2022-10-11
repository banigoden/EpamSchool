package by.epam.java_introduction.programming_with_classes.task10;

import java.time.LocalDateTime;
import java.time.Month;
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
public class Runner {

        public static void main(String[] args) {

              Airline airlines1 = new Airline("Sain P", 263, AircraftType.SUPERHEAVY, LocalDateTime.of(2022,
                      Month.JULY, 17, 19, 30, 00), DayOfWeek.WEDNESDAY);
              Airline airlines2 = new Airline("Berlin", 55, AircraftType.LIGHT, LocalDateTime.of(2022,
                      Month.JULY, 17, 5, 20, 00), DayOfWeek.SATURDAY);
              Airline airlines3 = new Airline("Moscow", 22, AircraftType.MEDIUM, LocalDateTime.of(2022,
                      Month.JULY, 18, 5, 20, 00), DayOfWeek.THURSDAY);
              Airline airlines4 = new Airline("Leipzig", 36, AircraftType.HEAVY, LocalDateTime.of(2022,
                      Month.JULY, 15, 12, 55, 00), DayOfWeek.SUNDAY);
              Airline airlines5 = new Airline("Rom", 33, AircraftType.SUPERLIGHT, LocalDateTime.of(2022,
                      Month.JULY, 19, 23, 00, 30), DayOfWeek.FRIDAY);
              AirlineStorage airlineStorage = new AirlineStorage(new ArrayList<>());
              airlineStorage.addAirline(airlines1);
              airlineStorage.addAirline(airlines2);
              airlineStorage.addAirline(airlines3);
              airlineStorage.addAirline(airlines4);
                airlineStorage.addAirline(airlines5);

                System.out.println("Sort by destinational: ");
                airlineStorage.listOfAirlinesByDestination("Leipzig");
                System.out.println("Sort by day of week: ");
                airlineStorage.listOfAirlinesByWeekDay(DayOfWeek.FRIDAY);
                System.out.println("Sort by day of week and time: ");
                airlineStorage.listByWeekDayAndTime(LocalDateTime.of(2022,
                        Month.JULY, 17, 19, 19, 00));



        }
}
