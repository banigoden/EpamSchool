package by.epam.java_introduction.basic_of_oop.task1;

/*
 Создать объект класса Текстовый файл, используя классы Файл, Директория.
 Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Text{
    private String text;

    public Text(Directory directory, String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(" ").append(text).toString();
    }
}
