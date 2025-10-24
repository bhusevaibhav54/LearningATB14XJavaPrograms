package Exercise.Exercise_17thOct;

import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountBalance = 10000;

        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount <= 0) {
            System.out.println("Error: Withdrawal amount should be greater than zero.");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Error: Withdrawal amount should be a multiple of 100.");
        } else if (withdrawAmount > accountBalance) {
            System.out.println("Error: Insufficient account balance.");
        } else {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + accountBalance);
        }

        scanner.close();
    }
}
