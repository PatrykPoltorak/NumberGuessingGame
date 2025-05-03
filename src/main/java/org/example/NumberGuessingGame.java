package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private Difficulties difficultie;
    protected Print print;
    protected List<Difficulties> difficultiesList;
    protected boolean game_state;
    protected int chances;
    private int numberOfGamesPlayed = 0;
    private int gamesWon =0;
    private int gamesLost = 0;

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getChances() {
        return chances;
    }

    public NumberGuessingGame(){
        this.difficultie = new Difficulties();
        this.print = new Print();
        this.game_state = true;
    }

    public Difficulties getDifficultiesById(int id){
        Difficulties difficultie = difficultiesList.stream().filter(e->e.getId() == id).findAny().get();
        return difficultie;
    }
    public void initGame(){
        int id;
        Scanner in = new Scanner(System.in);
        difficultie.init();
        do{
            difficultiesList = difficultie.getListOfDifficulties();
            print.showDifficultiesLevels(difficultiesList);

            id = in.nextInt();
        }while(id>difficultiesList.size() && id!=0);
        if(id == 0){
            game_state=false;
            return;
        }
        difficultie = getDifficultiesById(id);
        this.chances = difficultie.getChances();
        print.selectedDifficultiesLevels(difficultie.getDifficultiesLevel());
    }
}