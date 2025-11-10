package Exercise.Exercise_23rdOct;


//19)  Calculate Bonus Based on Salary and Years of Experience.
//      :- take the salary and Year info from the User.
//Implement Bonus Calculation Logic:
//     Define the bonus structure based on salary and years of experience.
//        :- If years of experience is less than 1 year: No bonus.
//        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//        :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//        :- If years of experience is greater than 6 years: Bonus is 15% of the salary.

import java.util.Scanner;

public class Calculate_Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter you Years of experience: ");
        double exp = sc.nextDouble();

        double bonus =0;
        if(exp < 1)
        {
            bonus =0.0;
        }
        else if(exp<= 3)
        {
            bonus = 0.05 *salary;
        }
        else if(exp <= 6)
        {
            bonus = 0.1*salary;
        }
        else
        {
            bonus = 0.15*salary;
        }
        System.out.printf("Your bonus is: Rs %.2f\n", bonus);
    }
}
