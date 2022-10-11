package by.epam.java_introduction.programming_with_classes.task5;

public class Runner {
    public static void main(String[] args) {
        Counter counter = new Counter(5, 9, 2);
        counter.increaseValue();
        System.out.println(counter.currentCondition());
        counter.decreaseValue();
        System.out.println(counter.currentCondition());
        counter.setCounter(8);
        counter.decreaseValue();
        System.out.println(counter.currentCondition());


    }
}
