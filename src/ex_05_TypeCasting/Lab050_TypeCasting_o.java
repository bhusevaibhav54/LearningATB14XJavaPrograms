package ex_05_TypeCasting;

public class Lab050_TypeCasting_o {
    public static void main(String[] args) {
        byte b = 10;
//        int a = b;

//        System.out.println(a);      //typecasting of byte in int

        int a = (int) b;    //this is explicit casting- widening , this is not required as system do it for you in case of widening

        System.out.println(a);

    }
}
