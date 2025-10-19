package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
//type 1 function call
        wop_wor_greet();

//type 2 function call
        String msg = wop_wr_greet2();
        System.out.println(msg);

//type 3 function call
        greet_with_details("Vaibhav",12,10000);
        greet_with_details("Vaibhav Bhuse",21,20000);

//type 4 function call
        int sum1 = sum_of_two_numbers(45,58);
        int sum2 = sum_of_three_numbers(1245,12547,4545);
        float sum3 = sum_of_three_numbers_fload(12.124f,4754.548f,45745.44f);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
//    without parameter and without return
    static void wop_wor_greet(){
        System.out.println("Type 1 Function");
        System.out.println("Hi, There");
    }

    //    without parameter but with return
    static String wop_wr_greet2(){
        System.out.println("Type 2 Function");
        return "Hi, How are you";
    }
    //    with parameter and without return
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your Name: " +name + "\nYour age is: " +age + "\n your salary is: " +salary);
    }

    //    with parameter and with return
    static int sum_of_two_numbers(int a, int b){
        return  a+b;
    }

    static int sum_of_three_numbers(int a, int b, int c){
        return  a+b+c;
    }

    static float sum_of_three_numbers_fload(float a, float b, float c){
        return a+b+c;
    }
}
