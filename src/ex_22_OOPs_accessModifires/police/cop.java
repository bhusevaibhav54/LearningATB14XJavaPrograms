package ex_22_OOPs_accessModifires.police;

public class cop {
    public int gun;
    private String iCard;

    public cop(int bullet){
        this.gun = bullet;
    }

    protected void canIShoot(){
        System.out.println("Yes, you can!");
    }

    void thisDefaultF1(){
        System.out.println("Hi, Cop!");
    }
}
