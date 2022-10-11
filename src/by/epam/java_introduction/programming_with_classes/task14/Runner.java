package by.epam.java_introduction.programming_with_classes.task14;

import java.util.Arrays;

    /*
     Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
     Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
     имеющим положительный и отрицательный балансы отдельно.
     */
public class Runner {

    public static void main(String[] args) {
        Client denis = new Client("Denis", "Bandurin","4242444W");
        Client ekaterina = new Client("Ekaterina", "Bandurina","4245145T");
        Bank vanner = new Bank();
        vanner.addClient(denis);
        vanner.addClient(ekaterina);
        denis.addAccount(new Account(504.99));
        denis.addAccount(new Account(12.4));
        denis.addAccount(new Account(-52.4));

        ekaterina.addAccount(new Account(-234.22));
        ekaterina.addAccount(new Account(-24.22));
        ekaterina.addAccount(new Account(42.52));
        ekaterina.addAccount(new Account(542.55));


        System.out.println(vanner.getClient("4242444W").getAccounts().get(1).getStatus());
        vanner.getClient("4242444W").getAccounts().get(1).blocking();
        System.out.println(vanner.getClient("4242444W").getAccounts().get(1).getStatus());

        vanner.getClient("4245145T").printInfo();
        vanner.getClient("4245145T").sortByBalance();
        vanner.getClient("4245145T").printInfo();

        System.out.println(vanner.getClient("4245145T").getFirstName());
        vanner.getClient("4245145T").printInfo();
        System.out.println("Sum is: ");
        vanner.getClient("4245145T").sumOfAccount();
        System.out.println("Positive sum: ");
        vanner.getClient("4245145T").sumOfAccountPos();
        System.out.println("Negative sum: ");
        vanner.getClient("4245145T").sumOfAccountNeg();



        sortShell();
        insertionSort();
       // int[] array = {21,42,44,2,25,20,14,5};
       // quickSort(array, array[0], array[array.length - 1]);

    }

    private static void insertionSort(){
        int[] array = { 21,42,44,2,25,20,14,5 };

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if(value < array[i]){
                   array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void sortShell(){
        int[] array = {21,42,44,2,25,20,14,5};

        int gap = array.length / 2;
        while (gap >= 1){
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0 ; c -= gap) {
                    if(array[c] > array[c + gap]){
                        int tmp = array[c];
                        array[c] = array[c + gap];
                        array[c + gap] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int leftBorder, int rightBorder){


        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];

        do {

            while (array[leftMarker] < pivot){
                leftMarker++;
            }
            while (array[rightMarker] > pivot){
                rightMarker --;
            }

            if (leftMarker <= rightMarker){
                if(leftMarker < rightMarker){
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        }while (leftMarker <= rightMarker);

            if (leftMarker < rightBorder){
                quickSort(array,leftMarker,rightBorder);
            }
            if (leftBorder < rightMarker){
                quickSort(array,leftBorder,rightMarker);
            }
    }
}

