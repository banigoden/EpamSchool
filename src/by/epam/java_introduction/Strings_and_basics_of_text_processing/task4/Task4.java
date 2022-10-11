package by.epam.java_introduction.Strings_and_basics_of_text_processing.task4;
    /*
    В строке найти количество чисел.
     */
public class Task4 {

    public static void main(String[] args) {
        String string = "My 2 boss has a pretty hands-off approach. 3 Sometimes we go the entire day without 224213touching ba23se.";
        System.out.println(findNumbers(string));
    }

        private static long findNumbers(String string) {
        if (string.isEmpty()){
            return 0;
        }
        String[] countDigits = string.split("\\D+");
        int count = countDigits.length;

        return  string.codePoints().filter(Character::isDigit).count();
    }
    }
