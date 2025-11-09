package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    Baby b1 = new Baby();

//    new Baby();
//    new Baby();
    Baby b2;

//    System.out.println(b2.name);
}


class Baby{
    String name;

    Baby(){
        System.out.println("I am called, Object is Created!");
    }
}