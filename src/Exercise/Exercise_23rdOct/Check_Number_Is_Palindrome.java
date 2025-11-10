package Exercise.Exercise_23rdOct;

import java.util.Scanner;

public class Check_Number_Is_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        scanner.close();
    }
}
