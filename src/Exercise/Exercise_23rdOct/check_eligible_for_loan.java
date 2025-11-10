package Exercise.Exercise_23rdOct;
//17)  Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//    * Take the below User info and store it into the variables:
//              Age (integer)
//              Salary (double or float)
//              Credit Score (integer)
//    Age Validation:
//              :- Check if the age is a positive integer.
//              :- Ensure the age is at least 18 years old.
//              :- Max age can be 80.
//    Salary Validation:
//             :- Check if the salary is a positive number.
//             :- Define a minimum salary threshold (e.g., 30,000).
//    Credit Score Validation:
//             :- Check if the credit score is a positive integer.
//             :- Define a minimum credit score threshold (e.g., 650).
//             :- Max credit score threshold (e.g., 850).


import java.util.Scanner;

public class check_eligible_for_loan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        //age_validation
        boolean isEligible=true;
        if (age <= 0) {
            System.out.println("Invalid age: Age must be positive.");
            isEligible = false;
        } else if (age < 18) {
            System.out.println("Not eligible: Minimum age is 18.");
            isEligible = false;
        } else if (age > 80) {
            System.out.println("Not eligible: Maximum age is 80.");
            isEligible = false;

        }
        //Salary validation
        if (salary <= 0) {
            System.out.println("Invalid salary: Salary must be positive.");
            isEligible = false;
        } else if (salary < 30000) {
            System.out.println("Not eligible: Minimum salary is 30,000.");
            isEligible = false;
        }

        //credit score validation
        if (creditScore <= 0) {
            System.out.println("Invalid credit score: Must be positive.");
            isEligible = false;
        } else if (creditScore < 650) {
            System.out.println("Not eligible: Minimum credit score is 650.");
            isEligible = false;
        } else if (creditScore > 850) {
            System.out.println("Not eligible: Maximum credit score is 850.");
            isEligible = false;
        }

        if (isEligible)
        {
            System.out.println("The person is eligible for a loan.");
        }
        else
        {
            System.out.println("The person is not eligible for a loan.");
        }
    }
}
