package by.epam.java_introduction.Strings_and_basics_of_text_processing.task14;
    /*
    Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
           Учитывать только английские буквы
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAsObject9 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println("There are small letters: "+ findSmallSymbols(strings));
            System.out.println("There are big letters: "+ findBigSymbols(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long findSmallSymbols(String strings) {
        if (strings.isEmpty()) return 0;
        return strings.codePoints().filter(i -> i >= 'a' && i <= 'z').filter(Character::isLowerCase).count();
    }

    private static long findBigSymbols(String strings) {
        if (strings.isEmpty()) return 0;
        return strings.codePoints().filter(i -> i >= 'A' && i <= 'Z').filter(Character::isUpperCase).count();
    }
}
