package ex_29_Generics;

import javax.xml.transform.Source;

public class Lab224 {
    public static void main(String[] args) {
        temp_sum_t(10,20);
        temp_sum_t(10.34,10.45);
        temp_sum_t("Pramod","Datta");
    }

    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static Double temp_sum(Double a, Double b){
        return a+b;
    }

    static <MODI>MODI  temp_sum_t(MODI a, MODI b){
        return null;
    }
}
