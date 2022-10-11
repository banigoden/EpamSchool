package by.epam.java_introduction.algorithmization.task51;

    /*
    Из заданного числа вычти сумму его цифр. Из результата вновь вычти сумму его
    цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
    Для решения задачи использовать декомпозицию
     */
public class Decomposition17 {

    public static void main(String[] args) {
        int value = 4219;
        int result = minusCountOfValue(value);
        System.out.printf("There are %d operations.", result);
    }

        private static int minusCountOfValue(int value) {
        int count = 0;
        int newValue = value;
        while(newValue > 0){
            newValue -= sumOfDigits(newValue);
            count++;
        }
        return count;
    }

        private static int sumOfDigits(int newValue) {
            int sum = 0;
            if(String.valueOf(newValue).length() == 1){
                return 1;
            }else {
                while (newValue != 0) {
                    sum += newValue % 10;
                    newValue = newValue / 10;
                }
                return sum;
            }
        }
    }