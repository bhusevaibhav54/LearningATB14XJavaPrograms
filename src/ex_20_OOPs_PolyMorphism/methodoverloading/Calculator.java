package ex_20_OOPs_PolyMorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
       int result = c1.add(3,4);
        double result1 = c1.add(3.45,4.78);

        System.out.println(result);
        System.out.println(result1);
    }
}

class Calc{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}