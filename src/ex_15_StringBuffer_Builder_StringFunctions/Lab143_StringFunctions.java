package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Locale;

public class Lab143_StringFunctions {
    public static void main(String[] args) {
        String name = "Vaibhav";

        System.out.println(name.length());

        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10));      //exception will throw

        System.out.println(name.concat(" Bhuse"));

        System.out.println(name.contains("om"));

        System.out.println(name.equals("Vaibhav"));

        System.out.println(name);

        System.out.println(name.equalsIgnoreCase("vaibhav"));

        System.out.println(name.indexOf('i'));

        String s1 = "madam";

        System.out.println(s1.indexOf('m'));

        System.out.println(s1.replace('m','M'));

        System.out.println(name.substring(1,3));

        System.out.println(s1.toLowerCase(Locale.ROOT));

        System.out.println(s1.toUpperCase());

        System.out.println(s1.startsWith("S"));

        System.out.println(s1.endsWith("m"));

        String name3 = "    Vaibhav Bhuse   ";
        System.out.println(name3.trim());

        System.out.println(name.compareTo("VaibhaV"));

        System.out.println(name);

//        ================================================================================
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}
