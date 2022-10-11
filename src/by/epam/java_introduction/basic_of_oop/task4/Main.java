package by.epam.java_introduction.basic_of_oop.task4;

 /*
 Создать консольное приложение, удовлетворяющее следующим требованиям:
  • Приложение должно быть объектно-, а не процедурно-ориентированным.
  • Каждый класс должен иметь отражающее смысл название и информативный состав.
  • Наследование должно применяться только тогда, когда это имеет смысл.
  • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
  • Классы должны быть грамотно разложены по пакетам.
  • Консольное меню должно быть минимальным.
  • Для хранения данных можно использовать файлы.
  Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
  дракона.  Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
  выбора сокровищ на заданную сумму.
  */


import by.epam.java_introduction.basic_of_oop.task4.menu.ConsoleMenu;

public class Main {

    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu();
        menu.startConsoleMenu();


    }
}
