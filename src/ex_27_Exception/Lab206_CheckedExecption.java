package ex_27_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_CheckedExecption {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("C://input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Hi");
        }
    }
}
