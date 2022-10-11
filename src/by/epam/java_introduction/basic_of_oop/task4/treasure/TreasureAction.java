package by.epam.java_introduction.basic_of_oop.task4.treasure;

    /*
   Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
   дракона.  Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
   выбора сокровищ на заданную сумму.
    */

import java.util.ArrayList;
import java.util.Comparator;

public class TreasureAction {

    private ArrayList<Treasure> treasures;

    public TreasureAction(ArrayList<Treasure> treasures){
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void showAllTreasure(){
        treasures.stream().forEach(System.out::println);
        System.out.println();
    }

    public void theMostExpensiveTreasure(){
        System.out.println(treasures.stream()
                .max(Comparator.comparing(Treasure::getPrice)).get());
        System.out.println();
    }

    public void givenAmount(double min, double max){
        treasures.stream()
                .filter(treasure -> treasure.getPrice() >= min && treasure.getPrice() <= max)
                .forEach(System.out::println);
    }

}
