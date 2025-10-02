package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser:");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting with chrome");
                System.out.println("TC1");
                break;
            case "firefox":
                System.out.println("Starting with chrome");
                System.out.println("TC1");
                break;
            default:
                System.out.println("No browser specified");
                break;
        }
    }
}
