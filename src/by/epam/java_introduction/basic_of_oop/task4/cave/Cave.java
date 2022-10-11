package by.epam.java_introduction.basic_of_oop.task4.cave;

import by.epam.java_introduction.basic_of_oop.task4.treasure.Treasure;
import by.epam.java_introduction.basic_of_oop.task4.treasure.TreasureAction;

import java.util.ArrayList;

public class Cave {

    private String name;
    private int treasureCount;
    private ArrayList<Treasure> treasures;
    private TreasureAction treasureAction;

    public Cave(String name ,int treasureCount){
        this.name = name;
        this.treasureCount = treasureCount;
        treasures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public TreasureAction createTreasure(){
        if(treasureCount < 0){
            System.out.println("Can not be less 0");
            System.exit(0);
        }else {
            for (int i = 0; i < treasureCount; i++) {
                randomTreasure();
            }
        }
        return new TreasureAction(treasures);
    }

    private void randomTreasure(){
        double price = (double) Math.round(Math.random()*1000);
        treasures.add(new Treasure(price));
    }





}
