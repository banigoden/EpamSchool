package by.epam.java_introduction.Strings_and_basics_of_text_processing.task3;
    /*
    В строке найти количество цифр
     */
public class Task3 {

        public static void main(String[] args) {

            String string = "My 2 boss has a pretty hands-off approach. 3 Sometimes we go the entire day without 2touching ba23se.";
            System.out.println(findDigis(string));

        }

        private static long findDigis(String string) {
            if (string.isEmpty()){
                return 0;
            }

            long countStream = string.codePoints().filter(Character::isDigit).count();
            System.out.println(countStream);

            long countLoop = 0;
            char[] digits = {'0','1','2', '3', '4', '5', '6', '7', '8', '9'};
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < digits.length; j++) {
                    if (string.charAt(i) == digits[j]){
                        countLoop++ ;
                    }
                }
            }
            return countStream;
        }
    }
