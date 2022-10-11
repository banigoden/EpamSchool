package by.epam.java_introduction.programming_with_classes.task4;

/*
        Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
        назначения должны быть упорядочены по времени отправления.
     */


import java.time.LocalTime;
import java.util.Arrays;

public class Train {
    private String nameDestination;
    private int trainNumber;
    private LocalTime departureTime;


    public Train(String nameDestination, int trainNumber, LocalTime departureTime) {
        this.nameDestination = nameDestination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public static void getInfoByNumber(Train[] trains, int number) {
        if (number == 0){
            System.out.println("Type right number!");
        }
         Arrays.stream(trains).filter(train -> train.getTrainNumber() == number).forEach(System.out::print);
    }


    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setdepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    @Override
    public String toString() {
        return "Train" +
                "nameDestination = " + nameDestination + '\'' +
                ", trainNumber = " + trainNumber +
                ", leaveTime = " + departureTime ;
    }
}
