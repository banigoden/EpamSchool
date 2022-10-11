package by.epam.java_introduction.programming_with_classes.task11;

    /*
     Создать объект класса Текст, используя классы Предложение, Слово.
     Методы: дополнить текст, вывести на консоль текст, заголовок текста.
     */
public class Text {

    private String title;
    private StringBuilder text;

        public Text(String title, StringBuilder text) {
            this.title = title;
            this.text = text;
        }

        public Text(StringBuilder text) {
            this.text = text;
            this.title = null;
        }

        public Text(String title, String text){
            this.title = title;
            this.text = new StringBuilder(text);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StringBuilder getText() {
            return text;
        }

        public void setText(StringBuilder text) {
            this.text = text;
        }


        public void addText(String text){
            if (text.isEmpty()){
                System.out.println("No text");
            }else {
                this.text.append(text);
            }
        }

        public void addSentence(Sentence sentence){
            text.append(sentence.getSentence());
        }

        public void addWord(String word){
            if (word.isEmpty()){
                System.out.println("No text");
            }
            text.append(word);
        }

        public void print(){
            System.out.println(text);
        }
    }
