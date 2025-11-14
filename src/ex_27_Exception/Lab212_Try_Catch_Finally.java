package ex_27_Exception;

public class Lab212_Try_Catch_Finally {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try {
            c=10/a;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not possible");
        }
        finally {
            System.out.println("I will be always executed");
        }
        System.out.println(c);
    }
}
