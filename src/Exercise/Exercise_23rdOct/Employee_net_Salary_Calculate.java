package Exercise.Exercise_23rdOct;

import java.util.Scanner;

public class Employee_net_Salary_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        System.out.print("Enter Dearness Allowance (DA): ");
        double da = sc.nextDouble();

        System.out.print("Is the employee in a metro city? (yes/no): ");
        boolean isMetro = sc.next().equalsIgnoreCase("yes");

        // HRA calculation
        double hra = isMetro ? basicPay * 0.50 : basicPay * 0.40;

        // Gross salary
        double grossSalary = basicPay + hra + da;

        // Provident Fund deduction (12% of Basic Pay)
        double pf = basicPay * 0.12;

        // Standard deduction (new regime)
        double standardDeduction = 75000; // If old regime, use 50000

        // Income Tax estimation (for simplicity, assuming 5% on gross minus deductions)
        double taxableIncome = grossSalary - pf - standardDeduction;
        double incomeTax = taxableIncome * 0.05; // Basic example rate

        // Other deductions (Professional Tax, example Rs. 2400)
        double professionalTax = 2400;

        // Total deductions
        double totalDeductions = pf + incomeTax + professionalTax;

        // Net Salary
        double netSalary = grossSalary - totalDeductions;

        System.out.printf("Net Salary is: Rs %.2f\n", netSalary);
    }
}
