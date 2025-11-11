package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab189_Multiple_Inheritance_Solved {

}

class child1 implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("child money!");
    }
}

interface Father1{
    void money();
}

interface Father2{
    void money();
}