package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array(int)");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];

        for (int i = 0; i < number_marks.length ; i++) {
            System.out.println("Enter the element -> " +i);
            number_marks[i] = scanner.next();
        }

        System.out.println("Print Values of Array");
        for (int i = 0; i < number_marks.length ; i++) {
            System.out.println("The element -> " +i +" is: " +number_marks[i]);
        }
    }
}
