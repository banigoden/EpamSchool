package by.epam.java_introduction.Strings_and_basics_of_text_processing.task9;

        /*
        С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
         */
public class StringAsObject4 {
    public static void main(String[] args) {
        wordConcatination("информатика");
    }

    private static void wordConcatination(String word) {
         String newWord = "";
         String newWord1 = "";
        if(word.contains("т") && word.contains("о") && word.contains("р")){
             newWord1 = newWord.concat(String.copyValueOf(word.toCharArray(),word.indexOf('т'),1));
             newWord1 += newWord.concat(String.copyValueOf(word.toCharArray(),word.indexOf('о'),1));
             newWord1 += newWord.concat(String.copyValueOf(word.toCharArray(),word.indexOf('р'),1));
             newWord1 += newWord.concat(String.copyValueOf(word.toCharArray(),word.indexOf('т'),1));
             newWord = String.valueOf(word.charAt(word.indexOf('т')));
             newWord += String.valueOf(word.charAt(word.indexOf('о')));
             newWord += String.valueOf(word.charAt(word.indexOf('р')));
             newWord += String.valueOf(word.charAt(word.indexOf('т')));
        }
        System.out.println(newWord + " " + newWord1);
    }
}
