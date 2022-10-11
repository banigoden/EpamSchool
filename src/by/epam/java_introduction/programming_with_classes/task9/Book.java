package by.epam.java_introduction.programming_with_classes.task9;

    /*
    Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
        Найти и вывести:
        a) список книг заданного автора;
        b) список книг, выпущенных заданным издательством;
        c) список книг, выпущенных после заданного года.
     */
public class Book {

    private int id;
    private String nameOfBook, author, publishingHouse;
    private int yearOfBook, quantityOfPage, price;
    private String binding;


    public Book(int id, String nameOfBook, String author, String publishingHouse, int yearOfBook, int quantityOfPage, int price, String binding) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfBook = yearOfBook;
        this.quantityOfPage = quantityOfPage;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthors() {
        return author;
    }

    public void setAuthor(String autors) {
        this.author = autors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    public int getQuantityOfPage() {
        return quantityOfPage;
    }

    public void setQuantityOfPage(int quantityOfPage) {
        this.quantityOfPage = quantityOfPage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book" +
                "id " + id +
                ", nameOfBook " + nameOfBook  +
                ", autors " + author  +
                ", publishingHouse " + publishingHouse +
                ", yearOfBook " + yearOfBook +
                ", quantityOfPage " + quantityOfPage +
                ", price " + price +
                ", binding " + binding;
    }
}
