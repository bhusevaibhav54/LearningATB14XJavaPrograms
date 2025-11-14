package ex_27_Exception;

public class Lab216_EC {
    public static void main(String[] args) {
        try {
            System.out.println("Start of the program");
            String ip = args[0];        //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            int a = Integer.parseInt(ip);       //java.lang.NumberFormatException: For input string: "Pramod"
            int b = 100/a;  //java.lang.ArithmeticException: / by zero
            System.out.println(b);
            System.out.println("End of the program");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
