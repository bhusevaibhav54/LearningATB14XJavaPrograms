package ex_05_TypeCasting;

public class Lab054_TypeCasting_AutomationUse {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total1 = course+GST;    //narrowing - implicit
//        System.out.println(total1); //will not work err: java: incompatible types: possible lossy conversion from float to int

//        int total1 = course + (int) GST;  // narrowing
//
//        System.out.println(total1);

        float total2 = course+GST;  //widening
        System.out.println(total2);
    }
}
