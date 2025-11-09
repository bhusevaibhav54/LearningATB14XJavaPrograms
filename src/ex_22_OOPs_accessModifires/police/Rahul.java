package ex_22_OOPs_accessModifires.police;

public class Rahul extends cop {

    public Rahul(int bullet){
        super(bullet);
    }

    public static void main(String[] args) {
        cop p = new cop(100);
        p.thisDefaultF1();
    }

}
