package by.epam.java_introduction.programming_with_classes.task15;

/*
   Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
   различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Client {
    private String name, surname;
    private int passportId;
    private int number;
    private SearchTour tour;

    public Client(String name, String surname, int passportId, int number) {
        this.name = name;
        this.surname = surname;
        this.passportId = passportId;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
