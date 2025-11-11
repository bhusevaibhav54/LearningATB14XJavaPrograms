package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car tesla = new Car(300);
        tesla.drive();
    }
}

















class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("DC");
    }

    Vehicle(int a){
        System.out.println("Param Con");
    }

    Vehicle(int a, int b){
        System.out.println("Param con1");
    }

    void message(){
        System.out.println("No return, NoArgs");
    }

    void message(int a){
        System.out.println("PC-args");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }

}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("PC Car");
    }

    void test(){

    }

    @Override
    void drive(){
        System.out.println("overriden the vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}
