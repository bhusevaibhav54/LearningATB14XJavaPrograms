package Exercise.Exercise_5thOct;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        Reverse string without inbuild function
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String user_input = scanner.next();

//        StringBuilder stringBuilder = new StringBuilder(user_input);
//        System.out.println("Reversed string is: " +stringBuilder.reverse());
        String reverseString = "";
        for (int i = user_input.length()-1; i >= 0; i--) {
            reverseString = reverseString + user_input.charAt(i);
        }
        System.out.println("Reverse String is:" +reverseString);
    }
}
