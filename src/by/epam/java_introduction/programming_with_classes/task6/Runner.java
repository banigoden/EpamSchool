package by.epam.java_introduction.programming_with_classes.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter hours: ");
            String hours = reader.readLine();
            System.out.print("Enter minutes: ");
            String minutes = reader.readLine();
            System.out.print("Enter seconds: ");
            String seconds = reader.readLine();
            GetTime time = new GetTime(Integer.valueOf(hours),Integer.valueOf(minutes), Integer.valueOf(seconds));
            System.out.println(time);
            time.changeSeconds(2);
            time.changeMinutes(25);
            System.out.println(time);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
