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

import java.util.ArrayList;


public class BookStore {
    private ArrayList<Book> books;

    public BookStore(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void sortBooksByAuthor(String author){
        books.stream().filter(book -> book.getAuthors().equalsIgnoreCase(author)).forEach(System.out::println);
    }

    public void sortBooksByPublishingHouse(String publishingHouse){
        books.stream().filter(book -> book.getPublishingHouse().equalsIgnoreCase(publishingHouse)).forEach(System.out::println);
    }

    public void sortBooksAfterYear(int year){
        books.stream().filter(book -> book.getYearOfBook() > year).forEach(System.out::println);
    }


}
