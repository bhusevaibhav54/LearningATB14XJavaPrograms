package ex_24_Static;

public class Lab195_Real {

}

class ATB14x{

    {
        System.out.println("IIB-this is called when object is created!");
        //what is the purpose
        //here we can write code related to
        //start the website
        //web automation or api automation
    }

    static {
        System.out.println("load the class, I will execute");
    }

    private String name;
    private String phone;

    static String cource_name = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocument(){
        System.out.println("Non static method");
        System.out.println(cource_name);
    }

    static void doAssignement(){
//        System.out.println(phone);    //static method cant access non statis
        System.out.println("Do assignment");
    }

}
