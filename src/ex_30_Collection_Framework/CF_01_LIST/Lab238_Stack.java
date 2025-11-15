package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        //LIFO

        Stack s = new Stack<>();
        s.add("Pramod");
        s.add("Datta");
        s.add("Amit");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("chetan");
        s.add("chetan");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
