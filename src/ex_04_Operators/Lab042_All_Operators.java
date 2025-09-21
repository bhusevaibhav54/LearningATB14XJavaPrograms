package ex_04_Operators;

public class Lab042_All_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);  //30
        System.out.println(a > b);  //false
        System.out.println(a >= b); //false
        System.out.println(a == b); //false
        System.out.println(a != b); //true

        //Compound Assignment Operators
        int age = 10;
        age +=10;       //age = age + 10;
        System.out.println(age);
    }
}
