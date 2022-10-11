package by.epam.java_introduction.programming_with_classes.task5;

    /*
    Опишите класс, реализующий десятичный счетчик, который
    может увеличивать или уменьшать свое значение на единицу в заданном
    диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    произвольными значениями. Счетчик имеет методы увеличения и уменьшения
    состояния, и метод позволяющее получить его текущее состояние. Написать код,
    демонстрирующий все возможности класса.
     */

public class Counter {

    private int count, max, min;

    public Counter(int count, int max, int min) {
        this.count = count;
        this.max = max;
        this.min = min;
    }

    public void setCounter(int i){
        if (i < min || i > max){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            count = i;
        }
    }

    public void increaseValue(){
        if(count >= max){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            count++;
        }
    }
    public void decreaseValue(){
        if(count <= min){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            count--;
        }
    }

    public int currentCondition(){
        return count;
    }



}
