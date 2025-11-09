package ex_19_OOPs_Inheritance.Multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        son pramod = new son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extra();

        Father f= new Father();
        f.gf();
        f.home();
        f.extra();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();


        //Dynamic Dispatch
        GrandFather g1 = new son();
        Father f1 = new son();
//        son s1 = new GrandFather();
//        son s2 = new Father();


    }
}
