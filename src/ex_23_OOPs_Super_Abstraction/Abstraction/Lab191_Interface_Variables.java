package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab191_Interface_Variables {
    public static void main(String[] args) {

    }
}

interface Pramod{
    int a = 10;
    void display();
}

class Dutta implements Pramod{
    int aa = 10;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}
