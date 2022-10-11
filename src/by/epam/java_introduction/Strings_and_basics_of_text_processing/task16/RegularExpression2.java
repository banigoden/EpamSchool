package by.epam.java_introduction.Strings_and_basics_of_text_processing.task16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
      Дана строка, содержащая следующий текст (xml-документ):
      <notes>
         <note id = "1">
            <to>Вася</to>
            <from>Света</from>
            <heading>Напоминание</heading>
            <body>Позвони мне завтра!</body>
         </note>
         <note id = "2">
             <to>Петя</to>
             <from>Маша</from>
             <heading>Важное напоминание</heading>
             <body/>
         </note>
      </notes>
      Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
      xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
      тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
     */
public class RegularExpression2 {

        public static void main(String[] args) {

            String text = "<notes>\n" +
                    "         <note id = \"1\">\n" +
                    "            <to>Вася</to>\n" +
                    "            <from>Света</from>\n" +
                    "            <heading>Напоминание</heading>\n" +
                    "            <body>Позвони мне завтра!</body>\n" +
                    "         </note>\n" +
                    "         <note id = \"2\">\n" +
                    "             <to>Петя</to>\n" +
                    "             <from>Маша</from>\n" +
                    "             <heading>Важное напоминание</heading>\n" +
                    "             <body/>\n" +
                    "         </note>\n" +
                    "      </notes>";

            System.out.println(xmlAnalyzer(text));
        }

        public static String xmlAnalyzer(String text){
            StringBuilder stringBuilder = new StringBuilder();
            Pattern openTag = Pattern.compile("<\\w.+?>");
            Pattern closeTag = Pattern.compile("</\\w+>");
            Pattern bodyTag = Pattern.compile(">.+?<");
            Pattern emptyTag = Pattern.compile("<\\w.+?/>");

            String[] splitText = text.split("/n\\s*");

            Matcher matchOpenTag = openTag.matcher(text);
            Matcher matchCloseTag = closeTag.matcher(text);
            Matcher matchBodyTag = bodyTag.matcher(text);
            Matcher matchEmptyTag = emptyTag.matcher(text);
            for (String string : splitText) {
                if (matchEmptyTag.find()){
                    stringBuilder.append(matchEmptyTag.group());
                    stringBuilder.append(" - Empty tag\n");
                }else if(matchBodyTag.find()){
                    stringBuilder.append(matchBodyTag.group().substring(1));
                    stringBuilder.append(" \b - Body tag\n");
                }
                if (matchCloseTag.find()){
                    stringBuilder.append(matchCloseTag.group());
                    stringBuilder.append(" - Close tag\n");
                }
                if (matchOpenTag.find()){
                    stringBuilder.append(matchOpenTag.group());
                    stringBuilder.append(" - Open tag\n");
                }

            }
                return stringBuilder.toString();
        }
}
