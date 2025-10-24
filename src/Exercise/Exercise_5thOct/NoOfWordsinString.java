package Exercise.Exercise_5thOct;

public class NoOfWordsinString {
    public static void main(String[] args) {
        String user_input = "My name is vaibhav";

        String[] words = user_input.trim().split("\\s+");

        System.out.println("No of words :" +words.length);
    }
}
