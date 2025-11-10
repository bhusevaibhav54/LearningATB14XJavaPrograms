package Exercise.Exercise_26thOct.WhileLoop;

public class Print_even_no_1_To_20 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20)
        {
            if(i%2==0)
            {
                System.out.print(" " +i);
            }
            i++;
        }
    }
}
