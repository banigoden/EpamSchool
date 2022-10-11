package by.epam.java_introduction.programming_with_classes.task11;

    /*
     Создать объект класса Текст, используя классы Предложение, Слово.
     Методы: дополнить текст, вывести на консоль текст, заголовок текста.
     */

public class Sentence {

    private StringBuilder sentence;

    public Sentence(StringBuilder sentence) {
        this.sentence = sentence;
    }

    public Sentence(String sentence) {
        this.sentence = new StringBuilder(sentence);
    }

    public StringBuilder getSentence() {
        return sentence;
    }

    public void setSentence(StringBuilder sentence) {
        this.sentence = sentence;
    }

    public void addWord(String word){
        sentence.append(word);
    }

    @Override
    public String toString() {
        return sentence.toString();
    }
}
