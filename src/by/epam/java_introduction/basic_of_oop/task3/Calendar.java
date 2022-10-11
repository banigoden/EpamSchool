package by.epam.java_introduction.basic_of_oop.task3;

    /*
    Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
    выходных и праздничных днях.
     */

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Calendar {

    private ArrayList<Weekends> weekends;
    private int year;

    public Calendar(int year) {
        this.year = year;
        weekends = new ArrayList<>();
    }

    public void addWeekend(Weekends holiday) {
            weekends.add(holiday);
    }

    public void deleteHoliday(String nameOfHoliday){
        weekends.removeIf(day -> day.getNameOfHoliday().equals(nameOfHoliday));
    }

    public void deleteHoliday(Weekends holiday){
        weekends.remove(holiday);
    }

    public void deleteHoliday(int day, int month){
        weekends.removeIf(holiday -> holiday.getDay() == day && holiday.getMonth() == month);
    }

    public void print(){
        weekends.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Year " + year;
    }

    public class Weekends {

        private String nameOfHoliday;

        private int day;
        private int month;

        public Weekends(String nameOfHoliday, int day, int month) {
            this.nameOfHoliday = nameOfHoliday;
            this.day = day;
            this.month = month;

        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }


        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            if(day > 0 && day <= 31 ){
                this.day = day;
            }else {
                System.out.println("Check value!");
            }
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            if(month > 0 && month <= 12 ){
                this.month = month;
            }else {
                System.out.println("Check value!");
            }

        }

        @Override
        public String toString() {
            return "Holiday " + nameOfHoliday +
                    " " + day + "." + month;
        }
    }
}
