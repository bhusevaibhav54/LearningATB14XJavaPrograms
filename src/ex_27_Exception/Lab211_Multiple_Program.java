package ex_27_Exception;

public class Lab211_Multiple_Program {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try {
            c=10/a;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not possible");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
