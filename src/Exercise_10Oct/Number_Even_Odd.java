package Exercise_10Oct;

import java.util.Scanner;

public class Number_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its even or odd");
        int number = scanner.nextInt();

        if (number%2==0) {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
