package Exercise.Exercise_17thOct;

import java.util.Scanner;

public class Grade_System {
    public static void main(String[] args) {
//        Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
//
//        1️⃣ Take user input for marks (Use Scanner class).
//        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//        3️⃣ Use if-else-if conditions to determine the grade based on marks.
//        4️⃣ Display the grade as output.
//
//        Grading Criteria (Example)
//        Marks Range Grade
//        90 - 100   A+
//        80 - 89     A
//        70 - 79      B
//        60 - 69     C
//        50 - 59      D
//        40 - 49      E
//        Below 40   Fail

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student marks");
        int marks = scanner.nextInt();

        if (marks>0) {
            if (marks>=90 && marks<=100) {
                System.out.println("A+");
            } else if (marks>=80 && marks<=89) {
                System.out.println("A");
            } else if (marks>=70 && marks<=79) {
                System.out.println("B");
            } else if (marks>=60 && marks<=69) {
                System.out.println("C");
            } else if (marks>=50 && marks<=59) {
                System.out.println("D");
            } else if (marks>=40 && marks<=49) {
                System.out.println("E");
            } else if (marks<40) {
                System.out.println("Student is failed");
            }else {
                System.out.println("Enter the marks in correct range");
            }
        }else {
            System.out.println("Enter the valid input for marks");
        }

        scanner.close();
    }
}
