package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
        numberGuessingGame.print.welcomeMessage();
        GameValidation gameValidation = new GameValidation(numberGuessingGame, numberGuessingGame.print);
        Scanner in = new Scanner(System.in);

        while(numberGuessingGame.game_state){

            gameValidation.startGame();
            int playAgain =0;
            if(numberGuessingGame.game_state == false){
                return;
            }
            do{
                numberGuessingGame.print.playAgain();
                playAgain = in.nextInt();
            }while(playAgain !=1 && playAgain != 2);

            if(playAgain == 1){
                continue;
            }else if(playAgain == 2){
                numberGuessingGame.game_state=false;
                break;
            }
        }
        numberGuessingGame.print.summary(numberGuessingGame.getNumberOfGamesPlayed(),
                numberGuessingGame.getGamesWon(),
                numberGuessingGame.getGamesLost());
    }
}
