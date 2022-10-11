package by.epam.java_introduction.basic_of_oop.task1;

import java.util.ArrayList;

public class Directory {
    private String nameOfDirectory;
    private ArrayList<TextFile> nameOfFiles;

    public Directory(String nameOfDirectory) {
        this.nameOfDirectory = nameOfDirectory;
        this.nameOfFiles = new ArrayList<>();
    }

    public String getNameOfDirectory() {
        return nameOfDirectory;
    }

    public void changeNameOfDirectory(String nameOfDirectory) {
        this.nameOfDirectory = nameOfDirectory;
    }

    public ArrayList<TextFile> getTextFiles() {
        return nameOfFiles;
    }

    public void addTextFiles(TextFile textFile) {
        this.nameOfFiles.add(textFile);
    }
}
