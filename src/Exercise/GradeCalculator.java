package Exercise;


/*✅ Grade Calculator:
Write a program that calculates and displays the letter grade
for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of student: ");

        int marks = scanner.nextInt();
        char grade = ' ';

        if(marks >=90 && marks<=100) grade='A';
        else if(marks>=80 && marks<=89) grade='B';
        else if(marks>=70 && marks<=79) grade='C';
        else if(marks>=60 && marks<=69) grade='D';
        else if(marks<=59) grade='F';
        else System.out.println("Enter the valid marks");

        System.out.println("Grade of the student is: " +grade);

        scanner.close();

    }
}
