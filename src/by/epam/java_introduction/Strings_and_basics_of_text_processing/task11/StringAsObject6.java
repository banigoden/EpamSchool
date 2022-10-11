package by.epam.java_introduction.Strings_and_basics_of_text_processing.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Из заданной строки получить новую, повторив каждый символ дважды.
     */
public class StringAsObject6 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String text = reader.readLine();
            System.out.println(RepeatSymbolsTwice(text));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String RepeatSymbolsTwice(String text) {
        if (text.isEmpty()) return "No text.";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(text.charAt(i)).append(text.charAt(i));
        }
        return stringBuilder.toString();
    }
}
