package by.epam.java_introduction.Strings_and_basics_of_text_processing.task6;

    /*
    Дан текст. Найти наибольшее количество идущих подряд пробелов в нём.
     */
public class StringAsObject1 {

    public static void main(String[] args) {
        String text = " All even numbers greater than 2   can also be eliminated:         if  an even number can  divide n, so can 2. ";
        System.out.println(findMoreSpaces(text));
    }

        private static int findMoreSpaces(String text) {
        if (text.isEmpty()){
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                max++;
            }else {
                if (count < max){
                    count = max;
                }
                max = 0;
            }
        }
        return count;
        }
    }
