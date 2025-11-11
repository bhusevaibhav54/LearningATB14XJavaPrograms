package ex_24_Static;

public class Static_P2 {

}

class ATB{
    int phone_np;
    String name;

    static String cource_name = "ATB";

    static void markAttendacne(){
        System.out.println("mark attendance");
//        System.out.println(this.phone_np);
    }

    void display(){
        System.out.println(this.phone_np + this.name + cource_name);
    }
}
