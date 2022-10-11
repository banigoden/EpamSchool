package by.epam.java_introduction.basic_of_oop.task4.menu;

import by.epam.java_introduction.basic_of_oop.task4.cave.Cave;
import by.epam.java_introduction.basic_of_oop.task4.treasure.TreasureAction;

import java.util.Scanner;

/*
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона.  Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */
public class ConsoleMenu {

    private Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        String menuText = "Dragon and his Treasures." + "\n"+
                "1. All Treasure" + "\n"+
                "2. The most expensive treasure" + "\n"+
                "3. Choose the treasure amount" + "\n"+
                "4. Exit" + "\n";
        System.out.println(menuText);
    }

    public void startConsoleMenu(){
        Cave cave = new Cave("1000 nights",100);
        TreasureAction treasureAction = cave.createTreasure();
        boolean isStopped = true;
        int choice;
        while (isStopped){
            printMenu();
            choice = makeChoice();
            console(treasureAction,choice);

        }
    }

    public int makeChoice(){
        int choice;

        try{
            choice = Integer.parseInt(scanner.next());
            if (choice > 4 && choice < 0){
                System.out.println("There are no options, try again");
                printMenu();
            }else {
                return choice;
            }

        }catch (NumberFormatException e){
            System.out.println("Please choose  below.");
            printMenu();
        }
        return -1;
    }


    public boolean console(TreasureAction treasureAction, int choice){


            switch (choice) {
                case 1 -> {
                    System.out.println("All Treasure");
                    treasureAction.showAllTreasure();
                }
                case 2 -> {
                    System.out.println("The most expensive treasure");
                    treasureAction.theMostExpensiveTreasure();
                }
                case 3 -> {
                    System.out.println("Choose the desire range of treasure");
                    int min = 0, max = 0;
                    boolean isValid = false;
                    while (!isValid) {
                        try {
                            System.out.print("min value: ");
                            min = scanner.nextInt();
                            System.out.print("max value: ");
                            max = scanner.nextInt();
                            isValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Try again.");
                        }
                    }
                    System.out.println(String.format("Treasures value from %d to %d:", min, max));
                    treasureAction.givenAmount(min,max);
                }
                case 4 -> {
                    System.exit(0);
                    return false;
                }
                default -> {
                    System.out.println("no commands");
                }
            }
      return true;
    }
}
