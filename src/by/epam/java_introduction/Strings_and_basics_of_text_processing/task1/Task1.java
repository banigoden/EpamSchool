package by.epam.java_introduction.Strings_and_basics_of_text_processing.task1;

import java.util.Arrays;

/*
 Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] camelCase = {"camelCase", "noName", "usefulCar"};
        String[] snakeCase = converterOfString(camelCase);

        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(snakeCase));
    }

    private static String[] converterOfString(String[] array) {
        String[] snakeCase = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                char letter = array[i].toCharArray()[j];
                if (Character.isLowerCase(letter)){
                    stringBuilder.append(letter);
                }else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            if(array[i].contains("camelCase")){
                stringBuilder.replace(0,10,"snake_case");
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
