package Exercise.Exercise_26thOct.WhileLoop;

public class Multiplication_Table_Of_7 {
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Multiplication Table of 5:");
        int i =1;
        while(i<=10)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
