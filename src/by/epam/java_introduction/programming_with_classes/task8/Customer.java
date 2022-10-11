package by.epam.java_introduction.programming_with_classes.task8;

    /*
    Создать класс Customer, спецификация которого приведена ниже. Определить
    конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
    агрегирующий массив типа Customer, с подходящими конструкторами и методами.
    Задать критерии выбора данных и вывести эти данные на консоль.

    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
    номер банковского счета.
         Найти и вывести:
         a) список покупателей в алфавитном порядке;
         b) список покупателей, у которых номер кредитной карточки находится
         в заданном интервале.
     */

public class Customer {

    private String name, surname, patronymic, address;
    private int id, numberOfCreditCard, numberOfDebitCard;

    public Customer(int id, String name, String surname, String patronymic, String address, int numberOfCreditCard, int numberOfDebitCard) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.id = id;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfDebitCard = numberOfDebitCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getNumberOfDebitCard() {
        return numberOfDebitCard;
    }

    public void setNumberOfDebitCard(int numberOfDebitCard) {
        this.numberOfDebitCard = numberOfDebitCard;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Customer" +
                "id=" + id +
                ", name " + name +
                ", surname " + surname  +
                ", patronymic " + patronymic +
                ", address " + address +
                ", numberOfCreditCard " + numberOfCreditCard +
                ", numberOfDebitCard " + numberOfDebitCard;
    }
}
