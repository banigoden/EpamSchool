package by.epam.java_introduction.Strings_and_basics_of_text_processing.task2;
    /*
    Заменить в строке все вхождения word на letter
     */
public class Task2 {

    public static void main(String[] args) {

        String text = " There is a word in this world. This word is bad. New word.";
        System.out.println(text.replace("word", "letter"));

        text = " There is a word in this world. This word is bad. New word.";

        System.out.println(stringChanger(text));

    }

        private static String stringChanger(String text) {

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if ( text.charAt(i) == 'w' && text.charAt(i + 1) == 'o'
                && text.charAt(i + 2) == 'r' && text.charAt(i + 3) == 'd' && i + 3 < text.length()){
                    stringBuilder.append("letter");
                    i += 3;
                }else {
                    stringBuilder.append(text.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
    }
