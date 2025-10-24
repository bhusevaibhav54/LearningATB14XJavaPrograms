package Exercise_10Oct;

import java.util.Scanner;

public class Voter_Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age to check if its eligible for voting");

        if (scanner.hasNextInt()) {
            System.out.println("you have entered valid input as numeric, lets check if you are eligible for voting");
            int number = scanner.nextInt();
            if (number>=18) {
                System.out.println("You are eligible for voting");
            }else{
                System.out.println("you are not eligible for voting");
            }
        }else {
            System.out.println("Please enter valid input");
        }

    }
}
