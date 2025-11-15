package ex_28_Object;

public class Lab223_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println("Try executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Catching the exeption");
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
