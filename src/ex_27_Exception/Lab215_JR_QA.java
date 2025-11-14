package ex_27_Exception;

public class Lab215_JR_QA {
    public static void main(String[] args) {
        String ip=null;
        try {
            ip = args[0];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        int a=0;
        try {
            a=Integer.parseInt(ip);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        int b=0;
        try {
            b=100/a;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
