package by.epam.java_introduction.basic_of_oop.task1;

/*
 Создать объект класса Текстовый файл, используя классы Файл, Директория.
 Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
*/
public class TextFile extends File {
    private Text text;
    public TextFile( String fileName, Directory directory) {
        super(fileName,directory);
    }

    public void create(Directory nameOfDirectory, String name){
        new Text(nameOfDirectory,name);
    }

    public void rename(File file, String newName){
        file.setNameOfFile(newName);
    }

    public void delete(File file){
        file.getDirectory().getTextFiles().removeIf(files ->files.equals(file));
    }

    public void print(){
        System.out.println(text.getText());
    }


}
