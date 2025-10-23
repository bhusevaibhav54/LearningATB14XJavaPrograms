package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_Palindrome {
    public static void main(String[] args) {
//        madam -> reverse -? madam
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String user_input = scanner.next();

        String reversed = "";

        for (int i = user_input.length()-1; i >= 0; i--) {
            reversed = reversed + user_input.charAt(i);
        }
        System.out.println("Reverse String is:" +reversed);

        if (reversed.equalsIgnoreCase(user_input)) {
            System.out.println("String is Palindrome");

        }else {
            System.out.println("String is Not Palindrome");
        }

    }
}
