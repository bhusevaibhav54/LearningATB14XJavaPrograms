package ex_14_Strings;

public class LabStringExample1 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("abc"); //gives ascii value difference, if same it gives 0
        System.out.println(result);

        int idx = "Java".indexOf("a");
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("z-","Java","Python");
        System.out.println(s11);

        String s12 = "Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

        String b2 = "Java".concat("MAVA");
        System.out.println(b2);
    }
}
