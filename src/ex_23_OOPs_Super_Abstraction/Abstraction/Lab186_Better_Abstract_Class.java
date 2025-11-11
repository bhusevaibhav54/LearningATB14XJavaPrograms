package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab186_Better_Abstract_Class {
    public static void main(String[] args) {
        Alto a = new Alto();
        a.drive();

    }
}


abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyre,Gear,Engine{

    void drive(){
        rubberTyre();
        blackcolorDoToTyre();
        this.startCar();
        startEngine();
        changeGear();
        this.stopCar();
    }


    @Override
    void startCar() {
        System.out.println("Start Car");
    }

    @Override
    void stopCar() {
        System.out.println("Stop Car");
    }

    @Override
    public void changeGear() {
        System.out.println("change gear");
    }

    @Override
    public void rubberTyre() {
        System.out.println("rubber tyre");
    }

    @Override
    public void blackcolorDoToTyre() {
        System.out.println("blackcolorDoToTyre the Car");
    }

    @Override
    public void startEngine() {

    }
}

interface Tyre{
    void rubberTyre();
    void blackcolorDoToTyre();
}

interface Gear{
    void changeGear();
}

interface Engine{
    void startEngine();
}