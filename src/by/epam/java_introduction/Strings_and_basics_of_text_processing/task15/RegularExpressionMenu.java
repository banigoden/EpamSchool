package by.epam.java_introduction.Strings_and_basics_of_text_processing.task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
       Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
       выполнять с текстом три различных операции: отсортировать абзацы по количеству
       предложений; в каждом предложении отсортировать слова по длине; отсортировать
       лексемы в предложении по убыванию количества вхождений заданного символа,
       а в случае равенства – по алфавиту.
     */
public class RegularExpressionMenu {
    public static void main(String[] args) {

            String text ="int indexOf(int ch): It returns the index of the first occurrence of character ch in a given String.\n" +
                    "\n" +
                    "int indexOf(int ch, int fromIndex): It returns the index of first occurrence of character ch in the given string after the specified index “fromIndex”. For example, if the indexOf() method is called like this str.indexOf(‘A’, 20) then it would start looking for the character ‘A’ in string str after the index 20.\n" +
                    "\n" +
                    "int indexOf(String str): Returns the index of string str in a particular String.\n" +
                    "\n" +
                    "int indexOf(String str, int fromIndex): Returns the index of string str in the given string after the specified index “fromIndex”.\n" +
                    "\n";
            chooseTheNumber(text);
    }

    private static void chooseTheNumber(String text) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = reader.readLine();
        switch (value) {
            case "1" -> Sorts.sortParagraphs(text);
            case "2" -> Sorts.sortWordsLength(text);
            case "3" ->{  char symbol = ' ';
                System.out.println("Enter symbol via we are going to sort:");
                symbol = reader.readLine().charAt(0);
                Sorts.sortLexsem(text, symbol);
            }
            case "exit" -> {
                System.out.println("Sort over");
                break;
            }
            default -> System.out.println("Wrong number.");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
