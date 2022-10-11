package by.epam.java_introduction.algorithmization.task41;

public class Decomposition7 {
    /*
    Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */

    public static void main(String[] args) {

        int [] array = {1, 3, 5, 7, 9};
        System.out.println(amountFactorial(array));
    }

    private static int amountFactorial(int [] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += facrtorial(i);
        }
        return sum;
    }

    private static int facrtorial(int number){
        int result = 1;
        if(number <= 1){
            return result;
        }
        result = number * facrtorial(number - 1);
        return result;
    }
}
