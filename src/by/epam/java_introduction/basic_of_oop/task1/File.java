package by.epam.java_introduction.basic_of_oop.task1;

public class File {
    private String nameOfFile;
    private Directory directory;

    public File(String nameOfFile, Directory directory) {
        this.nameOfFile = nameOfFile;
        this.directory = directory;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void addDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameOfFile='" + nameOfFile + '\'' +
                ", directory=" + directory +
                '}';
    }
}
