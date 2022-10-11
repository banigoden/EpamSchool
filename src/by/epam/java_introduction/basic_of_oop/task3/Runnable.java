package by.epam.java_introduction.basic_of_oop.task3;

    /*
    Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
    выходных и праздничных днях.
    */

import java.time.LocalDate;

public class Runnable {

    public static void main(String[] args) {

        Calendar calendar2022 = new Calendar(2022);

        Calendar.Weekends birthday = calendar2022.new Weekends("My Birthday", 22,9);
        Calendar.Weekends newYear = calendar2022.new Weekends("New Year", 31, 12 );
        Calendar.Weekends christmas = calendar2022.new Weekends("Christmas", 24, 12);

        calendar2022.addWeekend(birthday);
        calendar2022.addWeekend(newYear);
        calendar2022.addWeekend(christmas);

        calendar2022.print();
        calendar2022.deleteHoliday(birthday);
        System.out.println("__________________");
        calendar2022.print();
        System.out.println("__________________");
        calendar2022.deleteHoliday("New Year");
        calendar2022.print();
        System.out.println("__________________");
        calendar2022.deleteHoliday(24,12);
        calendar2022.print();



    }

}
