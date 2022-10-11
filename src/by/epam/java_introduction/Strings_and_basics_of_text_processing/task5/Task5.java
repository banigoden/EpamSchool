package by.epam.java_introduction.Strings_and_basics_of_text_processing.task5;


    /*
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
     Крайние пробелы в строке удалить.
     */
public class Task5 {

    public static void main(String[] args) {
        String text = " All even numbers greater than 2   can also be eliminated:         if  an even number can  divide n, so can 2. ";
        System.out.println(deleteSpaces(text));
        System.out.println(deleteSpacesLoop(text));
    }

    private static String deleteSpacesLoop(String text) {

        if (text.isEmpty()){
            return "no text";
        }
        text = text.strip();
        StringBuilder stringBuilder = new StringBuilder();
        boolean isSpace = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                if (!isSpace){
                    stringBuilder.append(" ");
                }
                isSpace = true;
            }else {
                stringBuilder.append(text.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }

    private static String deleteSpaces(String text) {
            if (text.isEmpty()){
                return "no text";
            }
            String newText = text.replaceAll(" {1,}", " ").strip();
            return newText;

        }
    }
