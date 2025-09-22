package ex_05_TypeCasting;

public class Lab053_TypeCasting {
    public static void main(String[] args) {
        long Ph_No = 9875854512l;

        short s = (short) Ph_No;  //narrowing implicit
        System.out.println(s);
    }
}
