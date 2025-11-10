package Exercise.Exercise_23rdOct;

import java.util.Scanner;


//18 )  Electricity Bill Calculation (Based on Units Consumed)
//           :- take the input from the user of Units.
//    Implement Rate Structure:
// Define the rate structure for calculating the bill based on the number of units consumed.
//           :-  First 100 units: 0.50Rs per unit
//            :-  Next 100 units (101-200): 0.75Rs per unit
//            :- Next 100 units (201-300): 1.20Rs per unit
//            :- Above 300 units: 1.50Rs per unit

public class Electricity_Bill_Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Units consumed: ");
        int unit = sc.nextInt();

        double bill=0.0;

        if(unit <=100)
        {
            bill= 0.5*unit;
        }
        else if(unit<= 200)
        {
            bill = 100*0.5+(unit -100)*0.75;
        }
        else if(unit <= 300)
        {
            bill = 100 *0.5 + 100 * 0.75 +(unit -200)*1.20;
        }
        else
        {
            bill = 100*0.5 + 100 *0.75 + 100*1.20 +(unit - 300)*1.50;
        }
        System.out.printf("Electricity Bill: Rs %.2f\n", bill);
    }
}
