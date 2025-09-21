package ex_04_Operators;

public class Lab036_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Vaibhav";
        String last_name = "Bhuse";

        int a = 10;
        int b = 10;

        System.out.println(first_name+last_name+a+b);   //VaibhavBhuse1010
        System.out.println(a+b+first_name+last_name);   //20VaibhavBhuse
    }
}
