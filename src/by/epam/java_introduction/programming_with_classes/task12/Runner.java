package by.epam.java_introduction.programming_with_classes.task12;

    /*
    Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
    Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
     */
public class Runner {

    public static void main(String[] args) {
        Wheel wheel = new Wheel(16,"Nokian", Wheel.Type.Winter);
        Engine engine = new Engine(1, 150);
        Car renault = new Car(engine,"Renault",5,wheel);

        renault.move();
        renault.printTheCar();
        renault.changeTheWheel();
        renault.fillIn();
        renault.printTheCar();

    }
}
