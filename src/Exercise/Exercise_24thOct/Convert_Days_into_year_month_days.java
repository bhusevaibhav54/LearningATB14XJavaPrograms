package Exercise.Exercise_24thOct;
//23) Convert Days into Years, Months, and Days.
//       :- Take the Days Input from the User
//    Define the conversion logic:
//        :- Assume 1 year = 365 days.
//        :- Assume 1 month = 30 days
//        :- Convert the Days into Years, Month and days and Print it.
//      if you input 1000 days,
//      the output of the program would be:  2 years, 9 months, and 0 days.

import java.util.Scanner;

public class Convert_Days_into_year_month_days {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of days: ");
        int totalDays = sc.nextInt();


        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(years + " years, " + months + " months, and " + days + " days.");
    }
}
