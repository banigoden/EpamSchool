package by.epam.java_introduction.programming_with_classes.task11;

    /*
     Создать объект класса Текст, используя классы Предложение, Слово.
     Методы: дополнить текст, вывести на консоль текст, заголовок текста.
     */
public class Word {

    private String word;

        public Word(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        @Override
        public String toString() {
            return  word;
        }
    }
