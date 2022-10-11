package by.epam.java_introduction.Strings_and_basics_of_text_processing.task15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Sorts {
    public static void sortLexsem(String text, char symbol) {

        if (text == null){
            System.out.println("No text");
        }else {

            String[] paragraphs = splitByParagraph(text);

            for (int i = 0; i < paragraphs.length; i++) {
                String[] words = splitByWords(paragraphs[i]);

                String result = Arrays.stream(words)
                        .sorted(Comparator.comparing((String word) -> word.chars()
                                        .filter(ch -> ch == symbol)
                                        .count())
                                .thenComparing(String.CASE_INSENSITIVE_ORDER))
                        .collect(Collectors.joining(" "));
                System.out.println(result);
            }
        }
    }

    public static void sortWordsLength(String text) {
        if (text == null){
            System.out.println("No text");
        }else {
            String[] paragraphs = splitByParagraph(text);

            for (int i = 0; i < paragraphs.length; i++) {
                String[] words = splitByWords(paragraphs[i]);
                Arrays.sort(words, Comparator.comparing(String::length));
                String result = String.join(" ", words);
                System.out.println(result);
            }
        }
    }

    public static void sortParagraphs(String text) {
        if (text == null){
            System.out.println("No text");
        }else {
            String[] paragraphs = splitByParagraph(text);
            Arrays.sort(paragraphs, (paragraph1, paragraph2) -> paragraph1.split("[!?.:]+").length >= paragraph2.split(("[!?.:]+")).length ? 1 : -1);
            System.out.println(Arrays.toString(paragraphs));
        }
    }

    private static String[] splitByParagraph(String text){
        return text.split("\n");
    }

    private static String[] splitByWords(String text){
        return text.split(" ");
    }
}
