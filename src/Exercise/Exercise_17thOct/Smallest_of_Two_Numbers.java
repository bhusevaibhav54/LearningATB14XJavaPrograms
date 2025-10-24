package Exercise.Exercise_17thOct;

import java.util.Scanner;

public class Smallest_of_Two_Numbers {
    public static void main(String[] args) {
//        int a = 10, b=12, c=54;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();

        if (a < b && a<c) {
            System.out.println("a is smallest number");
        } else if (b<a && b<c) {
            System.out.println("b is smallest number");
        }else {
            System.out.println("c is smallest number");
        }
    }
}
