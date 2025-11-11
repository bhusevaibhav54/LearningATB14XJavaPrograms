package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();
    }

}


class Car2 implements Break,Engine1{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}

interface Break{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("concreat complete");
    }

    default void testEngine1(){
        System.out.println("concreat complete");
    }
}