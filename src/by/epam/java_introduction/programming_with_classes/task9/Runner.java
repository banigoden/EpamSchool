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

public class Runner {

    public static void main(String[] args) {

        Book gasby = new Book(1,"The Great Gatsby", "Scott Fuitzgerald", "Bembo",1993, 79, 355, "hardcover");
        Book elevenMinutes = new Book(2,"Eleven Minutes", "Paulo Coelho", "HarperCollins", 2003, 275, 700, "paperback");
        Book theAlchemist = new Book(3,"The Alchemist", "Paulo Coelho", "HarperCollins", 2010, 160, 853, "paperback");
        BookStore store = new BookStore(new ArrayList<>());
        store.addBook(gasby);
        store.addBook(elevenMinutes);
        store.addBook(theAlchemist);

        System.out.println("Sort by year:");
        store.sortBooksAfterYear(2003);
        System.out.println("Sort by Autor(s):");
        store.sortBooksByAuthor("Paulo Coelho");
        System.out.println("Sort by publishing house:");
        store.sortBooksByPublishingHouse("HarperCollins");



    }
}
