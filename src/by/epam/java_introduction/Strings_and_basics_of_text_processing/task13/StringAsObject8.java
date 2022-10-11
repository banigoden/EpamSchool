package by.epam.java_introduction.Strings_and_basics_of_text_processing.task13;
    /*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
     его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class StringAsObject8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String text = reader.readLine();
            System.out.println(theBiggestWord(text));
            System.out.println(theBiggestWordStream(text));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static String theBiggestWordStream(String text) {
        if (text.isEmpty()) return "No text.";
        String[] splitText = text.split("(_|\\s)+");
        Arrays.sort(splitText, Comparator.comparing(String::length, Comparator.reverseOrder()));

        return splitText[0];
    }

    private static String theBiggestWord(String text) {
        if (text.isEmpty()) return "No text.";
        String[] splitText = text.split("(_|\\s)+");

        int max = 0;
        String biggestWord = "";
        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].length() > max){
                max = splitText[i].length();
                biggestWord = splitText[i];
            }
        }
        return biggestWord;
    }
}
