package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();     //hashing mechanism
        //7878 7878 7845

        hs.add("Pramod");   //asasdfdasdasdasdsad
        hs.add("Pramod");   //asasdfdasdasdasdsad
        hs.add("Dramod");   //dfsasddsadadasdasss
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
    }
}
