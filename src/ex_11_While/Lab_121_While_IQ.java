package ex_11_While;

import java.util.Scanner;

public class Lab_121_While_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number from factorial number");
        if (!scanner.hasNextInt()) {
            System.out.println("You fool int only");
        }else{
            int number = scanner.nextInt();
            int fact = 1;
            if (number==0){
                System.out.println("Fact = 1");
            }
            if (number < 0 || number > Integer.MAX_VALUE){
                System.out.println("Out of bound");
            }

            int i = 1;
            while (i<=number){
                fact = fact*i;
                i++;
            }

            System.out.println(fact);
        }
    }
}
