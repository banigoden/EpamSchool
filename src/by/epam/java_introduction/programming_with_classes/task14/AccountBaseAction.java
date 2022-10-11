package by.epam.java_introduction.programming_with_classes.task14;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    default void unBlocking(){}


}
