package by.epam.java_introduction.Strings_and_basics_of_text_processing.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        /*
        Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
        Например, если было введено "abc cde def", то должно быть выведено "abcdef".
         */
public class StringAsObject7 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String text = reader.readLine();
            System.out.println(deleteAllRepeatedSymbols(text));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String deleteAllRepeatedSymbols(String text) {
    if (text.isEmpty()) return "No text.";
    StringBuilder stringBuilder = new StringBuilder(text);
    for (int i = 0; i < stringBuilder.length(); i++) {
        char symbol = stringBuilder.charAt(i);
        if (symbol == ' '){
            stringBuilder.deleteCharAt(i);
            i--;
            continue;
        }
        for (int j = i + 1; j < stringBuilder.length(); j++) {
            if (stringBuilder.charAt(j) == symbol){
                stringBuilder.deleteCharAt(j);
            }
        }
    }
    return stringBuilder.toString();
    }
}
