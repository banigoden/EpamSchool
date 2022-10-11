package by.epam.java_introduction.programming_with_classes.task11;

public class Runner {

    public static void main(String[] args) {
        String book = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings," +
                " and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";
        String sentence = "The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. " +
                "For additional information on string concatenation and conversion, see The Java Language Specification.";
        Text text = new Text("My String", book);
        Sentence sentences = new Sentence(sentence);
        Word word = new Word(" StringBuffer ");
        sentences.addWord(word.getWord());

        text.addSentence(sentences);
        text.addWord(word.getWord());
        text.print();
    }
}
