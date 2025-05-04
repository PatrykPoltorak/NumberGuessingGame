# 🎯 Number Guessing Game

A simple console-based game written in **Java**, where the user tries to guess a randomly generated number in as few attempts as possible.

## 📁 Project Structure

- `NumberGuessingGame.java` – the main file containing the game logic.
- Console application runnable directly via terminal/command line.

## 🕹️ How to Play

1. Run the program.
2. The computer picks a random number within a given range (e.g., 1–100).
3. Enter your guess.
4. The game will tell you if your guess is:
   - The number is greater than
   - The number is less than
   - Congratulations! You guessed the correct number in 7 attempts.🎉
5. The game ends when you guess the correct number, and shows how many attempts you needed.
6. After the game ends, you will be asked if you'd like to play again.

## Here is a sample output of the game:

Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
0: Quit

Enter your choice: 3.
Great! You have selected the Hard difficulty level.

attemps nr: 1.
Enter your guess:50.
Incorrect! The number is greater than 50.

attemps nr: 2.
Enter your guess:80.
Incorrect! The number is less than 80.

attemps nr: 3.
Enter your guess:70.
Incorrect! The number is greater than 70.
Sorry! No more attempts. You lose the game, try again.
You want to play again?
1. Yes
2. No
2
Number of games played: 1.
Games Won: 0.
Games Lost: 1.

My solved exercise of the roadmap problem: [Roadmap Number Guessing Game](https://roadmap.sh/projects/number-guessing-game)
