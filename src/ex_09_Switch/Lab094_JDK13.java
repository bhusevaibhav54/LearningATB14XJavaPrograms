package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,003:
                System.out.println("All items are electronic gadgets");
                break;
            case 004,006,007:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
