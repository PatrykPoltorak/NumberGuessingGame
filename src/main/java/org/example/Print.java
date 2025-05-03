package org.example;

import java.util.List;

public class Print {
    public void playAgain(){
        System.out.println("You want to play again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }
    public void summary(int numberOfGamesPlayed, int gamesWon, int gamesLost){
        System.out.println("Number of games played: " + numberOfGamesPlayed);
        System.out.println("Games Won: " + gamesWon);
        System.out.println("Games Lost: " + gamesLost);
    }
    public void welcomeMessage(){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println();
    }

    public void showDifficultiesLevels(List<Difficulties> difficultiesList){
        System.out.println("Please select the difficulty level:");
        for(Difficulties d: difficultiesList){
            System.out.println(d.toString());
        }
        System.out.println("0: Quit");
        System.out.println();
        System.out.print("Enter your choice: ");
    }
    public void selectedDifficultiesLevels(String difficultiesLevel){
        System.out.println("Great! You have selected the " + difficultiesLevel + " difficulty level.");
    }
    public void greaterOrLessNumber(String greaterLess, int guessNumber){
        System.out.println("Incorrect! The number is "+ greaterLess +" than " + guessNumber + ".");
    }
    public void wonInformation(int attempts){
        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
    }
    public void loseInformation(){
        System.out.println("Sorry! No more attempts. You lose the game, try again.");
    }
    public void chanceNumber(int attempts){
        System.out.println();
        System.out.println("attemps nr: " + attempts);
        System.out.print("Enter your guess:");
    }
}
