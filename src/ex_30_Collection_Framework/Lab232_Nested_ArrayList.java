package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        // fruits1.add(133);
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("tamato");
        vegetables.add("patato");
        vegetables.add("onion");
        System.out.println(vegetables);

        List all_fruits_veg = new ArrayList();
        all_fruits_veg.add(fruits1);
        all_fruits_veg.add(fruits2);
        all_fruits_veg.add(vegetables);

        System.out.println(all_fruits_veg);
        System.out.println(all_fruits_veg.size());
    }
}
