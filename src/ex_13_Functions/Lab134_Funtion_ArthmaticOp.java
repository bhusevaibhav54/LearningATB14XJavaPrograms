package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Funtion_ArthmaticOp {
    public static void main(String[] args) {
//        Create function of sum, sub, mul, div
//        with parameter a,b (take parameter from user)

//Logic building formula
//        step 1 -> Inputs and outputs
//        a,b   -> int  ->Scanner
//        int -> variable result


//        step 2 - rough logic  -> create functions
//        functions -type 4th - with return and with arguments/parameter

//        step3 -> write the code and find and fix  -> edge cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner,"Enter the Number1: ");
        int b = readInt(scanner,"Enter the Number2: ");

        int result_sum = sum(a,b);
        System.out.println("Sum of two given numbers: " +result_sum);

        int result_sub = sub(a,b);
        System.out.println("Substraction of two given numbers: " +result_sub);

        int result_div = div(a,b);
        System.out.println("Division of two given numbers: " +result_div);

        int result_mul = mul(a,b);
        System.out.println("Multipication of two given numbers: " +result_mul);
    }


    static int readInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else {
            System.out.println("Enter the Integer only");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a, int b){
        return  a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a/b;
    }

    static int mul(int a, int b){
        return a*b;
    }

}