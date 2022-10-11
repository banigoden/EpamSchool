package by.epam.java_introduction.algorithmization.task40;

import java.util.Scanner;

public class Decomposition6 {
    /*
    Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
     */
    public static void main(String[] args) {

        System.out.print("Enter first number: " );
        int a = ScannerInt();

        System.out.print("Enter second number: ");
        int b = ScannerInt();

        System.out.print("Enter third number: ");
        int c = ScannerInt();

        int [] number = {a, b, c};

        for (int i = 0; i < number.length; i++) {
            if (isPrime(number[i])){
                System.out.println(number[i] + " is prime ");
            }else {
                System.out.println(number[i] + " is not prime ");
            }
        }

    }

    private static boolean isPrime(int anum){
        if( anum < 2)
            return false;
        double s = Math.sqrt(anum);
        for (int i = 2; i <= s; i++) {
            if(anum % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int ScannerInt(){

        Scanner init = new Scanner(System.in);
        int number;
        while (!init.hasNextInt()){
            init.next();
            System.out.print("Not valid value. Please enter new: ");
        }

        number = init.nextInt();

        if (number == 0 || number < 0 ){

            System.out.print("Please enter above 0 : ");
            number = ScannerInt();
        }

        return number;
    }
}
