package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab230_List {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.contains("3"));
        System.out.println(list.lastIndexOf("3"));


    }
}
