package ex_08_If_Condition;

public class Lab072_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println(age);

        if(age > 25){
            System.out.println("Yes, you can go to goa!");
        }else {
            System.out.println("You cant go to goa!");
        }
    }
}
