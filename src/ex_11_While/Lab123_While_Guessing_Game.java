package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        //guess number between 1  to  100

        Random random = new Random();
        int numberToGuess = random.nextInt(101);
//        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempt = 0;

        while (true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please Enter a number.");
                scanner.next();
                continue;
            }
            
            guess = scanner.nextInt();
            attempt++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter number between 1 to 100");
            }

            if (guess < numberToGuess) {
                System.out.println("Too low, try Again");
                
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            }else {
                System.out.println("Correct! you guessed it in " + attempt + " attempts.");
                break;
            }
        }
    }
}
