package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab231_ArrayLisy_95 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bred");
        list.add("milk");
        list.add("butter");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));
    }
}
