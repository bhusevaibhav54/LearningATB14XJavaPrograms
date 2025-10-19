package ex_13_Functions;

public class Lab133_InterviewQ {
    public static void main(String[] args) {
        main("Vaibhav");

        int result =  main(10);
        System.out.println(result);

        boolean result1 =  main(false);
        System.out.println(result1);
    }

    public static void main(String args){
        System.out.println("in main method with string type args" +args);
    }

    public static int main(int args){
        return 10;
    }

    public static boolean main(boolean args){
        return true;
    }
}
