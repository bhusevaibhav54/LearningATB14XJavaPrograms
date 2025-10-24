package Exercise.Exercise_10Oct;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        if (number1>number2) {
            System.out.println("number1 is greater");
        } else if (number2>number1) {
            System.out.println("number2 is greater");
        }else {
            System.out.println("Both numbers are same");
        }
    }
}
