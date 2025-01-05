# NumberGame.java

  import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int leastNum = 1;
        int highestNum = 100;
        int maxAttempts = 7;
        int roundsPlayed = 0;
        int roundsWon = 0;
        
        boolean playAgain = true;
        
    while(playAgain){
            int Number = random.nextInt(highestNum - leastNum + 1) + leastNum;
            System.out.println("Guess any number between " + leastNum + " and " + highestNum );
            
            int attempts = 0;
            boolean Correctguess = false;
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == Number) {
                    System.out.println("Congratulations. You have guessed the correct number " + Number + " in " + attempts + " attempts.");
            
                    roundsWon++;
        
                    Correctguess = true;
                    break;
                } else if (guess < Number) {
                    System.out.println("The guess is too low. Try again.");
                } else {
                    System.out.println("The guess is too high. Try again.");
                }
            }
            roundsPlayed++;
            
            if (!Correctguess) {
                System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was " + Number);
            }
            
            System.out.print("Do you want to play again?\n (yes/no): ");
            String continuePlaying = scanner.next();
            playAgain = continuePlaying.equalsIgnoreCase("yes");
         
        }
        System.out.println("\nYou played " + roundsPlayed + " rounds and your total score is " + roundsWon + ".");
        
        scanner.close();
    }
}


    
