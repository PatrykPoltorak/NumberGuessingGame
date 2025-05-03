package org.example;

import java.util.ArrayList;
import java.util.List;

public class Difficulties {
    private int id;
    private String difficultiesLevel;
    private int chances;
    private List listOfDifficulties;

    public Difficulties() {
    }

    public Difficulties(int id, String difficultiesLevel, int chances) {
        this.id = id;
        this.difficultiesLevel = difficultiesLevel;
        this.chances = chances;
    }

    public void init(){
        listOfDifficulties = new ArrayList<>();
        Difficulties difficultiesEasy = new Difficulties(1,"Easy", 10);
        Difficulties difficultiesMedium = new Difficulties(2,"Medium", 5);
        Difficulties difficultiesHard = new Difficulties(3,"Hard", 3);
        listOfDifficulties.add(difficultiesEasy);
        listOfDifficulties.add(difficultiesMedium);
        listOfDifficulties.add(difficultiesHard);
    }

    public List getListOfDifficulties(){
        return listOfDifficulties;
    }

    public int getId() {
        return id;
    }

    public String getDifficultiesLevel() {
        return difficultiesLevel;
    }

    public int getChances() {
        return chances;
    }

    @Override
    public String toString() {
        return
                id +
                ". " + difficultiesLevel +
                " (" + chances +
                " chances)";
    }
}
