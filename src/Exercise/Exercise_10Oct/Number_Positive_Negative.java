package Exercise.Exercise_10Oct;

import java.util.Scanner;

public class Number_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its Positive or Negative");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        } else if (number<0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
