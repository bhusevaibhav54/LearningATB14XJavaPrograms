package ex06_Ternary_Oparator;

public class Lab057_Interview_Ready_Quetion {
    public static void main(String[] args) {
        int age = 24;

        //nested ternary
        String  result = (age>21) ? (age>25? "you can drink" : "You cant drink"):"No";

        System.out.println(result);
    }
}
