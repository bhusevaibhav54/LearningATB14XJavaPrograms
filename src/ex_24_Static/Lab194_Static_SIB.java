package ex_24_Static;

public class Lab194_Static_SIB {
    public static void main(String[] args) {
        A a =new A();
    }
}

class A {
 static {
     System.out.println("called only once when class is loaded");
     System.out.println("you ca write code reading excel, db");
 }

 static int a=10;
 static void m1(){
     System.out.println("static function");
 }
}
