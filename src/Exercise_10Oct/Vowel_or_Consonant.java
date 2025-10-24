package Exercise_10Oct;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char Char = scanner.next().charAt(0);

        Char = Character.toLowerCase(Char);

        if (Char >= 'a' && Char<='z') {
            if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u') {
                System.out.println("Character is Vowel");
            }else {
                System.out.println("Character is Consonent");
            }
        }else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
