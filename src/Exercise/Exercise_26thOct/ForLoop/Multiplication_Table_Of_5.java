package Exercise.Exercise_26thOct.ForLoop;

public class Multiplication_Table_Of_5 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
