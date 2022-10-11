package by.epam.java_introduction.Strings_and_basics_of_text_processing.task7;

    /*
    В строке вставить после каждого символа 'a' символ 'b'.
     */
public class StringAsObject2 {

        public static void main(String[] args) {
            String string = "My boss has a pretty hands-off approach. Sometimes we go the entire day without touching base.";
            System.out.println(changeViaReplacement(string));
            string = "My boss has a pretty hands-off approach. Sometimes we go the entire day without touching base.";
            System.out.println(changeViaStringBuilder(string));
        }

        private static String changeViaStringBuilder(String string) {
            if (string.isEmpty()) return "No text.";
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'a'){
                    stringBuilder.append("ab");
                }else stringBuilder.append(string.charAt(i));
            }
            return stringBuilder.toString();
        }

        private static String changeViaReplacement(String string) {
            if (string.isEmpty()) return "No text.";
            return string.replaceAll("a", "ab");
        }
    }
