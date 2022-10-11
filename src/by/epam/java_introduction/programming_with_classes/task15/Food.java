package by.epam.java_introduction.programming_with_classes.task15;

public enum Food {
    ALL_INKLUSIVE(4), BREAKFAST(1), BREAKFAST_AND_DINNER(3), LUNCH(0), BREAKFAST_AND_LUNCH(2);

    private int priority;
    Food(int priority) {
        this.priority = priority;
    }


    @Override
    public String toString() {
        return super.toString().replace('_',' ').toLowerCase();
    }
}
