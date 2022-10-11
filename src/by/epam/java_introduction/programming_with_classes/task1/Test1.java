package by.epam.java_introduction.programming_with_classes.task1;

/*
    Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private int age1 = 4;
    private int age = 5;

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge1() {
        return age1;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + age1 + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setAge(15);
        test1.setAge1(25);
        test1.toString();
        System.out.println("Sum :" + sum(test1.getAge(), test1.getAge1()));
        System.out.println("The biggest number: " + theBiggest(test1.getAge(), test1.getAge1()));

    }

    private static int sum(int age, int age1){
        return age + age1;
    }
    private static int theBiggest(int age, int age1){
        return Math.max(age,age1);
    }
}
