package by.epam.java_introduction.programming_with_classes.task12;
    /*
     Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
     Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
     */
public class Car {

        private Engine engine;
        private String brand;
        private double fuelLevel;
        private Wheel wheel;
        private double speed = 55.5;

        public Car(Engine engine, String brand, double fuelLevel, Wheel wheel) {
            this.engine = engine;
            this.brand = brand;
            this.fuelLevel = fuelLevel;
            this.wheel = wheel;
        }
        public void move(){
        System.out.println("Speed is " + speed);
        }

        public void fillIn(){
            fuelLevel = 10;
            System.out.println("The tank is full " + fuelLevel);
        }

        public void changeTheWheel(){
            wheel.setBrand("Michlen");
            wheel.setType(Wheel.Type.Summer);
            wheel.setDiameter(17);
            System.out.println("The wheels are changed");
        }

        public void printTheCar(){
            System.out.println("The brand is " +  brand + "." + engine.toString() + wheel.toString() + ". Fuel level is " + fuelLevel);
        }

}
