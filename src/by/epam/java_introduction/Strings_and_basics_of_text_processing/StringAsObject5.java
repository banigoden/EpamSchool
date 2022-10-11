package by.epam.java_introduction.Strings_and_basics_of_text_processing;
    /*
    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
     */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringAsObject5 {

    public static void main(String[] args) {
        String text = "My boss has a pretty hands-off approach. Sometimes we go the entire day without touching base.";

        System.out.println(countAViaStream(text));
        System.out.println(countAViaLoop(text));
        System.out.println(countAViaMatcher(text));

    }

    private static int countAViaMatcher(String text) {
        if (text.isEmpty()) return 0;
        Pattern pattern = Pattern.compile("[^a]*a");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static int countAViaLoop(String text) {
        if (text.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }

    private static long countAViaStream(String text) {
    if (text.isEmpty()) return 0;
    return text.chars().filter(n -> n == 'a').count();
    }
}
