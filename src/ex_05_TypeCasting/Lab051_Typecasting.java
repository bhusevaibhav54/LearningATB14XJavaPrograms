package ex_05_TypeCasting;

public class Lab051_Typecasting {
    public static void main(String[] args) {
        byte b = 10;
        int a  = b; //valid syntax-> widening->implicit casting -automatically done
        int a1 = (int) b;   //valid syntax-> widening-> explicit casting  -not required
    }
}
