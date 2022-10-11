package by.epam.java_introduction.basic_of_oop.task5;

public class TestStatic {

    static int i = 5;
    int j;
    static {
        System.out.println("static inizializer");
        i = 6;
    }
    {
        System.out.println("inizializer");
    }

    static void staticMethod(){
        System.out.println("static method");
        System.out.println();
    }

    TestStatic(){

        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println(TestStatic.i);
        
    }
}
