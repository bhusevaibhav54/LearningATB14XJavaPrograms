package ex_29_Generics;

public class Lab225_Generics {
    public static void main(String[] args) {
        System.out.println(temp(3,4));
        System.out.println(temp(3.34,4.45));
        System.out.println(temp("Pramod"," Duttla"));
    }

    static <Pramod> Pramod temp(Pramod a,Pramod b){
        return null;
    }
}
