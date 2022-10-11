package by.epam.java_introduction.Strings_and_basics_of_text_processing.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/*
    Проверить является ли заданное слово палиндромом
     */
public class StringAsObject3 {

        public static void main(String[] args) {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                String polindrome = reader.readLine();
                System.out.println(findPalindrome(polindrome));
                polindrome = reader.readLine();
                System.out.println(findPalindromeViaLoop(polindrome));
                polindrome = reader.readLine();
                System.out.println(findPalindromeViaStream(polindrome));

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    private static boolean findPalindromeViaStream(String palindrome) {
            String temp = palindrome.replaceAll("\\s+","").toLowerCase();
            return IntStream.range(0, temp.length()/2)
                    .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    private static String findPalindromeViaLoop(String palindrome) {
        if (palindrome.isEmpty()) return "No text.";
            int lengthOfPolyndrome = palindrome.length();
        for (int i = 0; i < palindrome.length() / 2 ; i++) {
            if(palindrome.charAt(i) != palindrome.charAt(lengthOfPolyndrome - i - 1))
                return "That is not polindrome.";
        }
        return "That is polindrome.";
    }

    private static String findPalindrome(String palindrome) {
        if (palindrome.isEmpty()) return "No text.";
        if (palindrome.equalsIgnoreCase(new StringBuilder(palindrome).reverse().toString()))
            return "That is polindrome.";
        else return "That is not polindrome.";
    }
}
