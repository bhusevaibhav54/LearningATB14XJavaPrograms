package ex_05_TypeCasting;

public class Lab052_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val;   //syntax correct    -> narrowing -> implicit -> not valid
        byte b = (byte) val;   //syntax correct    -> narrowing -> explici -> valid
        System.out.println(b);
    }
}
