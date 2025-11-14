package ex_27_Exception;

public class Lab208_Arithmatic {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not possible");
        }
    }
}
