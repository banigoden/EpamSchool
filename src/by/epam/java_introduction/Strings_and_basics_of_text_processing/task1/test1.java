package by.epam.java_introduction.Strings_and_basics_of_text_processing.task1;

import java.util.Arrays;
import java.util.List;

public class test1 {
    static String str0 = "hello";
    public static void main(String[] args) {

        String str1 = new String("hello");
        System.out.println(str0 == str1);
        str1 = str1.intern();
        System.out.println(str0 == str1); // true //Заносим переменную str0 в пул строк (пул литералов)


        String str2 ="";
        System.out.println(str2.length() == 0); //плохой способ
        System.out.println(str2.isEmpty()); // Хороший способ проверки строк на пустату
        System.out.println(str2.isBlank()); // Проверяте на на пустату и не учитывает пробелы

        String str3 = "   34    42 2  ";
        System.out.println(str3.strip()); // удалить пробелы в начале и в конце
        System.out.println( str3.replaceAll("\\s+", ""));// удалить все пробелы


        String xss = "<script> alert() </script>";
        xss.replaceAll("</?script>", ""); // отражение xss атаки
        String str = " 7876m,m.877bvbv__-878787<><78";
        String[] arrStr = str.split("\\D+"); //
        System.out.println(Arrays.toString(arrStr));

        String str4 = String.format("java %.2s he%nllo %5.2f","SE000", 55.456484);// форматируeм строку
        System.out.println(str4);

        String str5 = String.join("; ", List.of("a", "java", "12", "2019")); // соединим строки и создадим список строк
        System.out.println(str5);
    }
}
