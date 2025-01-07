NumberGame.java

A fun and interactive Java program where players try to guess the correct number. The program generates a random number within a specified range, and the player must guess it within a certain number of attempts.

Features

Random Number Generation: The program generates a random number within a predefined range (e.g., 1 to 100).
Player Feedback: Provides hints after each guess to indicate if the correct number is higher or lower.
Configurable Attempts: Players have a limited number of guesses to find the correct number.
Win or Lose Message: Displays a congratulatory message if the player guesses correctly or a message showing the correct number if they lose.
Getting Started

Prerequisites
To run this project, ensure you have the following installed:

Java Development Kit (JDK) (version 8 or higher)
A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or a text editor like VS Code).

How to Play

Run the program.
The program will generate a random number within a specific range (default: 1 to 100).
You will be prompted to guess the number.
After each guess:
If your guess is too high, the program will let you know.
If your guess is too low, the program will let you know.
If you guess the number correctly, you win! Otherwise, you'll lose after a certain number of incorrect attempts.

Code Overview

The NumberGame.java program is structured as follows:

Variables:
randomNumber: Holds the randomly generated number.
maxAttempts: The maximum number of guesses allowed.
Methods:
generateRandomNumber(int min, int max): Generates a random number within the given range.
playGame(): Handles the main gameplay loop.
main(String[] args): Entry point of the program to start the game.
Configuration

You can modify the program to adjust:

Range of Numbers: Change the minimum and maximum range for the random number.
Number of Attempts: Update the maxAttempts variable to allow more or fewer guesses.
Future Enhancements

Potential updates to improve functionality:

Add a difficulty level (e.g., easy, medium, hard) to adjust the range and number of attempts.
Include a scoring system based on the number of attempts taken.
Add a leaderboard to track high scores across multiple games.
Implement a GUI version for a more engaging experience.
Allow multiplayer mode where players compete to guess the number.
