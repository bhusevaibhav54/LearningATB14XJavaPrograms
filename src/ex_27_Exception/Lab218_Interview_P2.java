package ex_27_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_Interview_P2 {
    public static void main(String[] args) {
        try {
            FileReader f= new FileReader("C://abx.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
