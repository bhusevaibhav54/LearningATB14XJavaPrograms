package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the b: ");
        int b = scanner.nextInt();


        int result = sum_of_two_numbers(a,b);
        System.out.println(result);

        int result1 = sum_of_two_numbers(10,45);
        System.out.println(result1);


    }

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }


//    static int sum_of_two_numbers(){
//        System.out.println("Hi, there.");
//    }
}
