package ex_06_Ternary_Oparator;

public class Lab059_RealAgeClassification {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        //input - String
        //String - Int

        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <=60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
