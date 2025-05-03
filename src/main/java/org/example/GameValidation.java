package org.example;

import java.util.Random;
import java.util.Scanner;

public class GameValidation {
    private NumberGuessingGame numberGuessingGame;
    private Print print;
    int chances;
    public GameValidation(NumberGuessingGame numberGuessingGame,Print print){
        this.numberGuessingGame = numberGuessingGame;
        this.print = print;
    }
    public void startGame(){
        Scanner in = new Scanner(System.in);
        numberGuessingGame.initGame();
        this.chances = numberGuessingGame.getChances();
        Random random = new Random();
        int number = random.nextInt(101);
        int attempts = 0;
        while (attempts != chances ){
            attempts++;
            print.chanceNumber(attempts);
            int guessNumber = in.nextInt();
            if(guessNumber < number){
                print.greaterOrLessNumber("greater", guessNumber);

            }else if(guessNumber > number){
                print.greaterOrLessNumber("less", guessNumber);
            }else {
                print.wonInformation(attempts);
                numberGuessingGame.setGamesWon(numberGuessingGame.getGamesWon()+1);
                numberGuessingGame.setNumberOfGamesPlayed(numberGuessingGame.getNumberOfGamesPlayed()+1);
                break;
            }
            if(attempts  == chances){
                print.loseInformation();
                numberGuessingGame.setGamesLost(numberGuessingGame.getGamesLost()+1);
                numberGuessingGame.setNumberOfGamesPlayed(numberGuessingGame.getNumberOfGamesPlayed()+1);
            }
        }
    }
}
