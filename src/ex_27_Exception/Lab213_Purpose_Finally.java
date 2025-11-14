package ex_27_Exception;

import java.util.Scanner;

public class Lab213_Purpose_Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int v = scanner.nextInt();
            int a = 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
