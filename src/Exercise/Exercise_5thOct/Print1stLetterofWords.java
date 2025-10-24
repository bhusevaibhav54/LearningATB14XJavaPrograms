package Exercise.Exercise_5thOct;

public class Print1stLetterofWords {
    public static void main(String[] args) {
        String s1 = "My Name is Vaibhav Bhuse";

        String[] words = s1.trim().split("\\s+");
        int totaWords = words.length;
        String s1st = "";

        for (int i = 0; i < totaWords; i++) {
            s1st = s1st + words[i].charAt(0);
        }
        System.out.println("String with every 1st character of each words in given string is: " +s1st);
    }
}
